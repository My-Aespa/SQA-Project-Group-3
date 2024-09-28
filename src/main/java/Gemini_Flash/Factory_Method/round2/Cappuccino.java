package Gemini_Flash.Factory_Method.round2;

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
