package ChatGPT.Java.FactoryMethod.round3.source;

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

