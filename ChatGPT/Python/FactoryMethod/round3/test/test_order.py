# test_order.py

import pytest
from order import order_item
from products import *

class MockCoffeeFactory:
    def create_beverage(self, type):
        if type == "Espresso":
            return Espresso()
        return None

class MockPastryFactory:
    def create_pastry(self, type):
        if type == "Croissant":
            return Croissant()
        return None

class MockSnackFactory:
    def create_snack(self, type):
        if type == "Spaghetti":
            return Spaghetti()
        return None

def test_order_item():
    coffee_factory = MockCoffeeFactory()
    pastry_factory = MockPastryFactory()
    snack_factory = MockSnackFactory()

    assert order_item(coffee_factory, "Espresso") == "Preparing Espresso"
    assert order_item(pastry_factory, "Croissant") == "Preparing Croissant"
    assert order_item(snack_factory, "Spaghetti") == "Preparing Spaghetti"

if __name__ == "__main__":
    pytest.main()
