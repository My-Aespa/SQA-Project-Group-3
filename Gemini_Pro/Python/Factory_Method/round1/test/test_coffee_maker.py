import pytest

from coffee_maker import CoffeeFactory, Americano, Latte, Cappuccino, Espresso, Mocha

@pytest.fixture
def coffee_factory():
    return CoffeeFactory()

def test_create_americano(coffee_factory):
    coffee = coffee_factory.create_coffee("Americano")
    assert isinstance(coffee, Americano)
    assert coffee.name == "Americano"
    assert coffee.prepare() == "Adding hot water to espresso."
    assert coffee.serve() == "Serving a cup of Americano."

def test_create_latte(coffee_factory):
    coffee = coffee_factory.create_coffee("Latte")
    assert isinstance(coffee, Latte)
    assert coffee.name == "Latte"
    assert coffee.prepare() == "Adding steamed milk to espresso."
    assert coffee.serve() == "Serving a cup of Latte."

def test_create_cappuccino(coffee_factory):
    coffee = coffee_factory.create_coffee("Cappuccino")
    assert isinstance(coffee, Cappuccino)
    assert coffee.name == "Cappuccino"
    assert coffee.prepare() == "Adding steamed milk and foamed milk to espresso."
    assert coffee.serve() == "Serving a cup of Cappuccino."

def test_create_espresso(coffee_factory):
    coffee = coffee_factory.create_coffee("Espresso")
    assert isinstance(coffee, Espresso)
    assert coffee.name == "Espresso"
    assert coffee.prepare() == "Extracting espresso."
    assert coffee.serve() == "Serving a cup of Espresso."

def test_create_mocha(coffee_factory):
    coffee = coffee_factory.create_coffee("Mocha")
    assert isinstance(coffee, Mocha)
    assert coffee.name == "Mocha"
    assert coffee.prepare() == "Adding chocolate syrup, steamed milk, and foamed milk to espresso."
    assert coffee.serve() == "Serving a cup of Mocha."

def test_create_invalid_coffee(coffee_factory):
    with pytest.raises(ValueError) as excinfo:
        coffee_factory.create_coffee("Invalid Coffee")
    assert str(excinfo.value) == "Invalid coffee type."