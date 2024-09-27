import sys
import os 
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'source')))
import pytest
from coffee_shop import CoffeeFactory, Americano, Latte, Cappuccino, Espresso, Mocha

def test_create_americano():
    coffee = CoffeeFactory.create_coffee("Americano")
    assert isinstance(coffee, Americano)

def test_create_latte():
    coffee = CoffeeFactory.create_coffee("Latte")
    assert isinstance(coffee, Latte)

def test_create_cappuccino():
    coffee = CoffeeFactory.create_coffee("Cappuccino")
    assert isinstance(coffee, Cappuccino)

def test_create_espresso():
    coffee = CoffeeFactory.create_coffee("Espresso")
    assert isinstance(coffee, Espresso)

def test_create_mocha():
    coffee = CoffeeFactory.create_coffee("Mocha")
    assert isinstance(coffee, Mocha)

def test_invalid_coffee_type():
    with pytest.raises(ValueError):
        CoffeeFactory.create_coffee("InvalidCoffee")