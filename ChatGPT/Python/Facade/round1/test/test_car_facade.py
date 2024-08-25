# test_car_facade.py
import pytest
from car import CarFacade

@pytest.fixture
def car():
    return CarFacade()

def test_start_car(car, capsys):
    car.start_car()
    captured = capsys.readouterr()
    assert "Engine started" in captured.out
    assert "Lights turned on" in captured.out

def test_stop_car(car, capsys):
    car.stop_car()
    captured = capsys.readouterr()
    assert "Lights turned off" in captured.out
    assert "Engine stopped" in captured.out

def test_turn_left(car, capsys):
    car.turn_left()
    captured = capsys.readouterr()
    assert "Turning left" in captured.out

def test_turn_right(car, capsys):
    car.turn_right()
    captured = capsys.readouterr()
    assert "Turning right" in captured.out

def test_apply_brakes(car, capsys):
    car.apply_brakes()
    captured = capsys.readouterr()
    assert "Brakes applied" in captured.out

def test_release_brakes(car, capsys):
    car.release_brakes()
    captured = capsys.readouterr()
    assert "Brakes released" in captured.out
