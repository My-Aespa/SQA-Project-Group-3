package code;

public abstract class Beverage implements Item {
    @Override
    public abstract String getName();

    @Override
    public double getPrice() {
        return 3.50; // Default price for beverages
    }
}
