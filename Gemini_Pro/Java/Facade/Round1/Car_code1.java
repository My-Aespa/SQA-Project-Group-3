public class Car_code1 {

    static class Engine {
        private boolean started;

        public void start() {
            started = true;
            System.out.println("สตาร์ทเครื่องยนต์");
        }

        public void stop() {
            started = false;
            System.out.println("ดับเครื่องยนต์");
        }

        public boolean isStarted() {
            return started;
        }
    }

    static class Lights {
        private boolean on;

        public void turnOn() {
            on = true;
            System.out.println("เปิดไฟหน้า");
        }

        public void turnOff() {
            on = false;
            System.out.println("ปิดไฟหน้า");
        }

        public boolean isOn() {
            return on;
        }
    }

    static class SteeringWheel {
        private String direction = "center";

        public void turnLeft() {
            direction = "left";
            System.out.println("เลี้ยวซ้าย");
        }

        public void turnRight() {
            direction = "right";
            System.out.println("เลี้ยวขวา");
        }

        public String getDirection() {
            return direction;
        }
    }

    static class Brakes {
        private boolean applied;

        public void apply() {
            applied = true;
            System.out.println("เบรก");
        }

        public void release() {
            applied = false;
            System.out.println("ปลดเบรก");
        }

        public boolean isApplied() {
            return applied;
        }
    }

    public static class CarFacade {
        private Engine engine = new Engine();
        private Lights lights = new Lights();
        private SteeringWheel steering = new SteeringWheel();
        private Brakes brakes = new Brakes();

        public void startCar() {
            System.out.println("Starting the car...");
            engine.start();
            lights.turnOn();
            System.out.println("Car is ready to go!");
        }

        public void stopCar() {
            System.out.println("Stopping the car...");
            engine.stop();
            lights.turnOff();
            System.out.println("Car has been stopped.");
        }

        public void turnLeft() {
            System.out.println("Executing left turn...");
            steering.turnLeft();
        }

        public void turnRight() {
            System.out.println("Executing right turn...");
            steering.turnRight();
        }

        public void applyBrakes() {
            System.out.println("Applying brakes...");
            brakes.apply();
        }

        public void releaseBrakes() {
            System.out.println("Releasing brakes...");
            brakes.release();
        }

        public Engine getEngine() {
            return engine;
        }

        public Lights getLights() {
            return lights;
        }

        public SteeringWheel getSteering() {
            return steering;
        }

        public Brakes getBrakes() {
            return brakes;
        }
    }

    public static void main(String[] args) {
        Car_code.CarFacade car = new Car_code.CarFacade();
        car.startCar();
        car.turnLeft();
        car.applyBrakes();
        car.releaseBrakes();
        car.turnRight();
        car.stopCar();
    }
}