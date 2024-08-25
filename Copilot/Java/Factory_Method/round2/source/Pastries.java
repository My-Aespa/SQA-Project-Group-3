public class Croissant implements MenuItem {
    @Override
    public void serve() {
        System.out.println("Serving Croissant");
    }
}

public class ChocolateCake implements MenuItem {
    @Override
    public void serve() {
        System.out.println("Serving Chocolate Cake");
    }
}

public class ChocolateChipCookies implements MenuItem {
    @Override
    public void serve() {
        System.out.println("Serving Chocolate Chip Cookies");
    }
}
