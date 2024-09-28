package Gemini_Flash.Factory_Method.round1;

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