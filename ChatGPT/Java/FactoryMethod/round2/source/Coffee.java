package ChatGPT.Java.FactoryMethod.round2.source;

public class Coffee {
     public class Espresso implements Product {
          @Override
          public String getName() {
              return "Espresso";
          }
      }
      
      public class Cappuccino implements Product {
          @Override
          public String getName() {
              return "Cappuccino";
          }
      }
      
      // เพิ่มประเภทกาแฟอื่นๆ ตามที่กำหนด...
      
}
