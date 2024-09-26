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
        print("Brewing espresso with hot water.")

    def serve(self):
        print("Serving Americano in a mug.")

class Latte(Coffee):
    def prepare(self):
        print("Brewing espresso with steamed milk and milk foam.")

    def serve(self):
        print("Serving Latte in a latte glass.")

class Cappuccino(Coffee):
    def prepare(self):
        print("Brewing espresso with steamed milk and thick milk foam.")

    def serve(self):
        print("Serving Cappuccino in a cappuccino cup.")

class Espresso(Coffee):
    def prepare(self):
        print("Brewing espresso.")

    def serve(self):
        print("Serving Espresso in a shot glass.")

class Mocha(Coffee):
    def prepare(self):
        print("Brewing espresso with chocolate syrup, steamed milk and whipped cream.")

    def serve(self):
        print("Serving Mocha in a tall glass.")

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
            raise ValueError("Invalid coffee type.")

def order_coffee(coffee_type):
    coffee = CoffeeFactory.create_coffee(coffee_type)
    coffee.prepare()
    coffee.serve()
