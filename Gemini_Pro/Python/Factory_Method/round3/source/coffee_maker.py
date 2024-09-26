from abc import ABC, abstractmethod

class Coffee(ABC):
    """
    Abstract base class for all coffee types.
    """

    def __init__(self):
        self.name = None

    @abstractmethod
    def prepare(self):
        pass

    def serve(self):
        return f"Serving a cup of {self.name}"


class Americano(Coffee):
    def __init__(self):
        self.name = "Americano"

    def prepare(self):
        return "Adding hot water to espresso"


class Latte(Coffee):
    def __init__(self):
        self.name = "Latte"

    def prepare(self):
        return "Adding steamed milk to espresso"


class Cappuccino(Coffee):
    def __init__(self):
        self.name = "Cappuccino"

    def prepare(self):
        return "Adding steamed milk foam to espresso"


class Espresso(Coffee):
    def __init__(self):
        self.name = "Espresso"

    def prepare(self):
        return "Brewing a shot of espresso"


class Mocha(Coffee):
    def __init__(self):
        self.name = "Mocha"

    def prepare(self):
        return "Adding chocolate syrup and steamed milk to espresso"


class CoffeeFactory:
    """
    Factory class for creating coffee objects.
    """

    def __init__(self):
        self._creators = {}

    def register_coffee(self, coffee_type, creator):
        self._creators[coffee_type] = creator

    def create_coffee(self, coffee_type):
        creator = self._creators.get(coffee_type)
        if creator is not None:
            return creator()
        else:
            raise ValueError(f"Invalid coffee type: {coffee_type}")


# Register coffee types with the factory
factory = CoffeeFactory()
factory.register_coffee('Americano', Americano)
factory.register_coffee('Latte', Latte)
factory.register_coffee('Cappuccino', Cappuccino)
factory.register_coffee('Espresso', Espresso)
factory.register_coffee('Mocha', Mocha)