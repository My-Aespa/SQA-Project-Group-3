package ChatGPT.Java.FactoryMethod.round2.source;

public class Americano implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Americano.");
    }

    @Override
    public void serve() {
        System.out.println("Serving Americano.");
    }
}

