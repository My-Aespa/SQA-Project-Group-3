package ChatGPT.Factory_Method.Round3;

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
