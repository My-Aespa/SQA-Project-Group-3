package Gemini_Pro.Java.Factory_Method.round3.source;

public class Americano implements Coffee {
    @Override
    public String prepare() {
        return "Adding hot water to espresso...";
    }

    @Override
    public String serve() {
        return "Serving Americano in a cup...";
    }
}
