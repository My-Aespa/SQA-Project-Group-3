# order.py

from factories import CoffeeFactory, PastryFactory, SnackFactory

def order_item(factory, item_type):
    item = factory.create_beverage(item_type) if isinstance(factory, CoffeeFactory) else \
           factory.create_pastry(item_type) if isinstance(factory, PastryFactory) else \
           factory.create_snack(item_type)
    return item.prepare()

# Example usage:
if __name__ == "__main__":
    coffee_factory = CoffeeFactory()
    pastry_factory = PastryFactory()
    snack_factory = SnackFactory()
    
    print(order_item(coffee_factory, "Espresso"))  # Outputs: Preparing Espresso
    print(order_item(pastry_factory, "Croissant"))  # Outputs: Preparing Croissant
    print(order_item(snack_factory, "Spaghetti"))   # Outputs: Preparing Spaghetti
