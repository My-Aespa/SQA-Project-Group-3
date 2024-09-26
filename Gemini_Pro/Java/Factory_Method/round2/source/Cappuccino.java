package Gemini_Pro.Java.Factory_Method.round2.source;

// Cappuccino.java
public class Cappuccino implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Cappuccino: Adding espresso, steamed milk and thick milk foam");
    }

    @Override
    public void serve() {
        System.out.println("Serving Cappuccino in a cup");
    }
}
