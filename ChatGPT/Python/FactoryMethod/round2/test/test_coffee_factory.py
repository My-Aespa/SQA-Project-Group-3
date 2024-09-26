# test_coffee_factory.py

import pytest
from coffee_factory import Americano, Latte, Cappuccino, Espresso, Mocha, CoffeeFactory

# Testing each concrete coffee class
@pytest.mark.parametrize("coffee_class,expected_prepare,expected_serve", [
    (Americano, "Preparing Americano: Brewing water and adding espresso.", "Serving Americano in a standard cup."),
    (Latte, "Preparing Latte: Steaming milk and adding to espresso.", "Serving Latte in a tall glass with milk foam."),
    (Cappuccino, "Preparing Cappuccino: Steaming milk, adding to espresso, and topping with milk foam.", "Serving Cappuccino in a wide cup with a sprinkle of cocoa powder."),
    (Espresso, "Preparing Espresso: Brewing a shot of espresso.", "Serving Espresso in a small cup."),
    (Mocha, "Preparing Mocha: Adding chocolate syrup to espresso and topping with steamed milk.", "Serving Mocha in a mug with whipped cream."),
])
def test_coffee_prepare_serve(coffee_class, expected_prepare, expected_serve):
    coffee = coffee_class()
    assert coffee.prepare() == expected_prepare
    assert coffee.serve() == expected_serve

# Testing the CoffeeFactory
def test_coffee_factory():
    factory = CoffeeFactory()
    assert isinstance(factory.create_coffee("Americano"), Americano)
    assert isinstance(factory.create_coffee("Latte"), Latte)
    assert isinstance(factory.create_coffee("Cappuccino"), Cappuccino)
    assert isinstance(factory.create_coffee("Espresso"), Espresso)
    assert isinstance(factory.create_coffee("Mocha"), Mocha)

def test_coffee_factory_invalid_type():
    factory = CoffeeFactory()
    with pytest.raises(ValueError):
        factory.create_coffee("Tea")  # Invalid coffee type should raise ValueError

# Run pytest to check coverage
if __name__ == "__main__":
    pytest.main()
