from abc import ABC, abstractmethod

class MenuItem(ABC):
    @abstractmethod
    def prepare(self):
        pass

class Beverage(MenuItem):
    pass

class Coffee(Beverage):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type} coffee"

class Tea(Beverage):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type} tea"

class ColdBeverage(Beverage):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type}"

class Pastry(MenuItem):
    pass

class Bread(Pastry):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type} bread"

class Cake(Pastry):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type} cake"

class Cookie(Pastry):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type} cookies"

class Snack(MenuItem):
    pass

class Sandwich(Snack):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type} sandwich"

class Pasta(Snack):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type} pasta"

class Salad(Snack):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        return f"Preparing {self.type} salad"

class Cafe:
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