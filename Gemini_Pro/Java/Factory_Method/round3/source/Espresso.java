package Gemini_Pro.Java.Factory_Method.round3.source;

public class Espresso implements Coffee {
    @Override
    public String prepare() {
        return "Brewing espresso...";
    }

    @Override
    public String serve() {
        return "Serving Espresso in a shot glass...";
    }
}
