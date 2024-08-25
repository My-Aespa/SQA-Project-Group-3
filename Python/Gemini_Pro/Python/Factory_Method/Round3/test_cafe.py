import pytest
from cafe import Cafe, Coffee, Tea, ColdBeverage, Bread, Cake, Cookie, Sandwich, Pasta, Salad

cafe = Cafe()

@pytest.mark.parametrize("item_type, expected_class, expected_output", [
    ("Espresso", Coffee, "Preparing Espresso coffee"),
    ("Cappuccino", Coffee, "Preparing Cappuccino coffee"),
    ("Latte", Coffee, "Preparing Latte coffee"),
    ("Mocha", Coffee, "Preparing Mocha coffee"),
    ("Americano", Coffee, "Preparing Americano coffee"),
    ("Black Tea", Tea, "Preparing Black Tea tea"),
    ("Green Tea", Tea, "Preparing Green Tea tea"),
    ("Oolong Tea", Tea, "Preparing Oolong Tea tea"),
    ("Lemon Tea", Tea, "Preparing Lemon Tea tea"),
    ("Fruit Smoothies", ColdBeverage, "Preparing Fruit Smoothies"),
    ("Milkshakes", ColdBeverage, "Preparing Milkshakes"),
    ("Fruit Juices", ColdBeverage, "Preparing Fruit Juices"),
    ("Croissant", Bread, "Preparing Croissant bread"),
    ("Bun", Bread, "Preparing Bun bread"),
    ("Custard Bread", Bread, "Preparing Custard Bread bread"),
    ("Chocolate Cake", Cake, "Preparing Chocolate Cake cake"),
    ("Strawberry Cake", Cake, "Preparing Strawberry Cake cake"),
    ("Coconut Cake", Cake, "Preparing Coconut Cake cake"),
    ("Chocolate Chip Cookies", Cookie, "Preparing Chocolate Chip Cookies cookies"),
    ("Oat Cookies", Cookie, "Preparing Oat Cookies cookies"),
    ("Chicken Sandwich", Sandwich, "Preparing Chicken Sandwich sandwich"),
    ("Tuna Sandwich", Sandwich, "Preparing Tuna Sandwich sandwich"),
    ("Spaghetti", Pasta, "Preparing Spaghetti pasta"),
    ("Penne", Pasta, "Preparing Penne pasta"),
    ("Vegetable Salad", Salad, "Preparing Vegetable Salad salad"),
    ("Chicken Salad", Salad, "Preparing Chicken Salad salad"),
])
def test_create_item(item_type, expected_class, expected_output):
    category = {
        "Espresso": "Coffee",
        "Cappuccino": "Coffee",
        "Latte": "Coffee",
        "Mocha": "Coffee",
        "Americano": "Coffee",
        "Black Tea": "Tea",
        "Green Tea": "Tea",
        "Oolong Tea": "Tea",
        "Lemon Tea": "Tea",
        "Fruit Smoothies": "ColdBeverage",
        "Milkshakes": "ColdBeverage",
        "Fruit Juices": "ColdBeverage",
        "Croissant": "Bread",
        "Bun": "Bread",
        "Custard Bread": "Bread",
        "Chocolate Cake": "Cake",
        "Strawberry Cake": "Cake",
        "Coconut Cake": "Cake",
        "Chocolate Chip Cookies": "Cookie",
        "Oat Cookies": "Cookie",
        "Chicken Sandwich": "Sandwich",
        "Tuna Sandwich": "Sandwich",
        "Spaghetti": "Pasta",
        "Penne": "Pasta",
        "Vegetable Salad": "Salad",
        "Chicken Salad": "Salad",
    }[item_type]

    item = cafe.create_item(category, item_type)
    assert isinstance(item, expected_class)
    assert item.prepare() == expected_output

def test_create_invalid_item():
    assert cafe.create_item("Invalid Category", "Invalid Item") is None