package ChatGPT.Factory_Method.Round2;

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
