package Gemini_Flash.Factory_Method.round2;

public class CoffeeOrder {
    public static void main(String[] args) {
        CoffeeFactory coffeeShop = new CoffeeShop();
        Coffee coffee = coffeeShop.createCoffee("Latte");

        if (coffee != null) {
            System.out.println("Preparing " + coffee.prepare());
            System.out.println("Serving " + coffee.serve());
        } else {
            System.out.println("Invalid coffee type.");
        }
    }
}