package ChatGPT.Java.Facade.round3.source;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startCar();
        myCar.turnLeft();
        myCar.applyBrakes();
        myCar.releaseBrakes();
        myCar.turnRight();
        myCar.stopCar();
    }
}
