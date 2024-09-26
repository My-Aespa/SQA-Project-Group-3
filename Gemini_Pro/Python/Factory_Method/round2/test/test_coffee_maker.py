import pytest
from coffee_maker import CoffeeFactory, Americano, Latte, Cappuccino, Espresso, Mocha


@pytest.fixture
def coffee_factory():
    return CoffeeFactory()


@pytest.mark.parametrize(
    "coffee_type, expected_class",
    [
        ("Americano", Americano),
        ("Latte", Latte),
        ("Cappuccino", Cappuccino),
        ("Espresso", Espresso),
        ("Mocha", Mocha),
    ],
)
def test_create_coffee(coffee_factory, coffee_type, expected_class):
    coffee = coffee_factory.create_coffee(coffee_type)
    assert isinstance(coffee, expected_class)


def test_create_coffee_invalid_type(coffee_factory):
    with pytest.raises(ValueError):
        coffee_factory.create_coffee("InvalidCoffee")


def test_coffee_prepare(coffee_factory):
    coffee = coffee_factory.create_coffee("Espresso")
    assert coffee.prepare() == "Brewing a shot of espresso"


def test_coffee_serve(coffee_factory):
    coffee = coffee_factory.create_coffee("Mocha")
    assert coffee.serve() == "Serving a cup of Mocha"