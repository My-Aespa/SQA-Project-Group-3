# CafeTest.py
import pytest
from Cafe1 import BeverageFactory, PastryFactory, SnackFactory, order_item  # นำเข้าฟังก์ชันและคลาสที่ต้องการทดสอบจากไฟล์ Cafe.py

# Test Cases
def test_order_espresso():
    factory = BeverageFactory()
    assert order_item(factory, "Espresso") == "Preparing Espresso"

def test_order_latte():
    factory = BeverageFactory()
    assert order_item(factory, "Latte") == "Preparing Latte"

def test_order_milkshakes():
    factory = BeverageFactory()
    assert order_item(factory, "Milkshakes") == "Preparing Milkshakes"

def test_order_fruit_juices():
    factory = BeverageFactory()
    assert order_item(factory, "Fruit Juices") == "Preparing Fruit Juices"

def test_order_croissant():
    factory = PastryFactory()
    assert order_item(factory, "Croissant") == "Preparing Croissant"

def test_order_chocolate_cake():
    factory = PastryFactory()
    assert order_item(factory, "Chocolate Cake") == "Preparing Chocolate Cake"

def test_order_chocolate_chip_cookies():
    factory = PastryFactory()
    assert order_item(factory, "Chocolate Chip Cookies") == "Preparing Chocolate Chip Cookies"

def test_order_tuna_sandwich():
    factory = SnackFactory()
    assert order_item(factory, "Tuna Sandwich") == "Preparing Tuna Sandwich"

def test_order_spaghetti():
    factory = SnackFactory()
    assert order_item(factory, "Spaghetti") == "Preparing Spaghetti"

def test_order_vegetable_salad():
    factory = SnackFactory()
    assert order_item(factory, "Vegetable Salad") == "Preparing Vegetable Salad"

def test_order_invalid_item():
    factory = BeverageFactory()
    assert order_item(factory, "Invalid Item") == "Item not available"