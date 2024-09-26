package Copilot.Java.Factory_Method.round1.source;

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
