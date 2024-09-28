package Copilot.Facade.round1;


public class CarFacade {
    private Engine engine;
    private Lights lights;
    private SteeringWheel steeringWheel;
    private Brakes brakes;

    public CarFacade(Engine engine, Lights lights, SteeringWheel steeringWheel, Brakes brakes) {
        this.engine = engine;
        this.lights = lights;
        this.steeringWheel = steeringWheel;
        this.brakes = brakes;
    }

    public void startEngine() {
        System.out.println("Starting the engine...");
        engine.start();
    }

    public void stopEngine() {
        System.out.println("Stopping the engine...");
        engine.stop();
    }

    public void turnOnLights() {
        System.out.println("Turning on the lights...");
        lights.turnOn();
    }

    public void turnOffLights() {
        System.out.println("Turning off the lights...");
        lights.turnOff();
    }

    public void turnLeft() {
        System.out.println("Turning left...");
        steeringWheel.turnLeft();
    }

    public void turnRight() {
        System.out.println("Turning right...");
        steeringWheel.turnRight();
    }

    public void applyBrakes() {
        System.out.println("Applying brakes...");
        brakes.apply();
    }

    public void releaseBrakes() {
        System.out.println("Releasing brakes...");
        brakes.release();
    }
}