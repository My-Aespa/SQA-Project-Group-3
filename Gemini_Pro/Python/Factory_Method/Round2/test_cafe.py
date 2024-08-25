import pytest
from cafe import Cafe, Coffee, Tea, ColdBeverage, Bread, Cake, Cookie, Sandwich, Pasta, Salad

cafe = Cafe()

@pytest.mark.parametrize("beverage_type", [
    "Espresso", "Cappuccino", "Latte", "Mocha", "Americano",
    "Black Tea", "Green Tea", "Oolong Tea", "Lemon Tea",
    "Fruit Smoothies", "Milkshakes", "Fruit Juices"
])
def test_create_beverage(beverage_type):
    beverage = cafe.create_beverage(beverage_type)
    assert isinstance(beverage, Beverage)
    assert beverage.prepare() == f"Preparing {beverage_type} {'coffee' if beverage_type in ('Espresso', 'Cappuccino', 'Latte', 'Mocha', 'Americano') else 'tea' if beverage_type in ('Black Tea', 'Green Tea', 'Oolong Tea', 'Lemon Tea') else ''}"

@pytest.mark.parametrize("pastry_type", [
    "Croissant", "Bun", "Custard Bread",
    "Chocolate Cake", "Strawberry Cake", "Coconut Cake",
    "Chocolate Chip Cookies", "Oat Cookies"
])
def test_create_pastry(pastry_type):
    pastry = cafe.create_pastry(pastry_type)
    assert isinstance(pastry, Pastry)
    assert pastry.prepare() == f"Preparing {pastry_type} {'bread' if pastry_type in ('Croissant', 'Bun', 'Custard Bread') else 'cake' if pastry_type in ('Chocolate Cake', 'Strawberry Cake', 'Coconut Cake') else 'cookies'}"

@pytest.mark.parametrize("snack_type", [
    "Chicken Sandwich", "Tuna Sandwich",
    "Spaghetti", "Penne",
    "Vegetable Salad", "Chicken Salad"
])
def test_create_snack(snack_type):
    snack = cafe.create_snack(snack_type)
    assert isinstance(snack, Snack)
    assert snack.prepare() == f"Preparing {snack_type} {'sandwich' if snack_type in ('Chicken Sandwich', 'Tuna Sandwich') else 'pasta' if snack_type in ('Spaghetti', 'Penne') else 'salad'}"

def test_create_invalid_items():
    assert cafe.create_beverage("Invalid Beverage") is None
    assert cafe.create_pastry("Invalid Pastry") is None
    assert cafe.create_snack("Invalid Snack") is None