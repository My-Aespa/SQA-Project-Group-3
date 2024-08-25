package ChatGPT.Java.FactoryMethod.round1.source;

// ColdBeverage.java
public class ColdBeverage implements Product {
     private String type;
 
     public ColdBeverage(String type) {
         this.type = type;
     }
 
     @Override
     public String getName() {
         return "Cold Beverage: " + type;
     }
 }
