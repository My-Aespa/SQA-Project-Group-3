import pytest
from your_module import (  # เปลี่ยน 'your_module' เป็นชื่อโมดูลของคุณ
    MenuItem, Espresso, Latte, Milkshakes, FruitJuices,
    Croissant, ChocolateCake, ChocolateChipCookies,
    TunaSandwich, Spaghetti, VegetableSalad,
    CafeOrder
)

def test_create_item_beverage():
    order = CafeOrder()
    espresso = order.create_item("Espresso")
    assert isinstance(espresso, Espresso)

def test_create_item_pastry():
    order = CafeOrder()
    chocolate_cake = order.create_item("Chocolate Cake")
    assert isinstance(chocolate_cake, ChocolateCake)

def test_create_item_snack():
    order = CafeOrder()
    tuna_sandwich = order.create_item("Tuna Sandwich")
    assert isinstance(tuna_sandwich, TunaSandwich)

def test_create_item_invalid():
    order = CafeOrder()
    invalid_item = order.create_item("Invalid")
    assert invalid_item is None

def test_add_item():
    order = CafeOrder()
    order.add_item("Espresso")
    assert isinstance(order.order[0], Espresso)

def test_serve_order():
    order = CafeOrder()
    order.add_item("Espresso")
    order.add_item("Chocolate Cake")
    order.add_item("Tuna Sandwich")
    order.serve_order()
    assert "เสิร์ฟ เอสเปรสโซ" in capsys.readouterr().out
    assert "เสิร์ฟ เค้กช็อกโกแลต" in capsys.readouterr().out
    assert "เสิร์ฟ แซนวิชทูน่า" in capsys.readouterr().out