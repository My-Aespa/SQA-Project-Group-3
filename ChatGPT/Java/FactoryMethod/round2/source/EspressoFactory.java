package ChatGPT.Java.FactoryMethod.round2.source;

// BeverageFactory.java
public class EspressoFactory implements ProductFactory {
     @Override
     public Product createProduct() {
         return new Espresso();
     }
 }
 
 public class LatteFactory implements ProductFactory {
     @Override
     public Product createProduct() {
         return new Latte();
     }
 }
 
 public class MilkshakesFactory implements ProductFactory {
     @Override
     public Product createProduct() {
         return new Milkshakes();
     }
 }
 
 public class FruitJuicesFactory implements ProductFactory {
     @Override
     public Product createProduct() {
         return new FruitJuices();
     }
 }
