# menu_factory.py

from menu_items import *

class BeverageFactory:
    @staticmethod
    def create_beverage(beverage_type: str) -> MenuItem:
        beverages = {
            "Espresso": Espresso(),
            "Cappuccino": Cappuccino(),
            "Latte": Latte(),
            "Mocha": Mocha(),
            "Americano": Americano(),
            "Black Tea": BlackTea(),
            "Green Tea": GreenTea(),
            "Oolong Tea": OolongTea(),
            "Lemon Tea": LemonTea(),
            "Fruit Smoothies": FruitSmoothies(),
            "Milkshakes": Milkshakes(),
            "Fruit Juices": FruitJuices()
        }
        return beverages.get(beverage_type, None)

class PastryFactory:
    @staticmethod
    def create_pastry(pastry_type: str) -> MenuItem:
        pastries = {
            "Croissant": Croissant(),
            "Bun": Bun(),
            "Custard Bread": CustardBread(),
            "Chocolate Cake": ChocolateCake(),
            "Strawberry Cake": StrawberryCake(),
            "Coconut Cake": CoconutCake(),
            "Chocolate Chip Cookies": ChocolateChipCookies(),
            "Oat Cookies": OatCookies()
        }
        return pastries.get(pastry_type, None)

class SnackFactory:
    @staticmethod
    def create_snack(snack_type: str) -> MenuItem:
        snacks = {
            "Chicken Sandwich": ChickenSandwich(),
            "Tuna Sandwich": TunaSandwich(),
            "Spaghetti": Spaghetti(),
            "Penne": Penne(),
            "Vegetable Salad": VegetableSalad(),
            "Chicken Salad": ChickenSalad()
        }
        return snacks.get(snack_type, None)
