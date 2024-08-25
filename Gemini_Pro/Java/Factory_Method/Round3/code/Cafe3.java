package code;

public class Cafe3 {
    private final MenuFactory menuFactory;

    public Cafe3(MenuFactory menuFactory) {
        this.menuFactory = menuFactory;
    }

    public void takeOrder(String itemType) {
        Item item = menuFactory.createMenuItem(itemType);
        System.out.println("Order received: " + item.getName());
    }

    public static void main(String[] args) {
        Cafe3 cafe = new Cafe3(new CafeMenuFactory());
        cafe.takeOrder("Espresso");
        cafe.takeOrder("Latte");
        cafe.takeOrder("Chocolate Cake");
        cafe.takeOrder("Spaghetti");
    }
}