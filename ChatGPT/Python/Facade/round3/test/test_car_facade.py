# test_car_facade.py
import pytest
from car_facade import CarFacade

def test_start_car():
    car = CarFacade()
    assert car.start_car() == "Engine started"

def test_stop_car():
    car = CarFacade()
    assert car.stop_car() == "Engine stopped"

def test_turn_on_lights():
    car = CarFacade()
    assert car.turn_on_lights() == "Lights turned on"

def test_turn_off_lights():
    car = CarFacade()
    assert car.turn_off_lights() == "Lights turned off"

def test_steer_left():
    car = CarFacade()
    assert car.steer_left() == "Steering turned left"

def test_steer_right():
    car = CarFacade()
    assert car.steer_right() == "Steering turned right"

def test_apply_brakes():
    car = CarFacade()
    assert car.apply_brakes() == "Brakes applied"

def test_release_brakes():
    car = CarFacade()
    assert car.release_brakes() == "Brakes released"
