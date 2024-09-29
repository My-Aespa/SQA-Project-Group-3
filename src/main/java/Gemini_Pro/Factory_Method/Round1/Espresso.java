package Gemini_Pro.Factory_Method.Round1;

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
