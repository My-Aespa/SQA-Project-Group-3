package ChatGPT.Java.FactoryMethod.round3.source;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Create a coffee factory
        CoffeeFactory coffeeFactory = new CoffeeFactory();

        // Create a coffee shop with the coffee factory
        CoffeeShop coffeeShop = new CoffeeShop(coffeeFactory);

        // Example orders
        coffeeShop.orderCoffee("Americano");
        coffeeShop.orderCoffee("Latte");
        coffeeShop.orderCoffee("Cappuccino");
        coffeeShop.orderCoffee("Espresso");
        coffeeShop.orderCoffee("Mocha");

        // Try ordering an unknown type to demonstrate exception handling
        try {
            coffeeShop.orderCoffee("Unknown");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

