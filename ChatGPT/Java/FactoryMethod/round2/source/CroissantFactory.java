package ChatGPT.Java.FactoryMethod.round2.source;

// PastryFactory.java
public class CroissantFactory implements ProductFactory {
     @Override
     public Product createProduct() {
         return new Croissant();
     }
 }
 
 public class ChocolateCakeFactory implements ProductFactory {
     @Override
     public Product createProduct() {
         return new ChocolateCake();
     }
 }
 
 public class ChocolateChipCookiesFactory implements ProductFactory {
     @Override
     public Product createProduct() {
         return new ChocolateChipCookies();
     }
 }
 