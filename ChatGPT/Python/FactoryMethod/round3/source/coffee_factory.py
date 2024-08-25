from abc import ABC, abstractmethod

# Abstract Product
class Coffee(ABC):
    @abstractmethod
    def get_description(self):
        pass

# Concrete Products
class Espresso(Coffee):
    def get_description(self):
        return "Espresso"

class Cappuccino(Coffee):
    def get_description(self):
        return "Cappuccino"

class Latte(Coffee):
    def get_description(self):
        return "Latte"

class Mocha(Coffee):
    def get_description(self):
        return "Mocha"

class Americano(Coffee):
    def get_description(self):
        return "Americano"

# Abstract Factory
class CoffeeFactory(ABC):
    @abstractmethod
    def create_coffee(self):
        pass

# Concrete Factories
class EspressoFactory(CoffeeFactory):
    def create_coffee(self):
        return Espresso()

class CappuccinoFactory(CoffeeFactory):
    def create_coffee(self):
        return Cappuccino()

class LatteFactory(CoffeeFactory):
    def create_coffee(self):
        return Latte()

class MochaFactory(CoffeeFactory):
    def create_coffee(self):
        return Mocha()

class AmericanoFactory(CoffeeFactory):
    def create_coffee(self):
        return Americano()
