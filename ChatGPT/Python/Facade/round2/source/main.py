# main.py
from car_facade import CarFacade

def main():
    car = CarFacade()
    car.start_car()
    car.turn_left()
    car.apply_brakes()
    car.release_brakes()
    car.turn_right()
    car.stop_car()

if __name__ == "__main__":
    main()
