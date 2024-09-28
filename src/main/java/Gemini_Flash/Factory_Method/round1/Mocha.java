package Gemini_Flash.Factory_Method.round1;

class Mocha implements Coffee {
    @Override
    public String prepare() {
        return "Adding chocolate syrup, steamed milk and whipped cream to espresso.";
    }

    @Override
    public String serve() {
        return "Serving Mocha with whipped cream and chocolate sprinkles.";
    }
}
