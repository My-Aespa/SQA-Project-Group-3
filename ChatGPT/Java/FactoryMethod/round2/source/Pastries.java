package ChatGPT.Java.FactoryMethod.round2.source;

public class Pastries {
     public class Croissant implements Product {
          @Override
          public String getName() {
              return "Croissant";
          }
      }
      
      public class Bun implements Product {
          @Override
          public String getName() {
              return "Bun";
          }
      }
      
      // เพิ่มประเภทขนมปังอื่นๆ ตามที่กำหนด...
      
      // เค้ก
      public class ChocolateCake implements Product {
          @Override
          public String getName() {
              return "Chocolate Cake";
          }
      }
      
      public class StrawberryCake implements Product {
          @Override
          public String getName() {
              return "Strawberry Cake";
          }
      }
      
      // เพิ่มประเภทเค้กอื่นๆ ตามที่กำหนด...
      
      // คุกกี้
      public class ChocolateChipCookies implements Product {
          @Override
          public String getName() {
              return "Chocolate Chip Cookies";
          }
      }
      
      public class OatCookies implements Product {
          @Override
          public String getName() {
              return "Oat Cookies";
          }
      }
      
}
