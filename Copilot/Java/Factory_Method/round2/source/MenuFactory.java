public abstract class MenuFactory {
    public abstract MenuItem createMenuItem(String type);
}

public class BeverageFactory extends MenuFactory {
    @Override
    public MenuItem createMenuItem(String type) {
        switch (type) {
            case "Espresso":
                return new Espresso();
            case "Latte":
                return new Latte();
            case "Milkshakes":
                return new Milkshakes();
            case "Fruit Juices":
                return new FruitJuices();
            default:
                throw new IllegalArgumentException("Unknown beverage type");
        }
    }
}

public class PastryFactory extends MenuFactory {
    @Override
    public MenuItem createMenuItem(String type) {
        switch (type) {
            case "Croissant":
                return new Croissant();
            case "Chocolate Cake":
                return new ChocolateCake();
            case "Chocolate Chip Cookies":
                return new ChocolateChipCookies();
            default:
                throw new IllegalArgumentException("Unknown pastry type");
        }
    }
}

public class SnackFactory extends MenuFactory {
    @Override
    public MenuItem createMenuItem(String type) {
        switch (type) {
            case "Tuna Sandwich":
                return new TunaSandwich();
            case "Spaghetti":
                return new Spaghetti();
            case "Vegetable Salad":
                return new VegetableSalad();
            default:
                throw new IllegalArgumentException("Unknown snack type");
        }
    }
}