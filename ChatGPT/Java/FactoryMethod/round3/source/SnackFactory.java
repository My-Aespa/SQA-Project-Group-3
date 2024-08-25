package ChatGPT.Java.FactoryMethod.round3.source;

public class SnackFactory extends ProductFactory {
     @Override
     public Product createProduct(String type) {
         switch (type) {
             case "Chicken Sandwich":
                 return new ChickenSandwich();
             case "Tuna Sandwich":
                 return new TunaSandwich();
             case "Spaghetti":
                 return new Spaghetti();
             case "Penne":
                 return new Penne();
             case "Vegetable Salad":
                 return new VegetableSalad();
             case "Chicken Salad":
                 return new ChickenSalad();
             default:
                 throw new IllegalArgumentException("Unknown snack type");
         }
     }
 }
 
