package Gemini_Flash.Factory_Method.round3;

class Cappuccino implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Cappuccino: Add hot water, milk, foam");
    }

    @Override
    public void serve() {
        System.out.println("Serving Cappuccino: Serve in a cup, sprinkle chocolate powder");
    }
}
