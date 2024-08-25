from menu_factory import BeverageFactory, PastryFactory, SnackFactory

class Cafe:
    def __init__(self):
        self.beverage_factory = BeverageFactory()
        self.pastry_factory = PastryFactory()
        self.snack_factory = SnackFactory()

    def order_item(self, category, type):
        if category == "Beverage":
            return self.beverage_factory.create_menu_item(type)
        elif category == "Pastry":
            return self.pastry_factory.create_menu_item(type)
        elif category == "Snack":
            return self.snack_factory.create_menu_item(type)
        else:
            raise ValueError("Unknown category")