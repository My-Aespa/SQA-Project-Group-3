from abc import ABC, abstractmethod

# Abstract Product
class Snack(ABC):
    @abstractmethod
    def get_description(self):
        pass

# Concrete Products
class ChickenSandwich(Snack):
    def get_description(self):
        return "Chicken Sandwich"

class TunaSandwich(Snack):
    def get_description(self):
        return "Tuna Sandwich"

class Spaghetti(Snack):
    def get_description(self):
        return "Spaghetti"

class Penne(Snack):
    def get_description(self):
        return "Penne"

class VegetableSalad(Snack):
    def get_description(self):
        return "Vegetable Salad"

class ChickenSalad(Snack):
    def get_description(self):
        return "Chicken Salad"

# Abstract Factory
class SnackFactory(ABC):
    @abstractmethod
    def create_snack(self):
        pass

# Concrete Factories
class ChickenSandwichFactory(SnackFactory):
    def create_snack(self):
        return ChickenSandwich()

class TunaSandwichFactory(SnackFactory):
    def create_snack(self):
        return TunaSandwich()

class SpaghettiFactory(SnackFactory):
    def create_snack(self):
        return Spaghetti()

class PenneFactory(SnackFactory):
    def create_snack(self):
        return Penne()

class VegetableSaladFactory(SnackFactory):
    def create_snack(self):
        return VegetableSalad()

class ChickenSaladFactory(SnackFactory):
    def create_snack(self):
        return ChickenSalad()
