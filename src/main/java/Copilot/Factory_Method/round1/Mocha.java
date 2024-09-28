package Copilot.Factory_Method.round1;

// Mocha.java
public class Mocha extends Coffee {
    @Override
    public String prepare() {
        return "Preparing Mocha";
    }

    @Override
    public String serve() {
        return "Serving Mocha";
    }
}
