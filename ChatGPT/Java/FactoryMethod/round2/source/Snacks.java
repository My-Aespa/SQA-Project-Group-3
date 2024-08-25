package ChatGPT.Java.FactoryMethod.round2.source;

public class Snacks {
     public class ChickenSandwich implements Product {
          @Override
          public String getName() {
              return "Chicken Sandwich";
          }
      }
      
      public class TunaSandwich implements Product {
          @Override
          public String getName() {
              return "Tuna Sandwich";
          }
      }
      
      // เพิ่มประเภทแซนวิชอื่นๆ ตามที่กำหนด...
      
      // พาสต้า
      public class Spaghetti implements Product {
          @Override
          public String getName() {
              return "Spaghetti";
          }
      }
      
      public class Penne implements Product {
          @Override
          public String getName() {
              return "Penne";
          }
      }
      
      // เพิ่มประเภทพาสต้าอื่นๆ ตามที่กำหนด...
      
      // สลัด
      public class VegetableSalad implements Product {
          @Override
          public String getName() {
              return "Vegetable Salad";
          }
      }
      
      public class ChickenSalad implements Product {
          @Override
          public String getName() {
              return "Chicken Salad";
          }
      }
      
}
