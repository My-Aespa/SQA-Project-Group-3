import pytest
from cafe import Cafe, Coffee, Tea, ColdBeverage, Bread, Cake, Cookie, Sandwich, Pasta, Salad

def test_cafe_create_coffee():
    cafe = Cafe()
    coffee = cafe.create_item("Coffee", "Espresso")
    assert isinstance(coffee, Coffee)
    assert coffee.prepare() == "Preparing Espresso coffee"

def test_cafe_create_tea():
    cafe = Cafe()
    tea = cafe.create_item("Tea", "Green Tea")
    assert isinstance(tea, Tea)
    assert tea.prepare() == "Preparing Green Tea tea"

def test_cafe_create_cold_beverage():
    cafe = Cafe()
    cold_beverage = cafe.create_item("ColdBeverage", "Fruit Smoothies")
    assert isinstance(cold_beverage, ColdBeverage)
    assert cold_beverage.prepare() == "Preparing Fruit Smoothies"

def test_cafe_create_bread():
    cafe = Cafe()
    bread = cafe.create_item("Bread", "Croissant")
    assert isinstance(bread, Bread)
    assert bread.prepare() == "Preparing Croissant bread"

def test_cafe_create_cake():
    cafe = Cafe()
    cake = cafe.create_item("Cake", "Chocolate Cake")
    assert isinstance(cake, Cake)
    assert cake.prepare() == "Preparing Chocolate Cake cake"

def test_cafe_create_cookie():
    cafe = Cafe()
    cookie = cafe.create_item("Cookie", "Chocolate Chip Cookies")
    assert isinstance(cookie, Cookie)
    assert cookie.prepare() == "Preparing Chocolate Chip Cookies cookies"

def test_cafe_create_sandwich():
    cafe = Cafe()
    sandwich = cafe.create_item("Sandwich", "Chicken Sandwich")
    assert isinstance(sandwich, Sandwich)
    assert sandwich.prepare() == "Preparing Chicken Sandwich sandwich"

def test_cafe_create_pasta():
    cafe = Cafe()
    pasta = cafe.create_item("Pasta", "Spaghetti")
    assert isinstance(pasta, Pasta)
    assert pasta.prepare() == "Preparing Spaghetti pasta"

def test_cafe_create_salad():
    cafe = Cafe()
    salad = cafe.create_item("Salad", "Chicken Salad")
    assert isinstance(salad, Salad)
    assert salad.prepare() == "Preparing Chicken Salad salad"

def test_cafe_create_invalid_item():
    cafe = Cafe()
    invalid_item = cafe.create_item("InvalidCategory", "InvalidItem")
    assert invalid_item is None