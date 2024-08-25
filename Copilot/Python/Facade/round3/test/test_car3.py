# test_car_facade.py
import pytest
from unittest.mock import MagicMock
from car_facade import CarFacade

@pytest.fixture
def car_facade():
    car_facade = CarFacade()
    car_facade.engine = MagicMock()
    car_facade.lights = MagicMock()
    car_facade.steering_wheel = MagicMock()
    car_facade.brakes = MagicMock()
    return car_facade

def test_start_engine(car_facade):
    car_facade.start_engine()
    car_facade.engine.start.assert_called_once()

def test_stop_engine(car_facade):
    car_facade.stop_engine()
    car_facade.engine.stop.assert_called_once()

def test_turn_on_lights(car_facade):
    car_facade.turn_on_lights()
    car_facade.lights.turn_on.assert_called_once()

def test_turn_off_lights(car_facade):
    car_facade.turn_off_lights()
    car_facade.lights.turn_off.assert_called_once()

def test_turn_left(car_facade):
    car_facade.turn_left()
    car_facade.steering_wheel.turn_left.assert_called_once()

def test_turn_right(car_facade):
    car_facade.turn_right()
    car_facade.steering_wheel.turn_right.assert_called_once()

def test_apply_brakes(car_facade):
    car_facade.apply_brakes()
    car_facade.brakes.apply.assert_called_once()

def test_release_brakes(car_facade):
    car_facade.release_brakes()
    car_facade.brakes.release.assert_called_once()