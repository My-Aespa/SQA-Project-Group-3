package code;

class CafeMenuFactory extends MenuFactory {
    @Override
    public Item createMenuItem(String itemType) {
        switch (itemType.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "latte":
                return new Latte();
            case "milkshake":
                return new Milkshakes();
            case "fruit juice":
                return new FruitJuices();
            case "croissant":
                return new Croissant();
            case "chocolate cake":
                return new ChocolateCake();
            case "chocolate chip cookies":
                return new ChocolateChipCookies();
            case "tuna sandwich":
                return new TunaSandwich();
            case "spaghetti":
                return new Spaghetti();
            case "vegetable salad":
                return new VegetableSalad();
            default:
                throw new IllegalArgumentException("Unknown item type");
        }
    }
}
