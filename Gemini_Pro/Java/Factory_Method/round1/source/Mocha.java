package Gemini_Pro.Java.Factory_Method.round1.source;

// Mocha.java (Concrete Product)
public class Mocha implements Coffee {
    @Override
    public String getDescription() {
        return "Mocha Coffee";
    }

    @Override
    public double getCost() {
        return 4.25;
    }
}
