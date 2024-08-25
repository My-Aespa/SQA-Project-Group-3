package ChatGPT.Java.FactoryMethod.round1.source;

// Pasta.java
public class Pasta implements Product {
     private String type;
 
     public Pasta(String type) {
         this.type = type;
     }
 
     @Override
     public String getName() {
         return "Pasta: " + type;
     }
 }