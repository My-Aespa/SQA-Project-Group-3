package Gemini_Flash.Facade.round2;

public class Car {
    private Engine engine;
    private Lights lights;
    private SteeringWheel steeringWheel;
    private Brakes brakes;

    public Car() {
        engine = new Engine();
        lights = new Lights();
        steeringWheel = new SteeringWheel();
        brakes = new Brakes();
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

    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.startEngine();
        myCar.turnOnLights();
        myCar.turnLeft();
        myCar.applyBrakes();

        myCar.stopEngine();
        myCar.turnOffLights();
        myCar.releaseBrakes();
    }
}