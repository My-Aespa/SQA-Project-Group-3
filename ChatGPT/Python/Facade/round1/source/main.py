# main.py
from car import CarFacade

def main():
    car = CarFacade()  # สร้าง Object ของ CarFacade

    print("=== Start Car ===")
    car.start_car()  # เริ่มต้นการสตาร์ทรถ

    print("\n=== Turn Left ===")
    car.turn_left()  # เลี้ยวซ้าย

    print("\n=== Apply Brakes ===")
    car.apply_brakes()  # เบรก

    print("\n=== Release Brakes ===")
    car.release_brakes()  # ปลดเบรก

    print("\n=== Stop Car ===")
    car.stop_car()  # ดับเครื่องยนต์และปิดไฟ

if __name__ == "__main__":
    main()
