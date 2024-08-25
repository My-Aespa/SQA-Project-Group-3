package ChatGPT.Java.FactoryMethod.round3.source;

public class BeverageFactory extends ProductFactory {
     @Override
     public Product createProduct(String type) {
         switch (type) {
             case "Espresso":
                 return new Espresso();
             case "Cappuccino":
                 return new Cappuccino();
             case "Latte":
                 return new Latte();
             case "Mocha":
                 return new Mocha();
             case "Americano":
                 return new Americano();
             case "Black Tea":
                 return new BlackTea();
             case "Green Tea":
                 return new GreenTea();
             case "Oolong Tea":
                 return new OolongTea();
             case "Lemon Tea":
                 return new LemonTea();
             case "Fruit Smoothies":
                 return new FruitSmoothies();
             case "Milkshakes":
                 return new Milkshakes();
             case "Fruit Juices":
                 return new FruitJuices();
             default:
                 throw new IllegalArgumentException("Unknown beverage type");
         }
     }
 }
 
