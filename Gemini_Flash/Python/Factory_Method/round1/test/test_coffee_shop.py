# Test Cases
import pytest

def test_americano():
    coffee = CoffeeFactory.create_coffee("Americano")
    assert isinstance(coffee, Americano)

def test_latte():
    coffee = CoffeeFactory.create_coffee("Latte")
    assert isinstance(coffee, Latte)

def test_cappuccino():
    coffee = CoffeeFactory.create_coffee("Cappuccino")
    assert isinstance(coffee, Cappuccino)

def test_espresso():
    coffee = CoffeeFactory.create_coffee("Espresso")
    assert isinstance(coffee, Espresso)

def test_mocha():
    coffee = CoffeeFactory.create_coffee("Mocha")
    assert isinstance(coffee, Mocha)

def test_invalid_coffee_type():
    with pytest.raises(ValueError):
        CoffeeFactory.create_coffee("Invalid Coffee")