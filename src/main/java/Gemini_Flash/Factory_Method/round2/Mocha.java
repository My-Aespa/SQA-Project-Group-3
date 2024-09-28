package Gemini_Flash.Factory_Method.round2;

class Mocha implements Coffee {
    @Override
    public String prepare() {
        return "Pour espresso, chocolate syrup, steamed milk, and whipped cream into a cup.";
    }

    @Override
    public String serve() {
        return "Serve with a chocolate drizzle.";
    }
}
