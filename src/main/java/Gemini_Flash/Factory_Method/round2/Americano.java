package Gemini_Flash.Factory_Method.round2;

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