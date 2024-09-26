package Gemini_Flash.Java.Factory_Method.round1.source;

class Cappuccino implements Coffee {
    @Override
    public String prepare() {
        return "Adding steamed milk and foamed milk to espresso.";
    }

    @Override
    public String serve() {
        return "Serving Cappuccino with latte art.";
    }
}