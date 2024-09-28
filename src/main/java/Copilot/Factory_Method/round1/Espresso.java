package Copilot.Factory_Method.round1;

// Espresso.java
public class Espresso extends Coffee {
    @Override
    public String prepare() {
        return "Preparing Espresso";
    }

    @Override
    public String serve() {
        return "Serving Espresso";
    }
}
