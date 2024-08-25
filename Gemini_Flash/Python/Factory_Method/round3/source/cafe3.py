from abc import ABC, abstractmethod

class MenuItem(ABC):
    @abstractmethod
    def prepare(self):
        pass

# เครื่องดื่ม (Beverages)
class Coffee(MenuItem):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} กาแฟ")

class Tea(MenuItem):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} ชา")

class ColdBeverage(MenuItem):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} เครื่องดื่มเย็น")

# ขนม (Pastries)
class Bread(MenuItem):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} ขนมปัง")

class Cake(MenuItem):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} เค้ก")

class Cookies(MenuItem):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} คุกกี้")

# อาหารว่าง (Snacks)
class Sandwiches(MenuItem):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} แซนวิช")

class Pasta(MenuItem):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} พาสต้า")

class Salads(MenuItem):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} สลัด")


class CafeOrder:
    def __init__(self):
        self.order = []

    def create_item(self, item_type, item_name):
        if item_type == "Beverage":
            if item_name == "Espresso":
                return Coffee("Espresso")
            elif item_name == "Cappuccino":
                return Coffee("Cappuccino")
            elif item_name == "Latte":
                return Coffee("Latte")
            elif item_name == "Mocha":
                return Coffee("Mocha")
            elif item_name == "Americano":
                return Coffee("Americano")
            elif item_name == "Black Tea":
                return Tea("Black Tea")
            elif item_name == "Green Tea":
                return Tea("Green Tea")
            elif item_name == "Oolong Tea":
                return Tea("Oolong Tea")
            elif item_name == "Lemon Tea":
                return Tea("Lemon Tea")
            elif item_name == "Fruit Smoothies":
                return ColdBeverage("Fruit Smoothies")
            elif item_name == "Milkshakes":
                return ColdBeverage("Milkshakes")
            elif item_name == "Fruit Juices":
                return ColdBeverage("Fruit Juices")
        elif item_type == "Pastry":
            if item_name == "Croissant":
                return Bread("Croissant")
            elif item_name == "Bun":
                return Bread("Bun")
            elif item_name == "Custard Bread":
                return Bread("Custard Bread")
            elif item_name == "Chocolate Cake":
                return Cake("Chocolate Cake")
            elif item_name == "Strawberry Cake":
                return Cake("Strawberry Cake")
            elif item_name == "Coconut Cake":
                return Cake("Coconut Cake")
            elif item_name == "Chocolate Chip Cookies":
                return Cookies("Chocolate Chip Cookies")
            elif item_name == "Oat Cookies":
                return Cookies("Oat Cookies")
        elif item_type == "Snack":
            if item_name == "Chicken Sandwich":
                return Sandwiches("Chicken Sandwich")
            elif item_name == "Tuna Sandwich":
                return Sandwiches("Tuna Sandwich")
            elif item_name == "Spaghetti":
                return Pasta("Spaghetti")
            elif item_name == "Penne":
                return Pasta("Penne")
            elif item_name == "Vegetable Salad":
                return Salads("Vegetable Salad")
            elif item_name == "Chicken Salad":
                return Salads("Chicken Salad")
        return None  # ถ้ารายการไม่ถูกต้อง

    def add_item(self, item_type, item_name):
        item = self.create_item(item_type, item_name)
        if item is not None:
            self.order.append(item)

    def prepare_order(self):
        for item in self.order:
            item.prepare()

# ตัวอย่างการใช้งาน
order = CafeOrder()
order.add_item("Beverage", "Espresso")
order.add_item("Pastry", "Chocolate Cake")
order.add_item("Snack", "Chicken Sandwich")

order.prepare_order()