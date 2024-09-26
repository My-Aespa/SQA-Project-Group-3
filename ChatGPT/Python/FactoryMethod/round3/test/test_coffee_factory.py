# test_coffee_factory.py
import pytest
from coffee_factory import CoffeeFactory, order_coffee, Americano, Latte, Cappuccino, Espresso, Mocha

# Test each type of coffee creation and serving
def test_americano():
    coffee = CoffeeFactory.create_coffee("americano")
    assert isinstance(coffee, Americano)
    assert coffee.prepare() == "Preparing Americano: adding hot water to espresso."
    assert coffee.serve() == "Serving Americano: in a regular cup."

def test_latte():
    coffee = CoffeeFactory.create_coffee("latte")
    assert isinstance(coffee, Latte)
    assert coffee.prepare() == "Preparing Latte: adding steamed milk to espresso."
    assert coffee.serve() == "Serving Latte: in a tall cup with foam on top."

def test_cappuccino():
    coffee = CoffeeFactory.create_coffee("cappuccino")
    assert isinstance(coffee, Cappuccino)
    assert coffee.prepare() == "Preparing Cappuccino: adding equal parts of steamed milk and foam to espresso."
    assert coffee.serve() == "Serving Cappuccino: in a small cup with a sprinkle of cocoa powder."

def test_espresso():
    coffee = CoffeeFactory.create_coffee("espresso")
    assert isinstance(coffee, Espresso)
    assert coffee.prepare() == "Preparing Espresso: brewing a small amount of coffee."
    assert coffee.serve() == "Serving Espresso: in a shot glass."

def test_mocha():
    coffee = CoffeeFactory.create_coffee("mocha")
    assert isinstance(coffee, Mocha)
    assert coffee.prepare() == "Preparing Mocha: adding chocolate syrup to espresso and steamed milk."
    assert coffee.serve() == "Serving Mocha: in a mug with whipped cream."

# Test for invalid coffee type
def test_invalid_coffee():
    with pytest.raises(ValueError):
        CoffeeFactory.create_coffee("invalid")

# Test client code `order_coffee`
def test_order_coffee_americano():
    preparation, serving = order_coffee("americano")
    assert preparation == "Preparing Americano: adding hot water to espresso."
    assert serving == "Serving Americano: in a regular cup."

def test_order_coffee_invalid():
    result = order_coffee("invalid")
    assert result == "Coffee type 'invalid' is not recognized."

