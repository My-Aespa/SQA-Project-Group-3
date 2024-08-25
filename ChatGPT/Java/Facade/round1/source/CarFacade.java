package ChatGPT.Java.Facade.round1.source;

// CarFacade.java
public class CarFacade {
     private Engine engine;
     private Lights lights;
     private Steering steering;
     private Brakes brakes;
 
     public CarFacade() {
         this.engine = new Engine();
         this.lights = new Lights();
         this.steering = new Steering();
         this.brakes = new Brakes();
     }
 
     public void startCar() {
         engine.start();
         lights.turnOn();
     }
 
     public void stopCar() {
         lights.turnOff();
         engine.stop();
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
 
