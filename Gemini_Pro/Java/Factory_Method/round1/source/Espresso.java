package Gemini_Pro.Java.Factory_Method.round1.source;

// Espresso.java (Concrete Product)
public class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "Espresso Coffee";
    }

    @Override
    public double getCost() {
        return 3.00;
    }
}
