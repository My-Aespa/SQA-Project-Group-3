package ChatGPT.Java.FactoryMethod.round3.source;

// ConcreteMenuFactory.java
public class ConcreteMenuFactory extends MenuFactory {

     @Override
     public Beverage createBeverage(String type) {
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
                 return null;
         }
     }
 
     @Override
     public Pastry createPastry(String type) {
         switch (type) {
             case "Croissant":
                 return new Croissant();
             case "Chocolate Cake":
                 return new ChocolateCake();
             case "Chocolate Chip Cookies":
                 return new ChocolateChipCookies();
             default:
                 return null;
         }
     }
 
     @Override
     public Snack createSnack(String type) {
         switch (type) {
             case "Tuna Sandwich":
                 return new TunaSandwich();
             case "Spaghetti":
                 return new Spaghetti();
             case "Vegetable Salad":
                 return new VegetableSalad();
             default:
                 return null;
         }
     }
 }
