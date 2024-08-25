package ChatGPT.Java.FactoryMethod.round2.source;

public class SnackFactory extends ProductFactory {
     @Override
     public Product createProduct(String type) {
         switch (type) {
             case "Chicken Sandwich": return new ChickenSandwich();
             case "Tuna Sandwich": return new TunaSandwich();
             // เพิ่มกรณีอื่นๆ สำหรับประเภทอาหารว่าง
             default: throw new IllegalArgumentException("Unknown snack type");
         }
     }
 }
 
