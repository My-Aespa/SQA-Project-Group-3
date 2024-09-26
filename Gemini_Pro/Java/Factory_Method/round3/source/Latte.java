package Gemini_Pro.Java.Factory_Method.round3.source;

public class Latte implements Coffee {
    @Override
    public String prepare() {
        return "Adding steamed milk to espresso...";
    }

    @Override
    public String serve() {
        return "Serving Latte in a mug...";
    }
}
