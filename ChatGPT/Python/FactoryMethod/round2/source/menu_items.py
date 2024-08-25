# menu_items.py

from abc import ABC, abstractmethod

# Abstract Product
class MenuItem(ABC):
    @abstractmethod
    def __str__(self):
        pass

# Concrete Products for Beverages
class Espresso(MenuItem):
    def __str__(self):
        return "Espresso"

class Cappuccino(MenuItem):
    def __str__(self):
        return "Cappuccino"

class Latte(MenuItem):
    def __str__(self):
        return "Latte"

class Mocha(MenuItem):
    def __str__(self):
        return "Mocha"

class Americano(MenuItem):
    def __str__(self):
        return "Americano"

class BlackTea(MenuItem):
    def __str__(self):
        return "Black Tea"

class GreenTea(MenuItem):
    def __str__(self):
        return "Green Tea"

class OolongTea(MenuItem):
    def __str__(self):
        return "Oolong Tea"

class LemonTea(MenuItem):
    def __str__(self):
        return "Lemon Tea"

class FruitSmoothies(MenuItem):
    def __str__(self):
        return "Fruit Smoothies"

class Milkshakes(MenuItem):
    def __str__(self):
        return "Milkshakes"

class FruitJuices(MenuItem):
    def __str__(self):
        return "Fruit Juices"

# Concrete Products for Pastries
class Croissant(MenuItem):
    def __str__(self):
        return "Croissant"

class Bun(MenuItem):
    def __str__(self):
        return "Bun"

class CustardBread(MenuItem):
    def __str__(self):
        return "Custard Bread"

class ChocolateCake(MenuItem):
    def __str__(self):
        return "Chocolate Cake"

class StrawberryCake(MenuItem):
    def __str__(self):
        return "Strawberry Cake"

class CoconutCake(MenuItem):
    def __str__(self):
        return "Coconut Cake"

class ChocolateChipCookies(MenuItem):
    def __str__(self):
        return "Chocolate Chip Cookies"

class OatCookies(MenuItem):
    def __str__(self):
        return "Oat Cookies"

# Concrete Products for Snacks
class ChickenSandwich(MenuItem):
    def __str__(self):
        return "Chicken Sandwich"

class TunaSandwich(MenuItem):
    def __str__(self):
        return "Tuna Sandwich"

class Spaghetti(MenuItem):
    def __str__(self):
        return "Spaghetti"

class Penne(MenuItem):
    def __str__(self):
        return "Penne"

class VegetableSalad(MenuItem):
    def __str__(self):
        return "Vegetable Salad"

class ChickenSalad(MenuItem):
    def __str__(self):
        return "Chicken Salad"
