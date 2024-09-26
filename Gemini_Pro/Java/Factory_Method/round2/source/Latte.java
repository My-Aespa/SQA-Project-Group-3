package Gemini_Pro.Java.Factory_Method.round2.source;

// Latte.java
public class Latte implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Latte: Adding espresso, steamed milk and milk foam");
    }

    @Override
    public void serve() {
        System.out.println("Serving Latte in a mug");
    }
}
