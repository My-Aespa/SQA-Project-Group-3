package Gemini_Pro.Java.Factory_Method.round2.source;

// Mocha.java
public class Mocha implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Mocha: Adding espresso, chocolate syrup, steamed milk and whipped cream");
    }

    @Override
    public void serve() {
        System.out.println("Serving Mocha in a tall glass");
    }
}
