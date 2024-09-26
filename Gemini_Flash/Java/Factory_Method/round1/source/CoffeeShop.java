package Gemini_Flash.Java.Factory_Method.round1.source;

class CoffeeShop extends CoffeeFactory {
    @Override
    public Coffee createCoffee(String type) {
        switch (type.toLowerCase()) {
            case "americano":
                return new Americano();
            case "latte":
                return new Latte();
            case "cappuccino":
                return new Cappuccino();
            case "espresso":
                return new Espresso();
            case "mocha":
                return new Mocha();
            default:
                return null;
        }
    }
}