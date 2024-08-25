# client.py

from factory import BeverageFactory, PastryFactory, SnackFactory

def order_item(factory, item_type):
    item = factory.create_beverage(item_type) if isinstance(factory, BeverageFactory) else \
           factory.create_pastry(item_type) if isinstance(factory, PastryFactory) else \
           factory.create_snack(item_type) if isinstance(factory, SnackFactory) else None
    
    if item:
        return item.serve()
    else:
        return "Invalid order"

# Example usage:
beverage_factory = BeverageFactory()
print(order_item(beverage_factory, "Latte"))

pastry_factory = PastryFactory()
print(order_item(pastry_factory, "Croissant"))

snack_factory = SnackFactory()
print(order_item(snack_factory, "Spaghetti"))
