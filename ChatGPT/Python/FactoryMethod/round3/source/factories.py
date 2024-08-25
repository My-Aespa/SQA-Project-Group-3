# factories.py

from products import *

class CoffeeFactory:
    def create_beverage(self, type):
        if type == "Espresso":
            return Espresso()
        elif type == "Latte":
            return Latte()
        elif type == "Milkshakes":
            return Milkshakes()
        elif type == "Fruit Juices":
            return FruitJuices()
        else:
            raise ValueError("Unknown beverage type")

class PastryFactory:
    def create_pastry(self, type):
        if type == "Croissant":
            return Croissant()
        elif type == "Chocolate Cake":
            return ChocolateCake()
        elif type == "Chocolate Chip Cookies":
            return ChocolateChipCookies()
        else:
            raise ValueError("Unknown pastry type")

class SnackFactory:
    def create_snack(self, type):
        if type == "Tuna Sandwich":
            return TunaSandwich()
        elif type == "Spaghetti":
            return Spaghetti()
        elif type == "Vegetable Salad":
            return VegetableSalad()
        else:
            raise ValueError("Unknown snack type")
