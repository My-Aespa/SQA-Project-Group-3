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
        print("Brewing strong coffee...")
        print("Adding hot water...")

    def serve(self):
        print("Serving Americano with a glass of water.")

class Latte(Coffee):
    def prepare(self):
        print("Brewing espresso...")
        print("Adding steamed milk...")

    def serve(self):
        print("Serving Latte with latte art.")

class Cappuccino(Coffee):
    def prepare(self):
        print("Brewing espresso...")
        print("Adding steamed milk...")
        print("Adding foamed milk...")

    def serve(self):
        print("Serving Cappuccino with latte art.")

class Espresso(Coffee):
    def prepare(self):
        print("Brewing espresso...")

    def serve(self):
        print("Serving Espresso in a small cup.")

class Mocha(Coffee):
    def prepare(self):
        print("Brewing espresso...")
        print("Adding chocolate syrup...")
        print("Adding steamed milk...")
        print("Adding whipped cream...")

    def serve(self):
        print("Serving Mocha with a sprinkle of chocolate powder.")

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
            raise ValueError(f"Invalid coffee type: {coffee_type}")
