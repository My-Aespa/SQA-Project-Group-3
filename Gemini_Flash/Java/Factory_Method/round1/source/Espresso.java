package Gemini_Flash.Java.Factory_Method.round1.source;

class Espresso implements Coffee {
    @Override
    public String prepare() {
        return "Brewing espresso.";
    }

    @Override
    public String serve() {
        return "Serving Espresso in a small cup.";
    }
}