package Gemini_Flash.Java.Factory_Method.round2.source;

class Cappuccino implements Coffee {
    @Override
    public String prepare() {
        return "Pour espresso, steamed milk, and foamed milk into a cup.";
    }

    @Override
    public String serve() {
        return "Serve with a sprinkle of cocoa powder.";
    }
}
