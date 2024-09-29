package Gemini_Pro.Factory_Method.Round3;

public class CoffeeShop {
   private CoffeeFactory coffeeFactory;

   public CoffeeShop(CoffeeFactory coffeeFactory) {
      this.coffeeFactory = coffeeFactory;
   }

   public Coffee orderCoffee(String type) {
      try {
          Coffee coffee = CoffeeFactory.createCoffee(type);
          System.out.println("Preparing " + coffee.getDescription() + "...");
          System.out.println(coffee.getDescription() + " is ready! Enjoy!");
          return coffee;
      } catch (IllegalArgumentException e) {
          System.out.println(e.getMessage()); // แสดงข้อความข้อผิดพลาด
          throw e; // โยนข้อผิดพลาดต่อไปเพื่อให้สามารถจัดการได้ในระดับที่สูงขึ้น
      }
   }
}
