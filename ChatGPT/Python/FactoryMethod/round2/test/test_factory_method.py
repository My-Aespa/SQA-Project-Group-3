# test_factory_method.py

import pytest
from factory_method import (
    EspressoFactory, LatteFactory, MilkshakesFactory, FruitJuicesFactory,
    CroissantFactory, ChocolateCakeFactory, ChocolateChipCookiesFactory,
    TunaSandwichFactory, SpaghettiFactory, VegetableSaladFactory
)

def test_beverage_factories():
    espresso = EspressoFactory().create_beverage()
    assert espresso.prepare() == "Preparing Espresso"

    latte = LatteFactory().create_beverage()
    assert latte.prepare() == "Preparing Latte"

    milkshakes = MilkshakesFactory().create_beverage()
    assert milkshakes.prepare() == "Preparing Milkshakes"

    fruit_juices = FruitJuicesFactory().create_beverage()
    assert fruit_juices.prepare() == "Preparing Fruit Juices"

def test_pastry_factories():
    croissant = CroissantFactory().create_pastry()
    assert croissant.bake() == "Baking Croissant"

    chocolate_cake = ChocolateCakeFactory().create_pastry()
    assert chocolate_cake.bake() == "Baking Chocolate Cake"

    chocolate_chip_cookies = ChocolateChipCookiesFactory().create_pastry()
    assert chocolate_chip_cookies.bake() == "Baking Chocolate Chip Cookies"

def test_snack_factories():
    tuna_sandwich = TunaSandwichFactory().create_snack()
    assert tuna_sandwich.cook() == "Making Tuna Sandwich"

    spaghetti = SpaghettiFactory().create_snack()
    assert spaghetti.cook() == "Cooking Spaghetti"

    vegetable_salad = VegetableSaladFactory().create_snack()
    assert vegetable_salad.cook() == "Preparing Vegetable Salad"
