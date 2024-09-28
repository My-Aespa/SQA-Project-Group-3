package Gemini_Flash.Factory_Method.round1;

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