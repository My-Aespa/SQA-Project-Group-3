package Copilot.Facade.round1;

public class Main {
    public static void main(String[] args) {
        // Instantiate components
        Engine engine = new Engine();
        Lights lights = new Lights();
        SteeringWheel steeringWheel = new SteeringWheel();
        Brakes brakes = new Brakes();

        // Instantiate CarFacade
        CarFacade car = new CarFacade(engine, lights, steeringWheel, brakes);

        // Demonstrate functionality with print statements
        car.startEngine();
        car.turnOnLights();
        car.turnLeft();
        car.applyBrakes();
        car.releaseBrakes();
        car.turnRight();
        car.turnOffLights();
        car.stopEngine();
    }
}