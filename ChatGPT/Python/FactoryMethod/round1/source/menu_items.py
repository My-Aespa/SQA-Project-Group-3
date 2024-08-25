# code/menu_items.py

from abc import ABC, abstractmethod

class Beverage(ABC):
    @abstractmethod
    def prepare(self):
        pass

class Coffee(Beverage):
    def prepare(self):
        return "Preparing coffee"

class Tea(Beverage):
    def prepare(self):
        return "Preparing tea"

class ColdBeverage(Beverage):
    def prepare(self):
        return "Preparing cold beverage"

class Pastry(ABC):
    @abstractmethod
    def bake(self):
        pass

class Bread(Pastry):
    def bake(self):
        return "Baking bread"

class Cake(Pastry):
    def bake(self):
        return "Baking cake"

class Cookie(Pastry):
    def bake(self):
        return "Baking cookie"

class Snack(ABC):
    @abstractmethod
    def serve(self):
        pass

class Sandwich(Snack):
    def serve(self):
        return "Serving sandwich"

class Pasta(Snack):
    def serve(self):
        return "Serving pasta"

class Salad(Snack):
    def serve(self):
        return "Serving salad"
