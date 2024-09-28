package Gemini_Flash.Factory_Method.round3;

class Espresso implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Espresso: Add strong coffee");
    }

    @Override
    public void serve() {
        System.out.println("Serving Espresso: Serve in a small cup");
    }
}