package ChatGPT.Facade.Round1;

public class Main {
    public static void main(String[] args) {
        CarFacade car = new CarFacade();
        
        car.startCar();  // เริ่มต้นรถ
        car.turnLeft();  // เลี้ยวซ้าย
        car.applyBrakes(); // เบรก
        car.releaseBrakes(); // ปลดเบรก
        car.turnRight(); // เลี้ยวขวา
        car.stopCar(); // หยุดรถ
    }
}

