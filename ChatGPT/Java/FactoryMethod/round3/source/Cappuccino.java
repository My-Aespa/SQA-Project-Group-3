package ChatGPT.Java.FactoryMethod.round3.source;

// Cappuccino.java
class Cappuccino extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Cappuccino.");
    }

    @Override
    public void serve() {
        System.out.println("Serving Cappuccino.");
    }
}
