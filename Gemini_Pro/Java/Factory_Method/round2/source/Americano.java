package Gemini_Pro.Java.Factory_Method.round2.source;

// Americano.java
public class Americano implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Americano: Adding espresso and hot water");
    }

    @Override
    public void serve() {
        System.out.println("Serving Americano in a cup");
    }
}