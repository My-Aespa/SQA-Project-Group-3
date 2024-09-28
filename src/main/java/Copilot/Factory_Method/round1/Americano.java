package Copilot.Factory_Method.round1;

// Americano.java
public class Americano extends Coffee {
    @Override
    public String prepare() {
        return "Preparing Americano";
    }

    @Override
    public String serve() {
        return "Serving Americano";
    }
}
