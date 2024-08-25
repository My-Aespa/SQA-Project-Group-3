package ChatGPT.Java.FactoryMethod.round2.source;

public class PastryFactory extends ProductFactory {
     @Override
     public Product createProduct(String type) {
         switch (type) {
             case "Croissant": return new Croissant();
             case "Bun": return new Bun();
             // เพิ่มกรณีอื่นๆ สำหรับประเภทขนม
             default: throw new IllegalArgumentException("Unknown pastry type");
         }
     }
 }
 
