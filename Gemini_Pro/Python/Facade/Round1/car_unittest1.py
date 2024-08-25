import pytest
from Gemini_Pro.Python.Facade.Round1.Car_code1 import CarFacade

# Mock classes
class MockEngine:
    def __init__(self):
        self.started = False

    def start(self):
        self.started = True
        print("MockEngine: สตาร์ทเครื่องยนต์")

    def stop(self):
        self.started = False
        print("MockEngine: ดับเครื่องยนต์")

class MockLights:
    def __init__(self):
        self.on = False

    def turn_on(self):
        self.on = True

    def turn_off(self):
        self.on = False

class MockSteeringWheel:
    def __init__(self):
        self.direction = "center"

    def turn_left(self):
        self.direction = "left"

    def turn_right(self):
        self.direction = "right"

class MockBrakes:
    def __init__(self):
        self.applied = False

    def apply(self):
        self.applied = True

    def release(self):
        self.applied = False

@pytest.fixture
def car_facade():
    # Create mock objects
    engine = MockEngine()
    lights = MockLights()
    steering = MockSteeringWheel()
    brakes = MockBrakes()

    # Create CarFacade instance and inject mocks
    car = CarFacade()
    car.engine = engine
    car.lights = lights
    car.steering = steering
    car.brakes = brakes

    return car, engine, lights, steering, brakes

def test_start_car(car_facade):
    car, engine, lights, _, _ = car_facade
    car.start_car()
    assert engine.started is True
    assert lights.on is True

def test_stop_car(car_facade):
    car, engine, lights, _, _ = car_facade
    car.stop_car()
    assert engine.started is False
    assert lights.on is False

def test_turn_left(car_facade):
    car, _, _, steering, _ = car_facade
    car.turn_left()
    assert steering.direction == "left"

def test_turn_right(car_facade):
    car, _, _, steering, _ = car_facade
    car.turn_right()
    assert steering.direction == "right"

def test_apply_brakes(car_facade):
    car, _, _, _, brakes = car_facade
    car.apply_brakes()
    assert brakes.applied is True

def test_release_brakes(car_facade):
    car, _, _, _, brakes = car_facade
    car.release_brakes()
    assert brakes.applied is False


# เพิ่มเติม Tests for Branch Coverage:
def test_start_car_engine_already_started(car_facade):
    car, engine, _, _, _ = car_facade
    engine.started = True  # ตั้งค่าให้ Engine เริ่มทำงานแล้ว
    car.start_car()
    # ตรวจสอบว่าไม่มีการเรียก engine.start() อีกครั้ง (เนื่องจาก Engine ทำงานอยู่แล้ว)
    assert engine.started is True 

def test_stop_car_engine_already_stopped(car_facade):
    car, engine, _, _, _ = car_facade
    engine.started = False  # ตั้งค่าให้ Engine ดับอยู่แล้ว
    car.stop_car()
    # ตรวจสอบว่าไม่มีการเรียก engine.stop() อีกครั้ง (เนื่องจาก Engine ดับอยู่แล้ว)
    assert engine.started is False
