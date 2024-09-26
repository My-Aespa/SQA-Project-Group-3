package Gemini_Flash.Java.Factory_Method.round1.source;

class CoffeeOrder {
    private CoffeeFactory coffeeFactory;

    public CoffeeOrder(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(String type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
        if (coffee != null) {
            System.out.println("Preparing: " + coffee.prepare());
            System.out.println("Serving: " + coffee.serve());
        } else {
            System.out.println("Invalid coffee type.");
        }
        return coffee;
    }
}
