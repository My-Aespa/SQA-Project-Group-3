package ChatGPT.Java.FactoryMethod.round1.source;
// Tea.java
public class Tea implements Product {
     private String type;
 
     public Tea(String type) {
         this.type = type;
     }
 
     @Override
     public String getName() {
         return "Tea: " + type;
     }
 }
