public class CarFacade {
    private Engine engine;
    private Lights lights;
    private SteeringWheel steeringWheel;
    private Brakes brakes;

    public CarFacade() {
        this.engine = new Engine();
        this.lights = new Lights();
        this.steeringWheel = new SteeringWheel();
        this.brakes = new Brakes();
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