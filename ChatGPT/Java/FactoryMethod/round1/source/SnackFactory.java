package ChatGPT.Java.FactoryMethod.round1.source;

// SnackFactory.java
public class SnackFactory implements ProductFactory {
     @Override
     public Product createProduct(String type) {
         if (type.equals("Chicken Sandwich") || type.equals("Tuna Sandwich")) {
             return new Sandwich(type);
         } else if (type.equals("Spaghetti") || type.equals("Penne")) {
             return new Pasta(type);
         } else if (type.equals("Vegetable Salad") || type.equals("Chicken Salad")) {
             return new Salad(type);
         }
         return null;
     }
 }
