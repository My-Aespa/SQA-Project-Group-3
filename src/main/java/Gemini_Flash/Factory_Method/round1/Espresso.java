package Gemini_Flash.Factory_Method.round1;

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