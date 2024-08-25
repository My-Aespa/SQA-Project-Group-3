public class Engine {
    public void start() {
        System.out.println("เครื่องยนต์สตาร์ท");
    }

    public void stop() {
        System.out.println("เครื่องยนต์ดับ");
    }
}

public class Lights {
    public void turnOn() {
        System.out.println("ไฟหน้าเปิด");
    }

    public void turnOff() {
        System.out.println("ไฟหน้าปิด");
    }
}

public class SteeringWheel {
    public void turnLeft() {
        System.out.println("เลี้ยวซ้าย");
    }

    public void turnRight() {
        System.out.println("เลี้ยวขวา");
    }
}

public class Brakes {
    public void apply() {
        System.out.println("เบรก");
    }

    public void release() {
        System.out.println("ปลดเบรก");
    }
}

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