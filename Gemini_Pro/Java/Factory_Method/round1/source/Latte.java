package Gemini_Pro.Java.Factory_Method.round1.source;

// Latte.java (Concrete Product)
public class Latte implements Coffee {
    @Override
    public String getDescription() {
        return "Latte Coffee";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
