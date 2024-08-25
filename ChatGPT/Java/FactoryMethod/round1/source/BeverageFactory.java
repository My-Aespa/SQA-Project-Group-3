// BeverageFactory.java
public class BeverageFactory extends ProductFactory {
     @Override
     public Product createProduct(String type) {
         switch (type) {
             case "Espresso":
                 return new Espresso();
             case "Latte":
                 return new Latte();
             case "Milkshakes":
                 return new Milkshakes();
             case "Fruit Juices":
                 return new FruitJuices();
             default:
                 throw new IllegalArgumentException("Unknown beverage type");
         }
     }
 }