import pytest
from coffee_factory import *
from pastry_factory import *
from snack_factory import *

def test_coffee_factories():
    factories = [
        EspressoFactory(),
        CappuccinoFactory(),
        LatteFactory(),
        MochaFactory(),
        AmericanoFactory()
    ]
    descriptions = [
        "Espresso",
        "Cappuccino",
        "Latte",
        "Mocha",
        "Americano"
    ]
    for factory, description in zip(factories, descriptions):
        coffee = factory.create_coffee()
        assert coffee.get_description() == description

def test_pastry_factories():
    factories = [
        CroissantFactory(),
        BunFactory(),
        CustardBreadFactory(),
        ChocolateCakeFactory(),
        StrawberryCakeFactory(),
        CoconutCakeFactory(),
        ChocolateChipCookiesFactory(),
        OatCookiesFactory()
    ]
    descriptions = [
        "Croissant",
        "Bun",
        "Custard Bread",
        "Chocolate Cake",
        "Strawberry Cake",
        "Coconut Cake",
        "Chocolate Chip Cookies",
        "Oat Cookies"
    ]
    for factory, description in zip(factories, descriptions):
        pastry = factory.create_pastry()
        assert pastry.get_description() == description

def test_snack_factories():
    factories = [
        ChickenSandwichFactory(),
        TunaSandwichFactory(),
        SpaghettiFactory(),
        PenneFactory(),
        VegetableSaladFactory(),
        ChickenSaladFactory()
    ]
    descriptions = [
        "Chicken Sandwich",
        "Tuna Sandwich",
        "Spaghetti",
        "Penne",
        "Vegetable Salad",
        "Chicken Salad"
    ]
    for factory, description in zip(factories, descriptions):
        snack = factory.create_snack()
        assert snack.get_description() == description
