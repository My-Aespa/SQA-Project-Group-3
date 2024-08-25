public class Espresso implements MenuItem {
    @Override
    public void serve() {
        System.out.println("Serving Espresso");
    }
}

public class Latte implements MenuItem {
    @Override
    public void serve() {
        System.out.println("Serving Latte");
    }
}

public class Milkshakes implements MenuItem {
    @Override
    public void serve() {
        System.out.println("Serving Milkshakes");
    }
}

public class FruitJuices implements MenuItem {
    @Override
    public void serve() {
        System.out.println("Serving Fruit Juices");
    }
}
