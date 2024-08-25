package ChatGPT.Java.FactoryMethod.round2.source;

public class Beverages {
     // Beverages.java
     public class Espresso implements Product {
          @Override
          public String getName() {
               return "Espresso";
          }
     }

     public class Latte implements Product {
          @Override
          public String getName() {
               return "Latte";
          }
     }

     public class Milkshakes implements Product {
          @Override
          public String getName() {
               return "Milkshakes";
          }
     }

     public class FruitJuices implements Product {
          @Override
          public String getName() {
               return "Fruit Juices";
          }
     }

}
