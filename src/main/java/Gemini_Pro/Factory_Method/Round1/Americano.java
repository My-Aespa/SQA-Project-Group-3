package Gemini_Pro.Factory_Method.Round1;

// Americano.java (Concrete Product)
public class Americano implements Coffee {
    @Override
    public String getDescription() {
        return "Americano Coffee";
    }

    @Override
    public double getCost() {
        return 3.50;
    }
}
