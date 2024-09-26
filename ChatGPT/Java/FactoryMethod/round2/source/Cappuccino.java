package ChatGPT.Java.FactoryMethod.round2.source;

public class Cappuccino implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Cappuccino.");
    }

    @Override
    public void serve() {
        System.out.println("Serving Cappuccino.");
    }
}

