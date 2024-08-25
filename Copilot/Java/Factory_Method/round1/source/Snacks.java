public class TunaSandwich implements MenuItem {
    @Override
    public void serve() {
        System.out.println("Serving Tuna Sandwich");
    }
}

public class Spaghetti implements MenuItem {
    @Override
    public void serve() {
        System.out.println("Serving Spaghetti");
    }
}

public class VegetableSalad implements MenuItem {
    @Override
    public void serve() {
        System.out.println("Serving Vegetable Salad");
    }
}