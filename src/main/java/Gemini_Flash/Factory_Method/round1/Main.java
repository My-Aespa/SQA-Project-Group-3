package Gemini_Flash.Factory_Method.round1;

public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        CoffeeOrder order = new CoffeeOrder(coffeeShop);

        order.orderCoffee("Americano");
        order.orderCoffee("Latte");
        order.orderCoffee("Cappuccino");
        order.orderCoffee("Espresso");
        order.orderCoffee("Mocha");
        order.orderCoffee("Iced Latte"); // Invalid coffee type
    }
}