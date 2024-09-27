import pytest
from Gemini_Pro.Python.Facade.Round2.source.Car_code2 import CarFacade

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

# Fixture to create mock car with facade
@pytest.fixture
def car_facade():
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

    return car

# Test cases for CarFacade functionality
def test_start_car(car_facade):
    car_facade.start_car()
    assert car_facade.engine.started is True
    assert car_facade.lights.on is True

def test_stop_car(car_facade):
    car_facade.stop_car()
    assert car_facade.engine.started is False
    assert car_facade.lights.on is False

def test_turn_left(car_facade):
    car_facade.turn_left()
    assert car_facade.steering.direction == "left"

def test_turn_right(car_facade):
    car_facade.turn_right()
    assert car_facade.steering.direction == "right"

def test_apply_brakes(car_facade):
    car_facade.apply_brakes()
    assert car_facade.brakes.applied is True

def test_release_brakes(car_facade):
    car_facade.release_brakes()
    assert car_facade.brakes.applied is False

# Additional tests for branch coverage
def test_start_car_engine_already_started(car_facade):
    car_facade.engine.started = True
    car_facade.start_car()
    assert car_facade.engine.started is True  # Engine should remain started

def test_stop_car_engine_already_stopped(car_facade):
    car_facade.engine.started = False
    car_facade.stop_car()
    assert car_facade.engine.started is False  # Engine should remain stopped
