package ChatGPT.Java.FactoryMethod.round2.source;

public class Latte implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Latte.");
    }

    @Override
    public void serve() {
        System.out.println("Serving Latte.");
    }
}

