from coffee_shop import CoffeeFactory, Americano, Latte, Cappuccino, Espresso, Mocha

def test_create_americano():
    factory = CoffeeFactory()
    coffee = factory.create_coffee("Americano")
    assert isinstance(coffee, Americano)

def test_create_latte():
    factory = CoffeeFactory()
    coffee = factory.create_coffee("Latte")
    assert isinstance(coffee, Latte)

def test_create_cappuccino():
    factory = CoffeeFactory()
    coffee = factory.create_coffee("Cappuccino")
    assert isinstance(coffee, Cappuccino)

def test_create_espresso():
    factory = CoffeeFactory()
    coffee = factory.create_coffee("Espresso")
    assert isinstance(coffee, Espresso)

def test_create_mocha():
    factory = CoffeeFactory()
    coffee = factory.create_coffee("Mocha")
    assert isinstance(coffee, Mocha)

def test_create_invalid_coffee():
    factory = CoffeeFactory()
    try:
        factory.create_coffee("Invalid Coffee")
    except ValueError as e:
        assert str(e) == "Invalid coffee type selected."