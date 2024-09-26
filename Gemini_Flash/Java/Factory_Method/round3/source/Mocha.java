package Gemini_Flash.Java.Factory_Method.round3.source;

class Mocha implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Mocha: Add hot water, milk, chocolate powder");
    }

    @Override
    public void serve() {
        System.out.println("Serving Mocha: Serve in a cup, add whipped cream");
    }
}
