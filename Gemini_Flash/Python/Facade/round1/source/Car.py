class Engine:
    def start(self):
        print("เครื่องยนต์สตาร์ท")

    def stop(self):
        print("เครื่องยนต์ดับ")

class Lights:
    def turn_on(self):
        print("ไฟหน้าเปิด")

    def turn_off(self):
        print("ไฟหน้าปิด")

class SteeringWheel:
    def turn_left(self):
        print("เลี้ยวซ้าย")

    def turn_right(self):
        print("เลี้ยวขวา")

class Brakes:
    def apply(self):
        print("เบรก")

    def release(self):
        print("ปลดเบรก")

class Car:
    def __init__(self):
        self.engine = Engine()
        self.lights = Lights()
        self.steering_wheel = SteeringWheel()
        self.brakes = Brakes()

    def start_engine(self):
        self.engine.start()

    def stop_engine(self):
        self.engine.stop()

    def turn_on_lights(self):
        self.lights.turn_on()

    def turn_off_lights(self):
        self.lights.turn_off()

    def turn_left(self):
        self.steering_wheel.turn_left()

    def turn_right(self):
        self.steering_wheel.turn_right()

    def apply_brakes(self):
        self.brakes.apply()

    def release_brakes(self):
        self.brakes.release()

# ตัวอย่างการใช้งาน
my_car = Car()

my_car.start_engine()
my_car.turn_on_lights()
my_car.turn_left()
my_car.apply_brakes()

my_car.stop_engine()
my_car.turn_off_lights()
my_car.release_brakes()