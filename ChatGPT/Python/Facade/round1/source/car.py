# car.py
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
        self.engine.start()
        self.lights.turn_on()

    def stop_car(self):
        self.lights.turn_off()
        self.engine.stop()

    def turn_left(self):
        self.steering.turn_left()

    def turn_right(self):
        self.steering.turn_right()

    def apply_brakes(self):
        self.brakes.apply()

    def release_brakes(self):
        self.brakes.release()
