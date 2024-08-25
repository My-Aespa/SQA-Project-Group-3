from menu_item import MenuItem

class Espresso(MenuItem):
    def serve(self):
        print("Serving Espresso")

class Latte(MenuItem):
    def serve(self):
        print("Serving Latte")

class Milkshakes(MenuItem):
    def serve(self):
        print("Serving Milkshakes")

class FruitJuices(MenuItem):
    def serve(self):
        print("Serving Fruit Juices")
