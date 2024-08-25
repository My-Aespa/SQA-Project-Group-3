# unit_test/test_menu_factory.py

import pytest
from menu_items import *
from menu_factory import *

def test_coffee_factory():
    factory = CoffeeFactory()
    assert factory.create_beverage().prepare() == "Preparing coffee"

def test_tea_factory():
    factory = TeaFactory()
    assert factory.create_beverage().prepare() == "Preparing tea"

def test_cold_beverage_factory():
    factory = ColdBeverageFactory()
    assert factory.create_beverage().prepare() == "Preparing cold beverage"

def test_bread_factory():
    factory = BreadFactory()
    assert factory.create_pastry().bake() == "Baking bread"

def test_cake_factory():
    factory = CakeFactory()
    assert factory.create_pastry().bake() == "Baking cake"

def test_cookie_factory():
    factory = CookieFactory()
    assert factory.create_pastry().bake() == "Baking cookie"

def test_sandwich_factory():
    factory = SandwichFactory()
    assert factory.create_snack().serve() == "Serving sandwich"

def test_pasta_factory():
    factory = PastaFactory()
    assert factory.create_snack().serve() == "Serving pasta"

def test_salad_factory():
    factory = SaladFactory()
    assert factory.create_snack().serve() == "Serving salad"
