package Copilot.Factory_Method.round1;

// Latte.java
public class Latte extends Coffee {
    @Override
    public String prepare() {
        return "Preparing Latte";
    }

    @Override
    public String serve() {
        return "Serving Latte";
    }
}
