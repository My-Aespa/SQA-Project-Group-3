package Gemini_Flash.Java.Factory_Method.round2.source;

class Espresso implements Coffee {
    @Override
    public String prepare() {
        return "Brew espresso shots.";
    }

    @Override
    public String serve() {
        return "Serve in a small cup.";
    }
}
