package Gemini_Pro.Java.Factory_Method.round3.source;

public class Mocha implements Coffee {
    @Override
    public String prepare() {
        return "Adding chocolate syrup, steamed milk, and whipped cream to espresso...";
    }

    @Override
    public String serve() {
        return "Serving Mocha in a mug...";
    }
}
