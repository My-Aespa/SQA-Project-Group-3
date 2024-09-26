from abc import ABC, abstractmethod

# Interface for Coffee beverages
class Coffee(ABC):
    @abstractmethod
    def prepare(self):
        pass

    @abstractmethod
    def serve(self):
        pass

# Concrete Classes for different Coffee types
class Americano(Coffee):
    def prepare(self):
        return "Extracting espresso shot..."

    def serve(self):
        return "Serving hot Americano!"

class Latte(Coffee):
    def prepare(self):
        return "Extracting espresso shot...\nSteaming milk..."

    def serve(self):
        return "Serving hot Latte!"

class Cappuccino(Coffee):
    def prepare(self):
        return "Extracting espresso shot...\nSteaming milk...\nAdding cocoa powder..."

    def serve(self):
        return "Serving hot Cappuccino!"

class Espresso(Coffee):
    def prepare(self):
        return "Extracting espresso shot..."

    def serve(self):
        return "Serving hot Espresso!"

class Mocha(Coffee):
    def prepare(self):
        return "Extracting espresso shot...\nSteaming milk...\nAdding chocolate sauce..."

    def serve(self):
        return "Serving hot Mocha!"

# Factory Class for creating Coffee beverages
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
            raise ValueError("Invalid coffee type selected.")

# Example usage
if __name__ == "__main__":
    factory = CoffeeFactory()

    coffee_type = input("What kind of coffee would you like to order? ")
    coffee = factory.create_coffee(coffee_type)

    print(coffee.prepare())
    print(coffee.serve())