package Gemini_Pro.Java.Factory_Method.round3.source;

public class ConcreteCoffeeFactory implements CoffeeFactory {
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
                throw new IllegalArgumentException("Invalid coffee type: " + type);
        }
    }
}
