package Gemini_Flash.Java.Factory_Method.round2.source;

class Americano implements Coffee {
    @Override
    public String prepare() {
        return "Add hot water to espresso.";
    }

    @Override
    public String serve() {
        return "Serve in a tall glass with a splash of water.";
    }
}