# test_cafe.py
import pytest
from cafe import Cafe
from beverages import Espresso, Latte
from pastries import Croissant
from snacks import TunaSandwich

def test_order_beverage():
    cafe = Cafe()
    item = cafe.order_item("Beverage", "Espresso")
    assert isinstance(item, Espresso)
    item.serve()

def test_order_pastry():
    cafe = Cafe()
    item = cafe.order_item("Pastry", "Croissant")
    assert isinstance(item, Croissant)
    item.serve()

def test_order_snack():
    cafe = Cafe()
    item = cafe.order_item("Snack", "Tuna Sandwich")
    assert isinstance(item, TunaSandwich)
    item.serve()

def test_unknown_beverage():
    cafe = Cafe()
    with pytest.raises(ValueError):
        cafe.order_item("Beverage", "Unknown")

def test_unknown_pastry():
    cafe = Cafe()
    with pytest.raises(ValueError):
        cafe.order_item("Pastry", "Unknown")

def test_unknown_snack():
    cafe = Cafe()
    with pytest.raises(ValueError):
        cafe.order_item("Snack", "Unknown")

def test_unknown_category():
    cafe = Cafe()
    with pytest.raises(ValueError):
        cafe.order_item("Unknown", "Espresso")