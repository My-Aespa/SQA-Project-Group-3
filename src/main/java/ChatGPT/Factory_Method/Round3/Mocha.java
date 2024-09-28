package ChatGPT.Factory_Method.Round3;

// Mocha.java
class Mocha extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Mocha.");
    }

    @Override
    public void serve() {
        System.out.println("Serving Mocha.");
    }
}
