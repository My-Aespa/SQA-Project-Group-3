package ChatGPT.Java.FactoryMethod.round1.source;

public class Latte extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Latte.");
    }

    @Override
    public void serve() {
        System.out.println("Serving Latte.");
    }
}

