package ChatGPT.Java.FactoryMethod.round1.source;

// Cookie.java
public class Cookie implements Product {
     private String type;
 
     public Cookie(String type) {
         this.type = type;
     }
 
     @Override
     public String getName() {
         return "Cookie: " + type;
     }
 }
