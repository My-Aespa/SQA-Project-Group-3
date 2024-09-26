# coffee_factory.py
from abc import ABC, abstractmethod

# Abstract Product Class
class Coffee(ABC):
    @abstractmethod
    def prepare(self):
        pass

    @abstractmethod
    def serve(self):
        pass

# Concrete Product Classes
class Americano(Coffee):
    def prepare(self):
        return "Preparing Americano: adding hot water to espresso."

    def serve(self):
        return "Serving Americano: in a regular cup."

class Latte(Coffee):
    def prepare(self):
        return "Preparing Latte: adding steamed milk to espresso."

    def serve(self):
        return "Serving Latte: in a tall cup with foam on top."

class Cappuccino(Coffee):
    def prepare(self):
        return "Preparing Cappuccino: adding equal parts of steamed milk and foam to espresso."

    def serve(self):
        return "Serving Cappuccino: in a small cup with a sprinkle of cocoa powder."

class Espresso(Coffee):
    def prepare(self):
        return "Preparing Espresso: brewing a small amount of coffee."

    def serve(self):
        return "Serving Espresso: in a shot glass."

class Mocha(Coffee):
    def prepare(self):
        return "Preparing Mocha: adding chocolate syrup to espresso and steamed milk."

    def serve(self):
        return "Serving Mocha: in a mug with whipped cream."

# Factory Method
class CoffeeFactory:
    @staticmethod
    def create_coffee(coffee_type: str) -> Coffee:
        coffee_types = {
            "americano": Americano,
            "latte": Latte,
            "cappuccino": Cappuccino,
            "espresso": Espresso,
            "mocha": Mocha
        }

        if coffee_type.lower() in coffee_types:
            return coffee_types[coffee_type.lower()]()
        else:
            raise ValueError(f"Coffee type '{coffee_type}' is not recognized.")

# Client Code
def order_coffee(coffee_type: str):
    try:
        coffee = CoffeeFactory.create_coffee(coffee_type)
        preparation = coffee.prepare()
        serving = coffee.serve()
        return preparation, serving
    except ValueError as e:
        return str(e)
