package Gemini_Pro.Java.Factory_Method.round1.source;

// Cappuccino.java (Concrete Product)
public class Cappuccino implements Coffee {
    @Override
    public String getDescription() {
        return "Cappuccino Coffee";
    }

    @Override
    public double getCost() {
        return 4.50;
    }
}
