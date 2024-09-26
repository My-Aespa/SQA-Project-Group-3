package Gemini_Flash.Java.Factory_Method.round3.source;

class Americano implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Americano: Add hot water");
    }

    @Override
    public void serve() {
        System.out.println("Serving Americano: Serve in a cup");
    }
}
