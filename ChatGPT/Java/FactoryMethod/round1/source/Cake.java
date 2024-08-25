package ChatGPT.Java.FactoryMethod.round1.source;

// Cake.java
public class Cake implements Product {
     private String type;
 
     public Cake(String type) {
         this.type = type;
     }
 
     @Override
     public String getName() {
         return "Cake: " + type;
     }
 }