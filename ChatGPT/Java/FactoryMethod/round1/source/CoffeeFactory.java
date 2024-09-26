package ChatGPT.Java.FactoryMethod.round1.source;

public abstract class CoffeeFactory {
    public Coffee orderCoffee(String type) {
        Coffee coffee = createCoffee(type);
        coffee.prepare();
        coffee.serve();
        return coffee;
    }

    protected abstract Coffee createCoffee(String type);
}

