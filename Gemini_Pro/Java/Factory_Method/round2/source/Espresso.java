package Gemini_Pro.Java.Factory_Method.round2.source;

// Espresso.java
public class Espresso implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Espresso: Extracting concentrated coffee");
    }

    @Override
    public void serve() {
        System.out.println("Serving Espresso in a demitasse cup");
    }
}
