package ChatGPT.Java.FactoryMethod.round1.source;

// Sandwich.java
public class Sandwich implements Product {
     private String type;
 
     public Sandwich(String type) {
         this.type = type;
     }
 
     @Override
     public String getName() {
         return "Sandwich: " + type;
     }
 }