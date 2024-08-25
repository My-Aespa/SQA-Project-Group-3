# code/menu_factory.py

from menu_items import *

class BeverageFactory(ABC):
    @abstractmethod
    def create_beverage(self):
        pass

class CoffeeFactory(BeverageFactory):
    def create_beverage(self):
        return Coffee()

class TeaFactory(BeverageFactory):
    def create_beverage(self):
        return Tea()

class ColdBeverageFactory(BeverageFactory):
    def create_beverage(self):
        return ColdBeverage()

class PastryFactory(ABC):
    @abstractmethod
    def create_pastry(self):
        pass

class BreadFactory(PastryFactory):
    def create_pastry(self):
        return Bread()

class CakeFactory(PastryFactory):
    def create_pastry(self):
        return Cake()

class CookieFactory(PastryFactory):
    def create_pastry(self):
        return Cookie()

class SnackFactory(ABC):
    @abstractmethod
    def create_snack(self):
        pass

class SandwichFactory(SnackFactory):
    def create_snack(self):
        return Sandwich()

class PastaFactory(SnackFactory):
    def create_snack(self):
        return Pasta()

class SaladFactory(SnackFactory):
    def create_snack(self):
        return Salad()
