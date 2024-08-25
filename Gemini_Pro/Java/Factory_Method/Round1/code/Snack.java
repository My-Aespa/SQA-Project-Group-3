package code;

public abstract class Snack implements Item {
    @Override
    public abstract String getName();

    @Override
    public double getPrice() {
        return 4.00; // Default price for snacks
    }
}
