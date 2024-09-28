package ChatGPT.Factory_Method.Round3;

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