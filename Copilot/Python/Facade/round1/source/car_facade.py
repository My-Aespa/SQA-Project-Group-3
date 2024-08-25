class CarFacade:
    def __init__(self):
        self.engine = Engine()
        self.lights = Lights()
        self.steering_wheel = SteeringWheel()
        self.brakes = Brakes()

    def start_engine(self):
        self.engine.start()

    def stop_engine(self):
        self.engine.stop()

    def turn_on_lights(self):
        self.lights.turn_on()

    def turn_off_lights(self):
        self.lights.turn_off()

    def turn_left(self):
        self.steering_wheel.turn_left()

    def turn_right(self):
        self.steering_wheel.turn_right()

    def apply_brakes(self):
        self.brakes.apply()

    def release_brakes(self):
        self.brakes.release()