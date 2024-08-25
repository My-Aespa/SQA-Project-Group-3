package ChatGPT.Java.Facade.round2.source;

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
         engine.startEngine();
         lights.turnOnHeadlights();
     }
 
     public void stopCar() {
         lights.turnOffHeadlights();
         engine.stopEngine();
     }
 
     public void turnLeft() {
         steering.turnLeft();
     }
 
     public void turnRight() {
         steering.turnRight();
     }
 
     public void applyBrakes() {
         brakes.applyBrakes();
     }
 
     public void releaseBrakes() {
         brakes.releaseBrakes();
     }
 }
 
