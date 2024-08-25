public class PastryFactory extends ProductFactory {
     @Override
     public Product createProduct(String type) {
         switch (type) {
             case "Croissant":
                 return new Croissant();
             case "Chocolate Cake":
                 return new ChocolateCake();
             case "Chocolate Chip Cookies":
                 return new ChocolateChipCookies();
             default:
                 throw new IllegalArgumentException("Unknown pastry type");
         }
     }
 }