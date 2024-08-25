package code;

public class Cafe1 {
    public static Item getItem(String type, String name) {
        if (type.equalsIgnoreCase("Beverage")) {
            if (name.equalsIgnoreCase("Espresso")) {
                return new Espresso();
            } else if (name.equalsIgnoreCase("Latte")) {
                return new Latte();
            } else if (name.equalsIgnoreCase("Milkshakes")) {
                return new Milkshakes();
            } else if (name.equalsIgnoreCase("Fruit Juices")) {
                return new FruitJuices();
            }
        } else if (type.equalsIgnoreCase("Pastry")) {
            if (name.equalsIgnoreCase("Croissant")) {
                return new Croissant();
            } else if (name.equalsIgnoreCase("Chocolate Cake")) {
                return new ChocolateCake();
            } else if (name.equalsIgnoreCase("Chocolate Chip Cookies")) {
                return new ChocolateChipCookies();
            }
        } else if (type.equalsIgnoreCase("Snack")) {
            if (name.equalsIgnoreCase("Tuna Sandwich")) {
                return new TunaSandwich();
            } else if (name.equalsIgnoreCase("Spaghetti")) {
                return new Spaghetti();
            } else if (name.equalsIgnoreCase("Vegetable Salad")) {
                return new VegetableSalad();
            }
        }
        return null;
    }
}
