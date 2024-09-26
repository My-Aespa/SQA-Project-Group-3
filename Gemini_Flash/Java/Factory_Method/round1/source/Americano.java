package Gemini_Flash.Java.Factory_Method.round1.source;

class Americano implements Coffee {
    @Override
    public String prepare() {
        return "Adding hot water to espresso.";
    }

    @Override
    public String serve() {
        return "Serving Americano with a glass of water.";
    }
}
