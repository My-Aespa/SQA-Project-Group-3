import pytest
from your_module import Engine, Lights, SteeringWheel, Brakes, Car  # เปลี่ยน 'your_module' เป็นชื่อโมดูลของคุณ

class TestCar:
    def test_start_engine(self):
        car = Car()
        car.start_engine()
        assert "เครื่องยนต์สตาร์ท" in capsys.readouterr().out

    def test_stop_engine(self):
        car = Car()
        car.stop_engine()
        assert "เครื่องยนต์ดับ" in capsys.readouterr().out

    def test_turn_on_lights(self):
        car = Car()
        car.turn_on_lights()
        assert "ไฟหน้าเปิด" in capsys.readouterr().out

    def test_turn_off_lights(self):
        car = Car()
        car.turn_off_lights()
        assert "ไฟหน้าปิด" in capsys.readouterr().out

    def test_turn_left(self):
        car = Car()
        car.turn_left()
        assert "เลี้ยวซ้าย" in capsys.readouterr().out

    def test_turn_right(self):
        car = Car()
        car.turn_right()
        assert "เลี้ยวขวา" in capsys.readouterr().out

    def test_apply_brakes(self):
        car = Car()
        car.apply_brakes()
        assert "เบรก" in capsys.readouterr().out

    def test_release_brakes(self):
        car = Car()
        car.release_brakes()
        assert "ปลดเบรก" in capsys.readouterr().out

class TestEngine:
    def test_start(self):
        engine = Engine()
        engine.start()
        assert "เครื่องยนต์สตาร์ท" in capsys.readouterr().out

    def test_stop(self):
        engine = Engine()
        engine.stop()
        assert "เครื่องยนต์ดับ" in capsys.readouterr().out

class TestLights:
    def test_turn_on(self):
        lights = Lights()
        lights.turn_on()
        assert "ไฟหน้าเปิด" in capsys.readouterr().out

    def test_turn_off(self):
        lights = Lights()
        lights.turn_off()
        assert "ไฟหน้าปิด" in capsys.readouterr().out

class TestSteeringWheel:
    def test_turn_left(self):
        steering_wheel = SteeringWheel()
        steering_wheel.turn_left()
        assert "เลี้ยวซ้าย" in capsys.readouterr().out

    def test_turn_right(self):
        steering_wheel = SteeringWheel()
        steering_wheel.turn_right()
        assert "เลี้ยวขวา" in capsys.readouterr().out

class TestBrakes:
    def test_apply(self):
        brakes = Brakes()
        brakes.apply()
        assert "เบรก" in capsys.readouterr().out

    def test_release(self):
        brakes = Brakes()
        brakes.release()
        assert "ปลดเบรก" in capsys.readouterr().out