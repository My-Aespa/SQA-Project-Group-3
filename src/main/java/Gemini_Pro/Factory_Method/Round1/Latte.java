package Gemini_Pro.Factory_Method.Round1;
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
