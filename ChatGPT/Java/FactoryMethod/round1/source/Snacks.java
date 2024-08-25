public class Snacks {
     public class TunaSandwich implements Product {
          @Override
          public String getName() {
              return "Tuna Sandwich";
          }
      }
      
      public class Spaghetti implements Product {
          @Override
          public String getName() {
              return "Spaghetti";
          }
      }
      
      public class VegetableSalad implements Product {
          @Override
          public String getName() {
              return "Vegetable Salad";
          }
      }
}
