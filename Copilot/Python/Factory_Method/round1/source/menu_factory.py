from abc import ABC, abstractmethod
from beverages import Espresso, Latte, Milkshakes, FruitJuices
from pastries import Croissant, ChocolateCake, ChocolateChipCookies
from snacks import TunaSandwich, Spaghetti, VegetableSalad

class MenuFactory(ABC):
    @abstractmethod
    def create_menu_item(self, type):
        pass

class BeverageFactory(MenuFactory):
    def create_menu_item(self, type):
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

class PastryFactory(MenuFactory):
    def create_menu_item(self, type):
        if type == "Croissant":
            return Croissant()
        elif type == "Chocolate Cake":
            return ChocolateCake()
        elif type == "Chocolate Chip Cookies":
            return ChocolateChipCookies()
        else:
            raise ValueError("Unknown pastry type")

class SnackFactory(MenuFactory):
    def create_menu_item(self, type):
        if type == "Tuna Sandwich":
            return TunaSandwich()
        elif type == "Spaghetti":
            return Spaghetti()
        elif type == "Vegetable Salad":
            return VegetableSalad()
        else:
            raise ValueError("Unknown snack type")