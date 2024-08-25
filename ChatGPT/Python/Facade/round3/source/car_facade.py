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
        return self.engine.start()

    def stop_car(self):
        return self.engine.stop()

    def turn_on_lights(self):
        return self.lights.turn_on()

    def turn_off_lights(self):
        return self.lights.turn_off()

    def steer_left(self):
        return self.steering.turn_left()

    def steer_right(self):
        return self.steering.turn_right()

    def apply_brakes(self):
        return self.brakes.apply()

    def release_brakes(self):
        return self.brakes.release()