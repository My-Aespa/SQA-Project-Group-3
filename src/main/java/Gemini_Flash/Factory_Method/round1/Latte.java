package Gemini_Flash.Factory_Method.round1;

class Latte implements Coffee {
    @Override
    public String prepare() {
        return "Adding steamed milk to espresso.";
    }

    @Override
    public String serve() {
        return "Serving Latte with latte art.";
    }
}
