# coffee_factory.py

from abc import ABC, abstractmethod

# Abstract base class for coffee
class Coffee(ABC):
    @abstractmethod
    def prepare(self):
        pass

    @abstractmethod
    def serve(self):
        pass

# Concrete coffee types
class Americano(Coffee):
    def prepare(self):
        return "Preparing Americano: Brewing water and adding espresso."

    def serve(self):
        return "Serving Americano in a standard cup."

class Latte(Coffee):
    def prepare(self):
        return "Preparing Latte: Steaming milk and adding to espresso."

    def serve(self):
        return "Serving Latte in a tall glass with milk foam."

class Cappuccino(Coffee):
    def prepare(self):
        return "Preparing Cappuccino: Steaming milk, adding to espresso, and topping with milk foam."

    def serve(self):
        return "Serving Cappuccino in a wide cup with a sprinkle of cocoa powder."

class Espresso(Coffee):
    def prepare(self):
        return "Preparing Espresso: Brewing a shot of espresso."

    def serve(self):
        return "Serving Espresso in a small cup."

class Mocha(Coffee):
    def prepare(self):
        return "Preparing Mocha: Adding chocolate syrup to espresso and topping with steamed milk."

    def serve(self):
        return "Serving Mocha in a mug with whipped cream."

# Factory Method Pattern
class CoffeeFactory:
    def create_coffee(self, coffee_type: str) -> Coffee:
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

# Example usage (Optional)
if __name__ == "__main__":
    factory = CoffeeFactory()
    coffee = factory.create_coffee("Latte")
    print(coffee.prepare())
    print(coffee.serve())
