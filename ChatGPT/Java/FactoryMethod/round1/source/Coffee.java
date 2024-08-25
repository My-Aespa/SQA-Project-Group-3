package ChatGPT.Java.FactoryMethod.round1.source;
// Coffee.java
public class Coffee implements Product {
     private String type;
 
     public Coffee(String type) {
         this.type = type;
     }
 
     @Override
     public String getName() {
         return "Coffee: " + type;
     }
 }
