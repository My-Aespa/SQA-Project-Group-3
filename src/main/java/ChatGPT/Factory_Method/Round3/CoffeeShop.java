package ChatGPT.Factory_Method.Round3;

// CoffeeShop.java
class CoffeeShop {
    private final CoffeeFactory coffeeFactory;

    public CoffeeShop(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public void orderCoffee(String type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.prepare();
        coffee.serve();
    }
}

