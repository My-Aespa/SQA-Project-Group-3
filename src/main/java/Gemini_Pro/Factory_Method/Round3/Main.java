package Gemini_Pro.Factory_Method.Round3;

public class Main {
    public static void main(String[] args) {
        CoffeeFactory factory = new CoffeeFactory();
        CoffeeShop shop = new CoffeeShop(factory);

        // ทดสอบการสั่งกาแฟแต่ละประเภท
        shop.orderCoffee("Americano");
        shop.orderCoffee("Latte");
        shop.orderCoffee("Cappuccino");
        shop.orderCoffee("Espresso");
        shop.orderCoffee("Mocha");
    }
}
