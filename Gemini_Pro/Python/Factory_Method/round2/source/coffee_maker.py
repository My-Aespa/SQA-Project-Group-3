from abc import ABC, abstractmethod


class Coffee(ABC):
    """Abstract base class for all coffee types."""

    def __init__(self):
        self.name = None

    @abstractmethod
    def prepare(self):
        pass

    def serve(self):
        return f"Serving a cup of {self.name}"


class Americano(Coffee):
    def __init__(self):
        super().__init__()
        self.name = "Americano"

    def prepare(self):
        return "Adding hot water to espresso"


class Latte(Coffee):
    def __init__(self):
        super().__init__()
        self.name = "Latte"

    def prepare(self):
        return "Adding steamed milk to espresso"


class Cappuccino(Coffee):
    def __init__(self):
        super().__init__()
        self.name = "Cappuccino"

    def prepare(self):
        return "Adding steamed milk and foamed milk to espresso"


class Espresso(Coffee):
    def __init__(self):
        super().__init__()
        self.name = "Espresso"

    def prepare(self):
        return "Brewing a shot of espresso"


class Mocha(Coffee):
    def __init__(self):
        super().__init__()
        self.name = "Mocha"

    def prepare(self):
        return "Adding chocolate syrup, steamed milk and foamed milk to espresso"


class CoffeeFactory:
    """Factory class to create different types of coffee."""

    def create_coffee(self, coffee_type: str) -> Coffee:
        """Factory method to create coffee objects."""
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


# Example usage
factory = CoffeeFactory()
coffee = factory.create_coffee("Latte")
print(coffee.prepare())
print(coffee.serve())