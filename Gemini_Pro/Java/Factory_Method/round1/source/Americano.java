package Gemini_Pro.Java.Factory_Method.round1.source;

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
