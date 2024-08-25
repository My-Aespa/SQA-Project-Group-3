# Cafe.py
from abc import ABC, abstractmethod

# Creator (Factory)
class OrderFactory(ABC):
    @abstractmethod
    def create_item(self):
        pass

    def take_order(self, item_type):
        item = self.create_item(item_type)
        if item:
            return item.prepare()
        return "Item not available"

# Concrete Creators (Concrete Factories)
class BeverageFactory(OrderFactory):
    def create_item(self, item_type):
        if item_type == "Espresso":
            return Espresso()
        elif item_type == "Latte":
            return Latte()
        elif item_type == "Milkshakes":
            return Milkshakes()
        elif item_type == "Fruit Juices":
            return FruitJuices()
        else:
            return None

class PastryFactory(OrderFactory):
    def create_item(self, item_type):
        if item_type == "Croissant":
            return Croissant()
        elif item_type == "Chocolate Cake":
            return ChocolateCake()
        elif item_type == "Chocolate Chip Cookies":
            return ChocolateChipCookies()
        else:
            return None

class SnackFactory(OrderFactory):
    def create_item(self, item_type):
        if item_type == "Tuna Sandwich":
            return TunaSandwich()
        elif item_type == "Spaghetti":
            return Spaghetti()
        elif item_type == "Vegetable Salad":
            return VegetableSalad()
        else:
            return None

# Product (Abstract Product)
class Item(ABC):
    @abstractmethod
    def prepare(self):
        pass

# Concrete Products (Concrete Products)
class Espresso(Item):
    def prepare(self):
        return "Preparing Espresso"

class Latte(Item):
    def prepare(self):
        return "Preparing Latte"

class Milkshakes(Item):
    def prepare(self):
        return "Preparing Milkshakes"

class FruitJuices(Item):
    def prepare(self):
        return "Preparing Fruit Juices"

class Croissant(Item):
    def prepare(self):
        return "Preparing Croissant"

class ChocolateCake(Item):
    def prepare(self):
        return "Preparing Chocolate Cake"

class ChocolateChipCookies(Item):
    def prepare(self):
        return "Preparing Chocolate Chip Cookies"

class TunaSandwich(Item):
    def prepare(self):
        return "Preparing Tuna Sandwich"

class Spaghetti(Item):
    def prepare(self):
        return "Preparing Spaghetti"

class VegetableSalad(Item):
    def prepare(self):
        return "Preparing Vegetable Salad"

# Client Code
def order_item(factory, item_type):
    return factory.take_order(item_type)