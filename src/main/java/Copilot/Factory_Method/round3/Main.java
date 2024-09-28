package Copilot.Factory_Method.round3;
// package Copilot.Java.Factory_Method.round3.source;

// Main.java
public class Main {
    public static void main(String[] args) {
        // สร้างอ็อบเจ็กต์ที่จำเป็นสำหรับ CarFacade
        Engine engine = new Engine();
        Lights lights = new Lights();
        SteeringWheel steeringWheel = new SteeringWheel();
        Brakes brakes = new Brakes();

        // สร้าง CarFacade ด้วยพารามิเตอร์ที่ถูกต้อง
        CarFacade carFacade = new CarFacade(engine, lights, steeringWheel, brakes);

        String[] coffeeTypes = {"Americano", "Latte", "Cappuccino", "Espresso", "Mocha"};
        for (String coffeeType : coffeeTypes) {
            Coffee coffee = CoffeeFactory.createCoffee(coffeeType);
            System.out.println(coffee.prepare());
            System.out.println(coffee.serve());
        }
    }
}