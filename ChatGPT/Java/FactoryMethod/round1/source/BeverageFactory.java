package ChatGPT.Java.FactoryMethod.round1.source;

// BeverageFactory.java
public class BeverageFactory implements ProductFactory {
     @Override
     public Product createProduct(String type) {
         if (type.equals("Espresso") || type.equals("Cappuccino") || type.equals("Latte") ||
             type.equals("Mocha") || type.equals("Americano")) {
             return new Coffee(type);
         } else if (type.equals("Black Tea") || type.equals("Green Tea") || type.equals("Oolong Tea") ||
                    type.equals("Lemon Tea")) {
             return new Tea(type);
         } else if (type.equals("Fruit Smoothies") || type.equals("Milkshakes") || type.equals("Fruit Juices")) {
             return new ColdBeverage(type);
         }
         return null;
     }
 }