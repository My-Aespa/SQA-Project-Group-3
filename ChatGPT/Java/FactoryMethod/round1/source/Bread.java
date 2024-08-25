package ChatGPT.Java.FactoryMethod.round1.source;

// Bread.java
public class Bread implements Product {
     private String type;
 
     public Bread(String type) {
         this.type = type;
     }
 
     @Override
     public String getName() {
         return "Bread: " + type;
     }
 }