package ChatGPT.Java.FactoryMethod.round2.source;

public class Espresso implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Espresso.");
    }

    @Override
    public void serve() {
        System.out.println("Serving Espresso.");
    }
}

