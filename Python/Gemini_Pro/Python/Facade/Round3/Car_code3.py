class Engine:
    """Subsystem: เครื่องยนต์"""
    def __init__(self):
        self.started = False

    def start(self):
        self.started = True
        print("สตาร์ทเครื่องยนต์")

    def stop(self):
        self.started = False
        print("ดับเครื่องยนต์")


class Lights:
    """Subsystem: ไฟรถ"""
    def __init__(self):
        self.on = False

    def turn_on(self):
        self.on = True
        print("เปิดไฟหน้า")

    def turn_off(self):
        self.on = False
        print("ปิดไฟหน้า")


class SteeringWheel:
    """Subsystem: พวงมาลัย"""
    def __init__(self):
        self.direction = "center"

    def turn_left(self):
        self.direction = "left"
        print("เลี้ยวซ้าย")

    def turn_right(self):
        self.direction = "right"
        print("เลี้ยวขวา")


class Brakes:
    """Subsystem: เบรก"""
    def __init__(self):
        self.applied = False

    def apply(self):
        self.applied = True
        print("เบรก")

    def release(self):
        self.applied = False
        print("ปลดเบรก")


class CarFacade:
    """Facade: รถยนต์"""
    def __init__(self):
        self.engine = Engine()
        self.lights = Lights()
        self.steering = SteeringWheel()
        self.brakes = Brakes()

    def start_car(self):
        """เริ่มการทำงานของรถยนต์"""
        print("Starting the car...")
        self.engine.start()
        self.lights.turn_on()
        print("Car is ready to go!")

    def stop_car(self):
        """หยุดการทำงานของรถยนต์"""
        print("Stopping the car...")
        self.engine.stop()
        self.lights.turn_off()
        print("Car has been stopped.")

    def turn_left(self):
        """เลี้ยวซ้าย"""
        print("Executing left turn...")
        self.steering.turn_left()

    def turn_right(self):
        """เลี้ยวขวา"""
        print("Executing right turn...")
        self.steering.turn_right()

    def apply_brakes(self):
        """เบรก"""
        print("Applying brakes...")
        self.brakes.apply()

    def release_brakes(self):
        """ปลดเบรก"""
        print("Releasing brakes...")
        self.brakes.release()