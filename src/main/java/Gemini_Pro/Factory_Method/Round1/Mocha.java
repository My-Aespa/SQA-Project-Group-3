package Gemini_Pro.Factory_Method.Round1;

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
