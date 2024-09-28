package ChatGPT.Factory_Method.Round2;

public class Cappuccino implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Cappuccino.");
    }

    @Override
    public void serve() {
        System.out.println("Serving Cappuccino.");
    }
}

