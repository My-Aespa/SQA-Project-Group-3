package Gemini_Pro.Java.Factory_Method.round3.source;

public class Cappuccino implements Coffee {
    @Override
    public String prepare() {
        return "Adding steamed milk and foamed milk to espresso...";
    }

    @Override
    public String serve() {
        return "Serving Cappuccino in a cup...";
    }
}
