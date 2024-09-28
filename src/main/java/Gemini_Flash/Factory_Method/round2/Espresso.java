package Gemini_Flash.Factory_Method.round2;

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
