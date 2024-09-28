package Gemini_Flash.Factory_Method.round3;

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
