package Gemini_Pro.Factory_Method.Round3;

public class CoffeeShop {
   private CoffeeFactory coffeeFactory;

   public CoffeeShop(CoffeeFactory coffeeFactory) {
      this.coffeeFactory = coffeeFactory;
   }

   public Coffee orderCoffee(String type) {
      Coffee coffee = CoffeeFactory.createCoffee(type);
      System.out.println("Preparing " + coffee.getDescription() + "...");
      System.out.println(coffee.getDescription() + " is ready! Enjoy!");
      return coffee;
   }
}
