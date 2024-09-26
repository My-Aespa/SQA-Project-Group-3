package Gemini_Flash.Java.Factory_Method.round3.source;

public class CoffeeOrder {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        Coffee coffee = coffeeShop.createCoffee("Latte");

        if (coffee != null) {
            coffee.prepare();
            coffee.serve();
        }
    }
}
