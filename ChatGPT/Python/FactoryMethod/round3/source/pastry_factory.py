from abc import ABC, abstractmethod

# Abstract Product
class Pastry(ABC):
    @abstractmethod
    def get_description(self):
        pass

# Concrete Products
class Croissant(Pastry):
    def get_description(self):
        return "Croissant"

class Bun(Pastry):
    def get_description(self):
        return "Bun"

class CustardBread(Pastry):
    def get_description(self):
        return "Custard Bread"

class ChocolateCake(Pastry):
    def get_description(self):
        return "Chocolate Cake"

class StrawberryCake(Pastry):
    def get_description(self):
        return "Strawberry Cake"

class CoconutCake(Pastry):
    def get_description(self):
        return "Coconut Cake"

class ChocolateChipCookies(Pastry):
    def get_description(self):
        return "Chocolate Chip Cookies"

class OatCookies(Pastry):
    def get_description(self):
        return "Oat Cookies"

# Abstract Factory
class PastryFactory(ABC):
    @abstractmethod
    def create_pastry(self):
        pass

# Concrete Factories
class CroissantFactory(PastryFactory):
    def create_pastry(self):
        return Croissant()

class BunFactory(PastryFactory):
    def create_pastry(self):
        return Bun()

class CustardBreadFactory(PastryFactory):
    def create_pastry(self):
        return CustardBread()

class ChocolateCakeFactory(PastryFactory):
    def create_pastry(self):
        return ChocolateCake()

class StrawberryCakeFactory(PastryFactory):
    def create_pastry(self):
        return StrawberryCake()

class CoconutCakeFactory(PastryFactory):
    def create_pastry(self):
        return CoconutCake()

class ChocolateChipCookiesFactory(PastryFactory):
    def create_pastry(self):
        return ChocolateChipCookies()

class OatCookiesFactory(PastryFactory):
    def create_pastry(self):
        return OatCookies()
