import pytest
from cafe import Cafe
from beverages import Espresso, Latte, Milkshakes, FruitJuices
from pastries import Croissant, ChocolateCake, ChocolateChipCookies
from snacks import TunaSandwich, Spaghetti, VegetableSalad

def test_order_beverage():
    cafe = Cafe()
    item = cafe.order_item("Beverage", "Espresso")
    assert isinstance(item, Espresso)
    item.serve()

    item = cafe.order_item("Beverage", "Latte")
    assert isinstance(item, Latte)
    item.serve()

    item = cafe.order_item("Beverage", "Milkshakes")
    assert isinstance(item, Milkshakes)
    item.serve()

    item = cafe.order_item("Beverage", "Fruit Juices")
    assert isinstance(item, FruitJuices)
    item.serve()

def test_order_pastry():
    cafe = Cafe()
    item = cafe.order_item("Pastry", "Croissant")
    assert isinstance(item, Croissant)
    item.serve()

    item = cafe.order_item("Pastry", "Chocolate Cake")
    assert isinstance(item, ChocolateCake)
    item.serve()

    item = cafe.order_item("Pastry", "Chocolate Chip Cookies")
    assert isinstance(item, ChocolateChipCookies)
    item.serve()

def test_order_snack():
    cafe = Cafe()
    item = cafe.order_item("Snack", "Tuna Sandwich")
    assert isinstance(item, TunaSandwich)
    item.serve()

    item = cafe.order_item("Snack", "Spaghetti")
    assert isinstance(item, Spaghetti)
    item.serve()

    item = cafe.order_item("Snack", "Vegetable Salad")
    assert isinstance(item, VegetableSalad)
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