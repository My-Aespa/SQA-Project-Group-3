package ChatGPT.Java.FactoryMethod.round1.source;

public class Mocha extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Mocha.");
    }

    @Override
    public void serve() {
        System.out.println("Serving Mocha.");
    }
}

