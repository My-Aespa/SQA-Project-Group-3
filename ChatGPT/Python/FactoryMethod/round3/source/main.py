# main.py
from coffee_factory import order_coffee

if __name__ == "__main__":
    # Display welcome message
    print("Welcome to Coffee Shop")

    # รับประเภทกาแฟที่ผู้ใช้ต้องการสั่ง
    coffee_type = input("Please enter the type of coffee you want to order: ").strip().lower()

    # เรียกฟังก์ชัน order_coffee และแสดงผล
    result = order_coffee(coffee_type)
    if isinstance(result, tuple):
        preparation, serving = result
        print(f"\n{preparation}")
        print(f"{serving}")
    else:
        print(result)
