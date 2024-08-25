# products.py

class Beverage:
    def prepare(self):
        pass

class Espresso(Beverage):
    def prepare(self):
        return "Preparing Espresso"

class Latte(Beverage):
    def prepare(self):
        return "Preparing Latte"

class Milkshakes(Beverage):
    def prepare(self):
        return "Preparing Milkshakes"

class FruitJuices(Beverage):
    def prepare(self):
        return "Preparing Fruit Juices"

class Pastry:
    def prepare(self):
        pass

class Croissant(Pastry):
    def prepare(self):
        return "Preparing Croissant"

class ChocolateCake(Pastry):
    def prepare(self):
        return "Preparing Chocolate Cake"

class ChocolateChipCookies(Pastry):
    def prepare(self):
        return "Preparing Chocolate Chip Cookies"

class Snack:
    def prepare(self):
        pass

class TunaSandwich(Snack):
    def prepare(self):
        return "Preparing Tuna Sandwich"

class Spaghetti(Snack):
    def prepare(self):
        return "Preparing Spaghetti"

class VegetableSalad(Snack):
    def prepare(self):
        return "Preparing Vegetable Salad"
