# car_facade.py
from engine import Engine
from lights import Lights
from steering import Steering
from brakes import Brakes

class CarFacade:
    def __init__(self):
        self.engine = Engine()
        self.lights = Lights()
        self.steering = Steering()
        self.brakes = Brakes()

    def start_car(self):
        self.engine.start_engine()
        self.lights.turn_on_headlights()

    def stop_car(self):
        self.lights.turn_off_headlights()
        self.engine.stop_engine()

    def turn_left(self):
        self.steering.turn_left()

    def turn_right(self):
        self.steering.turn_right()

    def apply_brakes(self):
        self.brakes.apply_brakes()

    def release_brakes(self):
        self.brakes.release_brakes()