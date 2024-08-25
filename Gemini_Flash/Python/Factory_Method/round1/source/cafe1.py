from abc import ABC, abstractmethod

class MenuItem(ABC):
    @abstractmethod
    def serve(self):
        pass

# เครื่องดื่ม (Beverages)
class Espresso(MenuItem):
    def serve(self):
        print("เสิร์ฟ เอสเปรสโซ")

class Latte(MenuItem):
    def serve(self):
        print("เสิร์ฟ ลาเต้")

class Milkshakes(MenuItem):
    def serve(self):
        print("เสิร์ฟ นมปั่น")

class FruitJuices(MenuItem):
    def serve(self):
        print("เสิร์ฟ น้ำผลไม้")

# ขนม (Pastries)
class Croissant(MenuItem):
    def serve(self):
        print("เสิร์ฟ ครัวซองต์")

class ChocolateCake(MenuItem):
    def serve(self):
        print("เสิร์ฟ เค้กช็อกโกแลต")

class ChocolateChipCookies(MenuItem):
    def serve(self):
        print("เสิร์ฟ คุกกี้ช็อกโกแลตชิป")

# อาหารว่าง (Snacks)
class TunaSandwich(MenuItem):
    def serve(self):
        print("เสิร์ฟ แซนวิชทูน่า")

class Spaghetti(MenuItem):
    def serve(self):
        print("เสิร์ฟ สปาเก็ตตี้")

class VegetableSalad(MenuItem):
    def serve(self):
        print("เสิร์ฟ สลัดผัก")

class CafeOrder:
    def __init__(self):
        self.order = []

    def create_item(self, item_name):
        if item_name == "Espresso":
            return Espresso()
        elif item_name == "Latte":
            return Latte()
        elif item_name == "Milkshakes":
            return Milkshakes()
        elif item_name == "Fruit Juices":
            return FruitJuices()
        elif item_name == "Croissant":
            return Croissant()
        elif item_name == "Chocolate Cake":
            return ChocolateCake()
        elif item_name == "Chocolate Chip Cookies":
            return ChocolateChipCookies()
        elif item_name == "Tuna Sandwich":
            return TunaSandwich()
        elif item_name == "Spaghetti":
            return Spaghetti()
        elif item_name == "Vegetable Salad":
            return VegetableSalad()
        return None

    def add_item(self, item_name):
        item = self.create_item(item_name)
        if item is not None:
            self.order.append(item)

    def serve_order(self):
        for item in self.order:
            item.serve()

# ตัวอย่างการใช้งาน
order = CafeOrder()
order.add_item("Espresso")
order.add_item("Chocolate Cake")
order.add_item("Tuna Sandwich")

order.serve_order()