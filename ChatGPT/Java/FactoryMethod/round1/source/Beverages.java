public class Beverages {
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
