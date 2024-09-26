package ChatGPT.Java.FactoryMethod.round3.source;

// Espresso.java
class Espresso extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Espresso.");
    }

    @Override
    public void serve() {
        System.out.println("Serving Espresso.");
    }
}