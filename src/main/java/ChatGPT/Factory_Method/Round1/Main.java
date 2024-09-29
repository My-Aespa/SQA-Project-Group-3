package ChatGPT.Factory_Method.Round1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an instance of SimpleCoffeeFactory
        CoffeeFactory coffeeFactory = new SimpleCoffeeFactory();
        CoffeeShop coffeeShop = new CoffeeShop(coffeeFactory);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("Please select a coffee type: Americano, Latte, Cappuccino, Espresso, Mocha");
        System.out.print("Your choice: ");
        // Read user input for coffee type
        String coffeeType = scanner.nextLine();
        
        try {
            // Order coffee based on user input
            Coffee coffee = coffeeShop.orderCoffee(coffeeType);
            System.out.println("You have ordered a " + coffeeType + ".");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}

