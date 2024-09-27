# test_car_facade.py
import pytest
import sys
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'source')))
from car_facade import CarFacade

@pytest.fixture
def facade():
    """
    Fixture เพื่อสร้าง CarFacade instance ใหม่สำหรับการทดสอบทุกครั้ง
    """
    return CarFacade()

def test_start_car(facade):
    """
    ทดสอบการ start_car() โดยเรียกใช้งานและตรวจสอบว่าไม่มีข้อผิดพลาดเกิดขึ้น
    """
    facade.start_car()  # ควรทำงานได้โดยไม่มี exception

def test_stop_car(facade):
    """
    ทดสอบการ stop_car() โดยเรียกใช้งานและตรวจสอบว่าไม่มีข้อผิดพลาดเกิดขึ้น
    """
    facade.stop_car()  # ควรทำงานได้โดยไม่มี exception

def test_turn_left(facade):
    """
    ทดสอบการ turn_left() โดยเรียกใช้งานและตรวจสอบว่าไม่มีข้อผิดพลาดเกิดขึ้น
    """
    facade.turn_left()  # ควรทำงานได้โดยไม่มี exception

def test_turn_right(facade):
    """
    ทดสอบการ turn_right() โดยเรียกใช้งานและตรวจสอบว่าไม่มีข้อผิดพลาดเกิดขึ้น
    """
    facade.turn_right()  # ควรทำงานได้โดยไม่มี exception

def test_apply_brakes(facade):
    """
    ทดสอบการ apply_brakes() โดยเรียกใช้งานและตรวจสอบว่าไม่มีข้อผิดพลาดเกิดขึ้น
    """
    facade.apply_brakes()  # ควรทำงานได้โดยไม่มี exception

def test_release_brakes(facade):
    """
    ทดสอบการ release_brakes() โดยเรียกใช้งานและตรวจสอบว่าไม่มีข้อผิดพลาดเกิดขึ้น
    """
    facade.release_brakes()  # ควรทำงานได้โดยไม่มี exception

def test_combined_operations(facade):
    """
    ทดสอบการทำงานแบบต่อเนื่องของฟังก์ชันหลายๆ ฟังก์ชัน เพื่อให้แน่ใจว่าไม่มีข้อผิดพลาด
    """
    facade.start_car()
    facade.turn_left()
    facade.apply_brakes()
    facade.release_brakes()
    facade.turn_right()
    facade.stop_car()
