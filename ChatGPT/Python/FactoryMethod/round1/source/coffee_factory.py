# coffee_factory.py
from abc import ABC, abstractmethod

# Abstract Product
class Coffee(ABC):
    @abstractmethod
    def prepare(self):
        pass

    @abstractmethod
    def serve(self):
        pass

# Concrete Products
class Americano(Coffee):
    def prepare(self):
        return "Preparing an Americano"

    def serve(self):
        return "Serving an Americano"

class Latte(Coffee):
    def prepare(self):
        return "Preparing a Latte"

    def serve(self):
        return "Serving a Latte"

class Cappuccino(Coffee):
    def prepare(self):
        return "Preparing a Cappuccino"

    def serve(self):
        return "Serving a Cappuccino"

class Espresso(Coffee):
    def prepare(self):
        return "Preparing an Espresso"

    def serve(self):
        return "Serving an Espresso"

class Mocha(Coffee):
    def prepare(self):
        return "Preparing a Mocha"

    def serve(self):
        return "Serving a Mocha"

# Creator (Factory Method)
class CoffeeFactory:
    @staticmethod
    def create_coffee(coffee_type: str) -> Coffee:
        coffee_type = coffee_type.lower()
        if coffee_type == "americano":
            return Americano()
        elif coffee_type == "latte":
            return Latte()
        elif coffee_type == "cappuccino":
            return Cappuccino()
        elif coffee_type == "espresso":
            return Espresso()
        elif coffee_type == "mocha":
            return Mocha()
        else:
            raise ValueError(f"Unknown coffee type: {coffee_type}")

# Client code
def order_coffee(coffee_type: str) -> str:
    try:
        coffee = CoffeeFactory.create_coffee(coffee_type)
        preparation = coffee.prepare()
        serving = coffee.serve()
        return f"{preparation}\n{serving}"
    except ValueError as e:
        return str(e)
