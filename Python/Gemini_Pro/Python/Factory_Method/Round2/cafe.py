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
    def create_beverage(self, type):
        if type == "Espresso":
            return Coffee(type)
        elif type == "Cappuccino":
            return Coffee(type)
        elif type == "Latte":
            return Coffee(type)
        elif type == "Mocha":
            return Coffee(type)
        elif type == "Americano":
            return Coffee(type)
        elif type == "Black Tea":
            return Tea(type)
        elif type == "Green Tea":
            return Tea(type)
        elif type == "Oolong Tea":
            return Tea(type)
        elif type == "Lemon Tea":
            return Tea(type)
        elif type == "Fruit Smoothies":
            return ColdBeverage(type)
        elif type == "Milkshakes":
            return ColdBeverage(type)
        elif type == "Fruit Juices":
            return ColdBeverage(type)
        else:
            return None

    def create_pastry(self, type):
        if type == "Croissant":
            return Bread(type)
        elif type == "Bun":
            return Bread(type)
        elif type == "Custard Bread":
            return Bread(type)
        elif type == "Chocolate Cake":
            return Cake(type)
        elif type == "Strawberry Cake":
            return Cake(type)
        elif type == "Coconut Cake":
            return Cake(type)
        elif type == "Chocolate Chip Cookies":
            return Cookie(type)
        elif type == "Oat Cookies":
            return Cookie(type)
        else:
            return None

    def create_snack(self, type):
        if type == "Chicken Sandwich":
            return Sandwich(type)
        elif type == "Tuna Sandwich":
            return Sandwich(type)
        elif type == "Spaghetti":
            return Pasta(type)
        elif type == "Penne":
            return Pasta(type)
        elif type == "Vegetable Salad":
            return Salad(type)
        elif type == "Chicken Salad":
            return Salad(type)
        else:
            return None