package Gemini_Pro.Java.Factory_Method.round1.source;

// CoffeeShop.java (Client)
public class CoffeeShop {
    private CoffeeFactory coffeeFactory;

    public CoffeeShop(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(String type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
        System.out.println("Preparing " + coffee.getDescription() + "...");
        System.out.println(coffee.getDescription() + " is ready! Enjoy!");
        return coffee;
    }
}
