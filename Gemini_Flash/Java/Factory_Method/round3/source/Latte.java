package Gemini_Flash.Java.Factory_Method.round3.source;

class Latte implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Latte: Add hot water, milk");
    }

    @Override
    public void serve() {
        System.out.println("Serving Latte: Serve in a cup, sprinkle chocolate powder");
    }
}