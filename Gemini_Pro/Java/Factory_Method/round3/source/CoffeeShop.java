package Gemini_Pro.Java.Factory_Method.round3.source;

public class CoffeeShop {
    private final CoffeeFactory coffeeFactory;

    public CoffeeShop(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(String type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
        System.out.println(coffee.prepare());
        System.out.println(coffee.serve());
        return coffee;
    }

    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop(new ConcreteCoffeeFactory());
        coffeeShop.orderCoffee("Latte");
    }
}
