package ChatGPT.Java.FactoryMethod.round2.source;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the coffee factory
        CoffeeFactory coffeeFactory = new SimpleCoffeeFactory();

        // Order a Latte
        Coffee coffee = coffeeFactory.orderCoffee("Latte");

        // Additional message to indicate the end of the order
        System.out.println("Coffee order completed: " + coffee.getClass().getSimpleName());
    }
}


