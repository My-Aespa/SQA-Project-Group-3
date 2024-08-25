from abc import ABC, abstractmethod

class Beverage(ABC):
    @abstractmethod
    def prepare(self):
        pass

class Coffee(Beverage):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} กาแฟ")

class Tea(Beverage):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} ชา")

class ColdBeverage(Beverage):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} เครื่องดื่มเย็น")

class Pastry(ABC):
    @abstractmethod
    def prepare(self):
        pass

class Bread(Pastry):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} ขนมปัง")

class Cake(Pastry):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} เค้ก")

class Cookies(Pastry):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} คุกกี้")

class Snack(ABC):
    @abstractmethod
    def prepare(self):
        pass

class Sandwiches(Snack):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} แซนวิช")

class Pasta(Snack):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} พาสต้า")

class Salads(Snack):
    def __init__(self, type):
        self.type = type

    def prepare(self):
        print(f"กำลังเตรียม {self.type} สลัด")

class CafeOrder:
    def __init__(self):
        self.order = []

    def add_item(self, item_type, item_name):
        if item_type == "Beverage":
            if item_name == "Coffee":
                self.order.append(Coffee(item_name))
            elif item_name == "Tea":
                self.order.append(Tea(item_name))
            elif item_name == "Cold Beverage":
                self.order.append(ColdBeverage(item_name))
        elif item_type == "Pastry":
            if item_name == "Bread":
                self.order.append(Bread(item_name))
            elif item_name == "Cake":
                self.order.append(Cake(item_name))
            elif item_name == "Cookies":
                self.order.append(Cookies(item_name))
        elif item_type == "Snack":
            if item_name == "Sandwiches":
                self.order.append(Sandwiches(item_name))
            elif item_name == "Pasta":
                self.order.append(Pasta(item_name))
            elif item_name == "Salads":
                self.order.append(Salads(item_name))

    def prepare_order(self):
        for item in self.order:
            item.prepare()

# ตัวอย่างการใช้งาน
order = CafeOrder()
order.add_item("Beverage", "Coffee")
order.add_item("Pastry", "Cake")
order.add_item("Snack", "Sandwiches")

order.prepare_order()