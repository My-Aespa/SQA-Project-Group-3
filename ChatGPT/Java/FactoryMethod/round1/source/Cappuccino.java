package ChatGPT.Java.FactoryMethod.round1.source;

public class Cappuccino extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Cappuccino.");
    }

    @Override
    public void serve() {
        System.out.println("Serving Cappuccino.");
    }
}

