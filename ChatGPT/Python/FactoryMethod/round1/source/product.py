# product.py

class Beverage:
    def serve(self):
        raise NotImplementedError

class Espresso(Beverage):
    def serve(self):
        return "Serving Espresso"

class Latte(Beverage):
    def serve(self):
        return "Serving Latte"

class Milkshakes(Beverage):
    def serve(self):
        return "Serving Milkshakes"

class FruitJuices(Beverage):
    def serve(self):
        return "Serving Fruit Juices"

class Pastry:
    def serve(self):
        raise NotImplementedError

class Croissant(Pastry):
    def serve(self):
        return "Serving Croissant"

class ChocolateCake(Pastry):
    def serve(self):
        return "Serving Chocolate Cake"

class ChocolateChipCookies(Pastry):
    def serve(self):
        return "Serving Chocolate Chip Cookies"

class Snack:
    def serve(self):
        raise NotImplementedError

class TunaSandwich(Snack):
    def serve(self):
        return "Serving Tuna Sandwich"

class Spaghetti(Snack):
    def serve(self):
        return "Serving Spaghetti"

class VegetableSalad(Snack):
    def serve(self):
        return "Serving Vegetable Salad"
