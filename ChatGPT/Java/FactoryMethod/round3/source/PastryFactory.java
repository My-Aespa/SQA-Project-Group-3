package ChatGPT.Java.FactoryMethod.round3.source;

public class PastryFactory extends ProductFactory {
     @Override
     public Product createProduct(String type) {
         switch (type) {
             case "Croissant":
                 return new Croissant();
             case "Bun":
                 return new Bun();
             case "Custard Bread":
                 return new CustardBread();
             case "Chocolate Cake":
                 return new ChocolateCake();
             case "Strawberry Cake":
                 return new StrawberryCake();
             case "Coconut Cake":
                 return new CoconutCake();
             case "Chocolate Chip Cookies":
                 return new ChocolateChipCookies();
             case "Oat Cookies":
                 return new OatCookies();
             default:
                 throw new IllegalArgumentException("Unknown pastry type");
         }
     }
 }
 
