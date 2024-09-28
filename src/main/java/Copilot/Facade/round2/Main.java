package Copilot.Facade.round2;
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
        System.out.println("Starting the engine...");
        car.startEngine();

        System.out.println("Turning on the lights...");
        car.turnOnLights();

        System.out.println("Turning left...");
        car.turnLeft();

        System.out.println("Applying brakes...");
        car.applyBrakes();

        System.out.println("Releasing brakes...");
        car.releaseBrakes();

        System.out.println("Turning right...");
        car.turnRight();

        System.out.println("Turning off the lights...");
        car.turnOffLights();

        System.out.println("Stopping the engine...");
        car.stopEngine();
    }
}