package ChatGPT.Java.FactoryMethod.round1.source;

// Salad.java
public class Salad implements Product {
     private String type;
 
     public Salad(String type) {
         this.type = type;
     }
 
     @Override
     public String getName() {
         return "Salad: " + type;
     }
 }
