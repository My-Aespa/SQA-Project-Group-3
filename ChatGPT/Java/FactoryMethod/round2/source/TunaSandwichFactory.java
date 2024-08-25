package ChatGPT.Java.FactoryMethod.round2.source;

// SnackFactory.java
public class TunaSandwichFactory implements ProductFactory {
     @Override
     public Product createProduct() {
         return new TunaSandwich();
     }
 }
 
 public class SpaghettiFactory implements ProductFactory {
     @Override
     public Product createProduct() {
         return new Spaghetti();
     }
 }
 
 public class VegetableSaladFactory implements ProductFactory {
     @Override
     public Product createProduct() {
         return new VegetableSalad();
     }
 }
