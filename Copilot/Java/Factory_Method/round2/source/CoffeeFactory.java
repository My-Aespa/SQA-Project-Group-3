package Copilot.Java.Factory_Method.round2.source;

// CoffeeFactory.java
public class CoffeeFactory {
    public static Coffee createCoffee(String coffeeType) {
        switch (coffeeType) {
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
                throw new IllegalArgumentException("Unknown coffee type: " + coffeeType);
        }
    }
}
