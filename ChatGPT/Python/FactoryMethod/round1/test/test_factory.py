# test_factory.py

import pytest
from product import Product
from factory import BeverageFactory, PastryFactory, SnackFactory

def test_beverage_factory():
    factory = BeverageFactory()
    
    assert factory.create_beverage("Espresso").serve() == "Serving Espresso"
    assert factory.create_beverage("Latte").serve() == "Serving Latte"
    assert factory.create_beverage("Milkshakes").serve() == "Serving Milkshakes"
    assert factory.create_beverage("Fruit Juices").serve() == "Serving Fruit Juices"

def test_pastry_factory():
    factory = PastryFactory()
    
    assert factory.create_pastry("Croissant").serve() == "Serving Croissant"
    assert factory.create_pastry("Chocolate Cake").serve() == "Serving Chocolate Cake"
    assert factory.create_pastry("Chocolate Chip Cookies").serve() == "Serving Chocolate Chip Cookies"

def test_snack_factory():
    factory = SnackFactory()
    
    assert factory.create_snack("Tuna Sandwich").serve() == "Serving Tuna Sandwich"
    assert factory.create_snack("Spaghetti").serve() == "Serving Spaghetti"
    assert factory.create_snack("Vegetable Salad").serve() == "Serving Vegetable Salad"

def test_invalid_order():
    factory = BeverageFactory()
    
    with pytest.raises(ValueError):
        factory.create_beverage("Unknown")

    factory = PastryFactory()
    
    with pytest.raises(ValueError):
        factory.create_pastry("Unknown")

    factory = SnackFactory()
    
    with pytest.raises(ValueError):
        factory.create_snack("Unknown")
