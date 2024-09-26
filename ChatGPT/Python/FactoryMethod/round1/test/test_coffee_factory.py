# test_coffee_factory.py
import pytest
from coffee_factory import order_coffee, CoffeeFactory, Americano, Latte, Cappuccino, Espresso, Mocha

def test_order_americano():
    result = order_coffee("Americano")
    assert result == "Preparing an Americano\nServing an Americano"

def test_order_latte():
    result = order_coffee("Latte")
    assert result == "Preparing a Latte\nServing a Latte"

def test_order_cappuccino():
    result = order_coffee("Cappuccino")
    assert result == "Preparing a Cappuccino\nServing a Cappuccino"

def test_order_espresso():
    result = order_coffee("Espresso")
    assert result == "Preparing an Espresso\nServing an Espresso"

def test_order_mocha():
    result = order_coffee("Mocha")
    assert result == "Preparing a Mocha\nServing a Mocha"

def test_unknown_coffee_type():
    result = order_coffee("Unknown")
    assert result == "Unknown coffee type: unknown"

def test_factory_creates_americano():
    coffee = CoffeeFactory.create_coffee("Americano")
    assert isinstance(coffee, Americano)

def test_factory_creates_latte():
    coffee = CoffeeFactory.create_coffee("Latte")
    assert isinstance(coffee, Latte)

def test_factory_creates_cappuccino():
    coffee = CoffeeFactory.create_coffee("Cappuccino")
    assert isinstance(coffee, Cappuccino)

def test_factory_creates_espresso():
    coffee = CoffeeFactory.create_coffee("Espresso")
    assert isinstance(coffee, Espresso)

def test_factory_creates_mocha():
    coffee = CoffeeFactory.create_coffee("Mocha")
    assert isinstance(coffee, Mocha)

def test_factory_raises_error_for_unknown_coffee():
    with pytest.raises(ValueError):
        CoffeeFactory.create_coffee("Unknown")
