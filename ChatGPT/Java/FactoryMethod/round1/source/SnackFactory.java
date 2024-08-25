// SnackFactory.java
public class SnackFactory extends ProductFactory {
     @Override
     public Product createProduct(String type) {
         switch (type) {
             case "Tuna Sandwich":
                 return new TunaSandwich();
             case "Spaghetti":
                 return new Spaghetti();
             case "Vegetable Salad":
                 return new VegetableSalad();
             default:
                 throw new IllegalArgumentException("Unknown snack type");
         }
     }
 }