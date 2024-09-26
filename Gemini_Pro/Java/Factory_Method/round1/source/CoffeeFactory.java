package Gemini_Pro.Java.Factory_Method.round1.source;

// CoffeeFactory.java (Creator)
public class CoffeeFactory {
    public Coffee createCoffee(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        if (type.equalsIgnoreCase("Americano")) {
            return new Americano();
        } else if (type.equalsIgnoreCase("Latte")) {
            return new Latte();
        } else if (type.equalsIgnoreCase("Cappuccino")) {
            return new Cappuccino();
        } else if (type.equalsIgnoreCase("Espresso")) {
            return new Espresso();
        } else if (type.equalsIgnoreCase("Mocha")) {
            return new Mocha();
        } else {
            return null;
        }
    }
}
