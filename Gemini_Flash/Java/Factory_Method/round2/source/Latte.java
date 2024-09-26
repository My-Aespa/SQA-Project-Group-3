package Gemini_Flash.Java.Factory_Method.round2.source;

class Latte implements Coffee {
    @Override
    public String prepare() {
        return "Pour espresso and steamed milk into a cup.";
    }

    @Override
    public String serve() {
        return "Serve with latte art.";
    }
}