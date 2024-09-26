package ChatGPT.Java.FactoryMethod.round2.source;

public class Mocha implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Mocha.");
    }

    @Override
    public void serve() {
        System.out.println("Serving Mocha.");
    }
}
