package Gemini_Flash.Java.Factory_Method.round2.source;

class CoffeeShop extends CoffeeFactory {
    @Override
    Coffee createCoffee(String type) {
        switch (type) {
            case "Americano":
                return new Americano();
            case "Latte":
                return new Latte();
            case "Cappuccino":
                return new Cappuccino();
            case "Espresso":
                return new Espresso();
            case "Mocha":
                return new Mocha();
            default:
                return null;
        }
    }
}
