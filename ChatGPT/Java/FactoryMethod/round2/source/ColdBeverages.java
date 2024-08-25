package ChatGPT.Java.FactoryMethod.round2.source;

public class ColdBeverages {
     public class FruitSmoothies implements Product {
          @Override
          public String getName() {
              return "Fruit Smoothies";
          }
      }
      
      public class Milkshakes implements Product {
          @Override
          public String getName() {
              return "Milkshakes";
          }
      }
      
      // เพิ่มประเภทเครื่องดื่มเย็นอื่นๆ ตามที่กำหนด...
      
}
