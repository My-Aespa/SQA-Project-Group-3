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

def test_cafe_order_create_item_beverage_coffee():
    order = CafeOrder()
    coffee = order.create_item("Beverage", "Espresso")
    assert isinstance(coffee, Coffee)
    assert coffee.type == "Espresso"

def test_cafe_order_create_item_beverage_tea():
    order = CafeOrder()
    tea = order.create_item("Beverage", "Green Tea")
    assert isinstance(tea, Tea)
    assert tea.type == "Green Tea"

def test_cafe_order_create_item_beverage_cold():
    order = CafeOrder()
    cold_beverage = order.create_item("Beverage", "Fruit Smoothies")
    assert isinstance(cold_beverage, ColdBeverage)
    assert cold_beverage.type == "Fruit Smoothies"

def test_cafe_order_create_item_pastry_bread():
    order = CafeOrder()
    bread = order.create_item("Pastry", "Croissant")
    assert isinstance(bread, Bread)
    assert bread.type == "Croissant"

def test_cafe_order_create_item_pastry_cake():
    order = CafeOrder()
    cake = order.create_item("Pastry", "Chocolate Cake")
    assert isinstance(cake, Cake)
    assert cake.type == "Chocolate Cake"

def test_cafe_order_create_item_pastry_cookies():
    order = CafeOrder()
    cookies = order.create_item("Pastry", "Chocolate Chip Cookies")
    assert isinstance(cookies, Cookies)
    assert cookies.type == "Chocolate Chip Cookies"

def test_cafe_order_create_item_snack_sandwiches():
    order = CafeOrder()
    sandwiches = order.create_item("Snack", "Chicken Sandwich")
    assert isinstance(sandwiches, Sandwiches)
    assert sandwiches.type == "Chicken Sandwich"

def test_cafe_order_create_item_snack_pasta():
    order = CafeOrder()
    pasta = order.create_item("Snack", "Spaghetti")
    assert isinstance(pasta, Pasta)
    assert pasta.type == "Spaghetti"

def test_cafe_order_create_item_snack_salads():
    order = CafeOrder()
    salads = order.create_item("Snack", "Vegetable Salad")
    assert isinstance(salads, Salads)
    assert salads.type == "Vegetable Salad"

def test_cafe_order_create_item_invalid():
    order = CafeOrder()
    item = order.create_item("Invalid", "Invalid")
    assert item is None

def test_cafe_order_add_item():
    order = CafeOrder()
    order.add_item("Beverage", "Espresso")
    assert isinstance(order.order[0], Coffee)
    assert order.order[0].type == "Espresso"

def test_cafe_order_prepare_order():
    order = CafeOrder()
    order.add_item("Beverage", "Espresso")
    order.add_item("Pastry", "Chocolate Cake")
    order.add_item("Snack", "Chicken Sandwich")
    order.prepare_order()
    assert "กำลังเตรียม Espresso กาแฟ" in capsys.readouterr().out
    assert "กำลังเตรียม Chocolate Cake เค้ก" in capsys.readouterr().out
    assert "กำลังเตรียม Chicken Sandwich แซนวิช" in capsys.readouterr().out