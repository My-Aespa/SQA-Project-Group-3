package ChatGPT.Java.FactoryMethod.round1.source;

// PastryFactory.java
public class PastryFactory implements ProductFactory {
     @Override
     public Product createProduct(String type) {
         if (type.equals("Croissant") || type.equals("Bun") || type.equals("Custard Bread")) {
             return new Bread(type);
         } else if (type.equals("Chocolate Cake") || type.equals("Strawberry Cake") || type.equals("Coconut Cake")) {
             return new Cake(type);
         } else if (type.equals("Chocolate Chip Cookies") || type.equals("Oat Cookies")) {
             return new Cookie(type);
         }
         return null;
     }
 }
