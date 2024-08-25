import pytest
from Car_code3 import CarFacade, Engine, Lights, SteeringWheel, Brakes

# Mock classes 
class MockEngine(Engine):
    pass

class MockLights(Lights):
    pass

class MockSteeringWheel(SteeringWheel):
    pass

class MockBrakes(Brakes):
    pass

@pytest.fixture
def car_facade():
    engine = MockEngine()
    lights = MockLights()
    steering = MockSteeringWheel()
    brakes = MockBrakes()

    car = CarFacade()
    car.engine = engine
    car.lights = lights
    car.steering = steering
    car.brakes = brakes

    return car, engine, lights, steering, brakes

# Tests for Statement Coverage:
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

# Tests for Branch Coverage:
def test_start_car_engine_already_started(car_facade):
    car, engine, _, _, _ = car_facade
    engine.started = True
    car.start_car()
    assert engine.started is True

def test_stop_car_engine_already_stopped(car_facade):
    car, engine, _, _, _ = car_facade
    engine.started = False
    car.stop_car()
    assert engine.started is False