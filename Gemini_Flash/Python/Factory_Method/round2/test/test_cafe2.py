import pytest
from your_module import (  # เปลี่ยน 'your_module' เป็นชื่อโมดูลของคุณ
    MenuItem, Coffee, Tea, ColdBeverage,
    Bread, Cake, Cookies,
    Sandwiches, Pasta, Salads,
    CafeOrder
)

def test_coffee_prepare():
    coffee = Coffee("Espresso")
    coffee.prepare()
    assert "กำลังเตรียม Espresso กาแฟ" in capsys.readouterr().out

def test_tea_prepare():
    tea = Tea("ชาเขียว")
    tea.prepare()
    assert "กำลังเตรียม ชาเขียว ชา" in capsys.readouterr().out

def test_cold_beverage_prepare():
    cold_beverage = ColdBeverage("สมูทตี้ผลไม้")
    cold_beverage.prepare()
    assert "กำลังเตรียม สมูทตี้ผลไม้ เครื่องดื่มเย็น" in capsys.readouterr().out

def test_bread_prepare():
    bread = Bread("ครัวซองต์")
    bread.prepare()
    assert "กำลังเตรียม ครัวซองต์ ขนมปัง" in capsys.readouterr().out

def test_cake_prepare():
    cake = Cake("เค้กช็อกโกแลต")
    cake.prepare()
    assert "กำลังเตรียม เค้กช็อกโกแลต เค้ก" in capsys.readouterr().out

def test_cookies_prepare():
    cookies = Cookies("คุกกี้ช็อกโกแลตชิป")
    cookies.prepare()
    assert "กำลังเตรียม คุกกี้ช็อกโกแลตชิป คุกกี้" in capsys.readouterr().out

def test_sandwiches_prepare():
    sandwiches = Sandwiches("แซนวิชไก่")
    sandwiches.prepare()
    assert "กำลังเตรียม แซนวิชไก่ แซนวิช" in capsys.readouterr().out

def test_pasta_prepare():
    pasta = Pasta("สปาเก็ตตี้")
    pasta.prepare()
    assert "กำลังเตรียม สปาเก็ตตี้ พาสต้า" in capsys.readouterr().out

def test_salads_prepare():
    salads = Salads("สลัดผัก")
    salads.prepare()
    assert "กำลังเตรียม สลัดผัก สลัด" in capsys.readouterr().out

def test_cafe_order_create_item_beverage():
    order = CafeOrder()
    coffee = order.create_item("Beverage", "Coffee")
    assert isinstance(coffee, Coffee)

def test_cafe_order_create_item_pastry():
    order = CafeOrder()
    cake = order.create_item("Pastry", "Cake")
    assert isinstance(cake, Cake)

def test_cafe_order_create_item_snack():
    order = CafeOrder()
    sandwiches = order.create_item("Snack", "Sandwiches")
    assert isinstance(sandwiches, Sandwiches)

def test_cafe_order_create_item_invalid():
    order = CafeOrder()
    item = order.create_item("Invalid", "Invalid")
    assert item is None

def test_cafe_order_add_item():
    order = CafeOrder()
    order.add_item("Beverage", "Coffee")
    assert isinstance(order.order[0], Coffee)

def test_cafe_order_prepare_order():
    order = CafeOrder()
    order.add_item("Beverage", "Coffee")
    order.add_item("Pastry", "Cake")
    order.add_item("Snack", "Sandwiches")
    order.prepare_order()
    assert "กำลังเตรียม Coffee กาแฟ" in capsys.readouterr().out
    assert "กำลังเตรียม Cake เค้ก" in capsys.readouterr().out
    assert "กำลังเตรียม Sandwiches แซนวิช" in capsys.readouterr().out