# main.py
from car_facade import CarFacade

def main():
    # สร้าง object car โดยใช้ CarFacade
    car = CarFacade()
    
    # ทดสอบการทำงานของฟังก์ชันต่าง ๆ
    print(car.start_car())         # เริ่มสตาร์ทรถยนต์
    print(car.turn_on_lights())    # เปิดไฟรถ
    print(car.steer_left())        # เลี้ยวซ้าย
    print(car.apply_brakes())      # เบรก
    print(car.release_brakes())    # ปลดเบรก
    print(car.steer_right())       # เลี้ยวขวา
    print(car.turn_off_lights())   # ปิดไฟรถ
    print(car.stop_car())          # ดับเครื่องยนต์

if __name__ == "__main__":
    main()
