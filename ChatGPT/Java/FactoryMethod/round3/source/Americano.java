package ChatGPT.Java.FactoryMethod.round3.source;

// Americano.java
class Americano extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Americano.");
    }

    @Override
    public void serve() {
        System.out.println("Serving Americano.");
    }
}
