package Gemini_Pro.Factory_Method.Round2;

// CoffeeFactory.java
public class CoffeeFactory {
    public static Coffee createCoffee(String type) {
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
