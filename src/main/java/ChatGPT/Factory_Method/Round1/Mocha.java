package ChatGPT.Factory_Method.Round1;

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

