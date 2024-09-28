package Gemini_Flash.Factory_Method.round3;

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
