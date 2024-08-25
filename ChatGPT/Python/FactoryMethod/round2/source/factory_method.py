# factory_method.py

from abc import ABC, abstractmethod

# Product interfaces
class Beverage(ABC):
    @abstractmethod
    def prepare(self):
        pass

class Pastry(ABC):
    @abstractmethod
    def bake(self):
        pass

class Snack(ABC):
    @abstractmethod
    def cook(self):
        pass

# Concrete products
class Espresso(Beverage):
    def prepare(self):
        return "Preparing Espresso"

class Latte(Beverage):
    def prepare(self):
        return "Preparing Latte"

class Milkshakes(Beverage):
    def prepare(self):
        return "Preparing Milkshakes"

class FruitJuices(Beverage):
    def prepare(self):
        return "Preparing Fruit Juices"

class Croissant(Pastry):
    def bake(self):
        return "Baking Croissant"

class ChocolateCake(Pastry):
    def bake(self):
        return "Baking Chocolate Cake"

class ChocolateChipCookies(Pastry):
    def bake(self):
        return "Baking Chocolate Chip Cookies"

class TunaSandwich(Snack):
    def cook(self):
        return "Making Tuna Sandwich"

class Spaghetti(Snack):
    def cook(self):
        return "Cooking Spaghetti"

class VegetableSalad(Snack):
    def cook(self):
        return "Preparing Vegetable Salad"

# Factory methods
class BeverageFactory(ABC):
    @abstractmethod
    def create_beverage(self):
        pass

class EspressoFactory(BeverageFactory):
    def create_beverage(self):
        return Espresso()

class LatteFactory(BeverageFactory):
    def create_beverage(self):
        return Latte()

class MilkshakesFactory(BeverageFactory):
    def create_beverage(self):
        return Milkshakes()

class FruitJuicesFactory(BeverageFactory):
    def create_beverage(self):
        return FruitJuices()

class PastryFactory(ABC):
    @abstractmethod
    def create_pastry(self):
        pass

class CroissantFactory(PastryFactory):
    def create_pastry(self):
        return Croissant()

class ChocolateCakeFactory(PastryFactory):
    def create_pastry(self):
        return ChocolateCake()

class ChocolateChipCookiesFactory(PastryFactory):
    def create_pastry(self):
        return ChocolateChipCookies()

class SnackFactory(ABC):
    @abstractmethod
    def create_snack(self):
        pass

class TunaSandwichFactory(SnackFactory):
    def create_snack(self):
        return TunaSandwich()

class SpaghettiFactory(SnackFactory):
    def create_snack(self):
        return Spaghetti()

class VegetableSaladFactory(SnackFactory):
    def create_snack(self):
        return VegetableSalad()
