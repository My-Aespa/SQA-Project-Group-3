package ChatGPT.Factory_Method.Round3;

// Latte.java
class Latte extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Latte.");
    }

    @Override
    public void serve() {
        System.out.println("Serving Latte.");
    }
}
