package ChatGPT.Facade.Round2;

public class Main {
    public static void main(String[] args) {
        CarFacade car = new CarFacade();
        car.startCar();
        car.turnLeft();
        car.applyBrakes();
        car.releaseBrakes();
        car.turnRight();
        car.stopCar();
    }
}

