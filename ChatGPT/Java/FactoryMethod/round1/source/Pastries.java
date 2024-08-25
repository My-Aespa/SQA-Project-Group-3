public class Pastries {
     public class Croissant implements Product {
          @Override
          public String getName() {
              return "Croissant";
          }
      }
      
      public class ChocolateCake implements Product {
          @Override
          public String getName() {
              return "Chocolate Cake";
          }
      }
      
      public class ChocolateChipCookies implements Product {
          @Override
          public String getName() {
              return "Chocolate Chip Cookies";
          }
      }
}
