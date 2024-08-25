from abc import ABC, abstractmethod

class Beverage(ABC):
    """Abstract base class for all beverages."""
    @abstractmethod
    def prepare(self):
        pass

class Coffee(Beverage):
    """Concrete beverage class for coffee."""
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type} coffee"

class Tea(Beverage):
    """Concrete beverage class for tea."""
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type} tea"

class ColdBeverage(Beverage):
    """Concrete beverage class for cold beverages."""
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type}"

class Pastry(ABC):
    """Abstract base class for all pastries."""
    @abstractmethod
    def prepare(self):
        pass

class Bread(Pastry):
    """Concrete pastry class for bread."""
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type} bread"

class Cake(Pastry):
    """Concrete pastry class for cake."""
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type} cake"

class Cookie(Pastry):
    """Concrete pastry class for cookies."""
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type} cookies"

class Snack(ABC):
    """Abstract base class for all snacks."""
    @abstractmethod
    def prepare(self):
        pass

class Sandwich(Snack):
    """Concrete snack class for sandwiches."""
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type} sandwich"

class Pasta(Snack):
    """Concrete snack class for pasta."""
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type} pasta"

class Salad(Snack):
    """Concrete snack class for salads."""
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type} salad"

class Cafe:
    """Factory class for creating menu items."""
    def create_item(self, category, type):
        if category == "Coffee":
            return Coffee(type)
        elif category == "Tea":
            return Tea(type)
        elif category == "ColdBeverage":
            return ColdBeverage(type)
        elif category == "Bread":
            return Bread(type)
        elif category == "Cake":
            return Cake(type)
        elif category == "Cookie":
            return Cookie(type)
        elif category == "Sandwich":
            return Sandwich(type)
        elif category == "Pasta":
            return Pasta(type)
        elif category == "Salad":
            return Salad(type)
        else:
            return None  