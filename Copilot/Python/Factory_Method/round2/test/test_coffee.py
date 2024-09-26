# test_coffee.py
import pytest
from coffee import CoffeeFactory, Americano, Latte, Cappuccino, Espresso, Mocha

def test_americano():
    coffee = CoffeeFactory.create_coffee("Americano")
    assert isinstance(coffee, Americano)
    assert coffee.prepare() == "Preparing Americano"
    assert coffee.serve() == "Serving Americano"

def test_latte():
    coffee = CoffeeFactory.create_coffee("Latte")
    assert isinstance(coffee, Latte)
    assert coffee.prepare() == "Preparing Latte"
    assert coffee.serve() == "Serving Latte"

def test_cappuccino():
    coffee = CoffeeFactory.create_coffee("Cappuccino")
    assert isinstance(coffee, Cappuccino)
    assert coffee.prepare() == "Preparing Cappuccino"
    assert coffee.serve() == "Serving Cappuccino"

def test_espresso():
    coffee = CoffeeFactory.create_coffee("Espresso")
    assert isinstance(coffee, Espresso)
    assert coffee.prepare() == "Preparing Espresso"
    assert coffee.serve() == "Serving Espresso"

def test_mocha():
    coffee = CoffeeFactory.create_coffee("Mocha")
    assert isinstance(coffee, Mocha)
    assert coffee.prepare() == "Preparing Mocha"
    assert coffee.serve() == "Serving Mocha"

def test_unknown_coffee():
    with pytest.raises(ValueError):
        CoffeeFactory.create_coffee("Unknown")

if __name__ == "__main__":
    pytest.main()