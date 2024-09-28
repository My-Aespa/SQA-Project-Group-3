package Gemini_Flash.Factory_Method.round3;

public class Main {
    public static void main(String[] args) {
        // Instantiate CoffeeShop
        CoffeeFactory coffeeShop = new CoffeeShop();

        // Order different types of coffee
        String[] coffeeTypes = {"Americano", "Latte", "Cappuccino", "Espresso", "Mocha", "Unknown"};

        for (String type : coffeeTypes) {
            System.out.println("Ordering a " + type + ":");
            Coffee coffee = coffeeShop.createCoffee(type);

            if (coffee != null) {
                coffee.prepare();
                coffee.serve();
            } else {
                System.out.println("Invalid coffee type.");
            }
            System.out.println();
        }
    }
}