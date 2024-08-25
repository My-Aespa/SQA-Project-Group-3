# test_menu_factory.py

import pytest
from menu_factory import BeverageFactory, PastryFactory, SnackFactory
from menu_items import *

def test_beverage_factory():
    assert isinstance(BeverageFactory.create_beverage("Espresso"), Espresso)
    assert isinstance(BeverageFactory.create_beverage("Cappuccino"), Cappuccino)
    assert isinstance(BeverageFactory.create_beverage("Latte"), Latte)
    assert isinstance(BeverageFactory.create_beverage("Mocha"), Mocha)
    assert isinstance(BeverageFactory.create_beverage("Americano"), Americano)
    assert isinstance(BeverageFactory.create_beverage("Black Tea"), BlackTea)
    assert isinstance(BeverageFactory.create_beverage("Green Tea"), GreenTea)
    assert isinstance(BeverageFactory.create_beverage("Oolong Tea"), OolongTea)
    assert isinstance(BeverageFactory.create_beverage("Lemon Tea"), LemonTea)
    assert isinstance(BeverageFactory.create_beverage("Fruit Smoothies"), FruitSmoothies)
    assert isinstance(BeverageFactory.create_beverage("Milkshakes"), Milkshakes)
    assert isinstance(BeverageFactory.create_beverage("Fruit Juices"), FruitJuices)
    assert BeverageFactory.create_beverage("Non-existent") is None

def test_pastry_factory():
    assert isinstance(PastryFactory.create_pastry("Croissant"), Croissant)
    assert isinstance(PastryFactory.create_pastry("Bun"), Bun)
    assert isinstance(PastryFactory.create_pastry("Custard Bread"), CustardBread)
    assert isinstance(PastryFactory.create_pastry("Chocolate Cake"), ChocolateCake)
    assert isinstance(PastryFactory.create_pastry("Strawberry Cake"), StrawberryCake)
    assert isinstance(PastryFactory.create_pastry("Coconut Cake"), CoconutCake)
    assert isinstance(PastryFactory.create_pastry("Chocolate Chip Cookies"), ChocolateChipCookies)
    assert isinstance(PastryFactory.create_pastry("Oat Cookies"), OatCookies)
    assert PastryFactory.create_pastry("Non-existent") is None

def test_snack_factory():
    assert isinstance(SnackFactory.create_snack("Chicken Sandwich"), ChickenSandwich)
    assert isinstance(SnackFactory.create_snack("Tuna Sandwich"), TunaSandwich)
    assert isinstance(SnackFactory.create_snack("Spaghetti"), Spaghetti)
    assert isinstance(SnackFactory.create_snack("Penne"), Penne)
    assert isinstance(SnackFactory.create_snack("Vegetable Salad"), VegetableSalad)
    assert isinstance(SnackFactory.create_snack("Chicken Salad"), ChickenSalad)
    assert SnackFactory.create_snack("Non-existent") is None
