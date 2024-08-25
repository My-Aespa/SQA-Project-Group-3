public class Cafe {
    private MenuFactory beverageFactory;
    private MenuFactory pastryFactory;
    private MenuFactory snackFactory;

    public Cafe() {
        this.beverageFactory = new BeverageFactory();
        this.pastryFactory = new PastryFactory();
        this.snackFactory = new SnackFactory();
    }

    public MenuItem orderItem(String category, String type) {
        switch (category) {
            case "Beverage":
                return beverageFactory.createMenuItem(type);
            case "Pastry":
                return pastryFactory.createMenuItem(type);
            case "Snack":
                return snackFactory.createMenuItem(type);
            default:
                throw new IllegalArgumentException("Unknown category");
        }
    }
}