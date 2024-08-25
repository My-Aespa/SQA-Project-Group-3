package ChatGPT.Java.Facade.round3.source;

public class Car {
     private Engine engine;
     private Lights lights;
     private Steering steering;
     private Brakes brakes;
 
     public Car() {
         this.engine = new Engine();
         this.lights = new Lights();
         this.steering = new Steering();
         this.brakes = new Brakes();
     }
 
     public void startCar() {
         engine.start();
         lights.turnOn();
         System.out.println("Car started.");
     }
 
     public void stopCar() {
         lights.turnOff();
         engine.stop();
         System.out.println("Car stopped.");
     }
 
     public void turnLeft() {
         steering.turnLeft();
     }
 
     public void turnRight() {
         steering.turnRight();
     }
 
     public void applyBrakes() {
         brakes.apply();
     }
 
     public void releaseBrakes() {
         brakes.release();
     }
 }
 