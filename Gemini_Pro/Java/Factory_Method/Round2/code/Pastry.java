package code;

public abstract class Pastry implements Item {
    @Override
    public abstract String getName();

    @Override
    public double getPrice() {
        return 2.00; // Default price for pastries
    }
}