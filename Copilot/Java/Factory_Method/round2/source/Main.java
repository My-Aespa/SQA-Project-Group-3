package Copilot.Java.Factory_Method.round2.source;

// Main.java
public class Main {
    public static void main(String[] args) {
        String[] coffeeTypes = {"Americano", "Latte", "Cappuccino", "Espresso", "Mocha"};
        for (String coffeeType : coffeeTypes) {
            Coffee coffee = CoffeeFactory.createCoffee(coffeeType);
            System.out.println(coffee.prepare());
            System.out.println(coffee.serve());
        }
    }
}