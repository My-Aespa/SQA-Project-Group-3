from car_facade import CarFacade

def main():
    # Instantiate CarFacade
    car = CarFacade()

    # Demonstrate functionality with print statements
    print("Starting the engine...")
    car.start_engine()

    print("Turning on the lights...")
    car.turn_on_lights()

    print("Turning left...")
    car.turn_left()

    print("Applying brakes...")
    car.apply_brakes()

    print("Releasing brakes...")
    car.release_brakes()

    print("Turning right...")
    car.turn_right()

    print("Turning off the lights...")
    car.turn_off_lights()

    print("Stopping the engine...")
    car.stop_engine()

if __name__ == "__main__":
    main()