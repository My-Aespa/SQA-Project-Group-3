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
        engine.start();
    }

    public void stopEngine() {
        engine.stop();
    }

    public void turnOnLights() {
        lights.turnOn();
    }

    public void turnOffLights() {
        lights.turnOff();
    }

    public void turnLeft() {
        steeringWheel.turnLeft();
    }

    public void turnRight() {
        steeringWheel.turnRight();
    }

    public void applyBrakes() {
        brakes.apply();
    }

    public void releaseBrakes() {
        brakes.release();
    }
}