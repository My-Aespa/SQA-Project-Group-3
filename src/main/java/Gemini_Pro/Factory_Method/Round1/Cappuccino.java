package Gemini_Pro.Factory_Method.Round1;

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
