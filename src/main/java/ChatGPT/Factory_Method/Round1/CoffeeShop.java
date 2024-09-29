package ChatGPT.Factory_Method.Round1;

public class CoffeeShop {
    private CoffeeFactory coffeeFactory;

    public CoffeeShop(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(String type) {
        return coffeeFactory.orderCoffee(type);
    }
}

