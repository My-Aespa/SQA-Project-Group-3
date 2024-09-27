# main.py

# Import module จากโฟลเดอร์ source
from coffee_factory import order_coffee

# รับประเภทของกาแฟจากผู้ใช้
def main():
    print("Welcome to the Coffee Shop!")
    print("Available coffee types: Americano, Latte, Cappuccino, Espresso, Mocha")
    
    # รับประเภทกาแฟจากผู้ใช้
    coffee_type = input("Please enter the coffee type you'd like to order: ")
    
    # สั่งเครื่องดื่มตามประเภทที่ผู้ใช้เลือก
    result = order_coffee(coffee_type)
    
    # แสดงผลลัพธ์การเตรียมและเสิร์ฟเครื่องดื่ม
    print(result)

# เรียกใช้งานฟังก์ชัน main
if __name__ == "__main__":
    main()
