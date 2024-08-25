package ChatGPT.Java.FactoryMethod.round2.source;

public class BeverageFactory extends ProductFactory {
     @Override
     public Product createProduct(String type) {
         switch (type) {
             case "Espresso": return new Espresso();
             case "Cappuccino": return new Cappuccino();
             // เพิ่มกรณีอื่นๆ สำหรับประเภทเครื่องดื่ม
             default: throw new IllegalArgumentException("Unknown beverage type");
         }
     }
 }
 
