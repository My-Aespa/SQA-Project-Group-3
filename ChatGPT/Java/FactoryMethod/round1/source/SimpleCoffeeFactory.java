package ChatGPT.Java.FactoryMethod.round1.source;

public class SimpleCoffeeFactory extends CoffeeFactory {
    @Override
    protected Coffee createCoffee(String type) {
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
                throw new IllegalArgumentException("Unknown coffee type: " + type);
        }
    }
}

