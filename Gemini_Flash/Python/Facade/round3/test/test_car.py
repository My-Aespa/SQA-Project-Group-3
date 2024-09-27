import sys
import os 
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'source')))
import pytest
from Car import Engine, Lights, SteeringWheel, Brakes, Car  # เปลี่ยน 'your_module' เป็นชื่อโมดูลของคุณ

class TestCar:
    def test_start_engine(self, capsys):
        car = Car()
        car.start_engine()
        captured = capsys.readouterr()
        assert "เครื่องยนต์สตาร์ท" in captured.out

    def test_stop_engine(self, capsys):
        car = Car()
        car.stop_engine()
        captured = capsys.readouterr()
        assert "เครื่องยนต์ดับ" in captured.out

    def test_turn_on_lights(self, capsys):
        car = Car()
        car.turn_on_lights()
        captured = capsys.readouterr()
        assert "ไฟหน้าเปิด" in captured.out

    def test_turn_off_lights(self, capsys):
        car = Car()
        car.turn_off_lights()
        captured = capsys.readouterr()
        assert "ไฟหน้าปิด" in captured.out

    def test_turn_left(self, capsys):
        car = Car()
        car.turn_left()
        captured = capsys.readouterr()
        assert "เลี้ยวซ้าย" in captured.out

    def test_turn_right(self, capsys):
        car = Car()
        car.turn_right()
        captured = capsys.readouterr()
        assert "เลี้ยวขวา" in captured.out

    def test_apply_brakes(self, capsys):
        car = Car()
        car.apply_brakes()
        captured = capsys.readouterr()
        assert "เบรก" in captured.out

    def test_release_brakes(self, capsys):
        car = Car()
        car.release_brakes()
        captured = capsys.readouterr()
        assert "ปลดเบรก" in captured.out

class TestEngine:
    def test_start(self, capsys):
        engine = Engine()
        engine.start()
        captured = capsys.readouterr()
        assert "เครื่องยนต์สตาร์ท" in captured.out

    def test_stop(self, capsys):
        engine = Engine()
        engine.stop()
        captured = capsys.readouterr()
        assert "เครื่องยนต์ดับ" in captured.out

class TestLights:
    def test_turn_on(self, capsys):
        lights = Lights()
        lights.turn_on()
        captured = capsys.readouterr()
        assert "ไฟหน้าเปิด" in captured.out

    def test_turn_off(self, capsys):
        lights = Lights()
        lights.turn_off()
        captured = capsys.readouterr()
        assert "ไฟหน้าปิด" in captured.out

class TestSteeringWheel:
    def test_turn_left(self, capsys):
        steering_wheel = SteeringWheel()
        steering_wheel.turn_left()
        captured = capsys.readouterr()
        assert "เลี้ยวซ้าย" in captured.out

    def test_turn_right(self, capsys):
        steering_wheel = SteeringWheel()
        steering_wheel.turn_right()
        captured = capsys.readouterr()
        assert "เลี้ยวขวา" in captured.out

class TestBrakes:
    def test_apply(self, capsys):
        brakes = Brakes()
        brakes.apply()
        captured = capsys.readouterr()
        assert "เบรก" in captured.out

    def test_release(self, capsys):
        brakes = Brakes()
        brakes.release()
        captured = capsys.readouterr()
        assert "ปลดเบรก" in captured.out