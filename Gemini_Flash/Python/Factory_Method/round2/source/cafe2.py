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
            if item_name == "Coffee":
                return Coffee(item_name)
            elif item_name == "Tea":
                return Tea(item_name)
            elif item_name == "Cold Beverage":
                return ColdBeverage(item_name)
        elif item_type == "Pastry":
            if item_name == "Bread":
                return Bread(item_name)
            elif item_name == "Cake":
                return Cake(item_name)
            elif item_name == "Cookies":
                return Cookies(item_name)
        elif item_type == "Snack":
            if item_name == "Sandwiches":
                return Sandwiches(item_name)
            elif item_name == "Pasta":
                return Pasta(item_name)
            elif item_name == "Salads":
                return Salads(item_name)
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
order.add_item("Beverage", "Coffee")
order.add_item("Pastry", "Cake")
order.add_item("Snack", "Sandwiches")

order.prepare_order()