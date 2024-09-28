package Gemini_Flash.Factory_Method.round2;

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
