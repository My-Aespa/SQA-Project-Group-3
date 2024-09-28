package Gemini_Flash.Factory_Method.round1;

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
