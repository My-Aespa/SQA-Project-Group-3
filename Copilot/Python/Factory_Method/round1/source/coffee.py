# coffee.py
from abc import ABC, abstractmethod

class Coffee(ABC):
    @abstractmethod
    def prepare(self):
        pass

    @abstractmethod
    def serve(self):
        pass

class Americano(Coffee):
    def prepare(self):
        return "Preparing Americano"

    def serve(self):
        return "Serving Americano"

class Latte(Coffee):
    def prepare(self):
        return "Preparing Latte"

    def serve(self):
        return "Serving Latte"

class Cappuccino(Coffee):
    def prepare(self):
        return "Preparing Cappuccino"

    def serve(self):
        return "Serving Cappuccino"

class Espresso(Coffee):
    def prepare(self):
        return "Preparing Espresso"

    def serve(self):
        return "Serving Espresso"

class Mocha(Coffee):
    def prepare(self):
        return "Preparing Mocha"

    def serve(self):
        return "Serving Mocha"

class CoffeeFactory:
    @staticmethod
    def create_coffee(coffee_type):
        if coffee_type == "Americano":
            return Americano()
        elif coffee_type == "Latte":
            return Latte()
        elif coffee_type == "Cappuccino":
            return Cappuccino()
        elif coffee_type == "Espresso":
            return Espresso()
        elif coffee_type == "Mocha":
            return Mocha()
        else:
            raise ValueError(f"Unknown coffee type: {coffee_type}")

def main():
    coffee_types = ["Americano", "Latte", "Cappuccino", "Espresso", "Mocha"]
    for coffee_type in coffee_types:
        coffee = CoffeeFactory.create_coffee(coffee_type)
        print(coffee.prepare())
        print(coffee.serve())

if __name__ == "__main__":
    main()