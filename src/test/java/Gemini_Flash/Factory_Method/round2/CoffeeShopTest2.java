package Gemini_Flash.Factory_Method.round2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeShopTest2 {

    @Test
    void testCreateAmericano() {
        CoffeeShop coffeeShop = new CoffeeShop();
        Coffee coffee = coffeeShop.createCoffee("Americano");
        assertNotNull(coffee);
        assertEquals("Add hot water to espresso.", coffee.prepare());
        assertEquals("Serve in a tall glass with a splash of water.", coffee.serve());
    }

    @Test
    void testCreateLatte() {
        CoffeeShop coffeeShop = new CoffeeShop();
        Coffee coffee = coffeeShop.createCoffee("Latte");
        assertNotNull(coffee);
        assertEquals("Pour espresso and steamed milk into a cup.", coffee.prepare());
        assertEquals("Serve with latte art.", coffee.serve());
    }

    @Test
    void testCreateCappuccino() {
        CoffeeShop coffeeShop = new CoffeeShop();
        Coffee coffee = coffeeShop.createCoffee("Cappuccino");
        assertNotNull(coffee);
        assertEquals("Pour espresso, steamed milk, and foamed milk into a cup.", coffee.prepare());
        assertEquals("Serve with a sprinkle of cocoa powder.", coffee.serve());
    }

    @Test
    void testCreateEspresso() {
        CoffeeShop coffeeShop = new CoffeeShop();
        Coffee coffee = coffeeShop.createCoffee("Espresso");
        assertNotNull(coffee);
        assertEquals("Brew espresso shots.", coffee.prepare());
        assertEquals("Serve in a small cup.", coffee.serve());
    }

    @Test
    void testCreateMocha() {
        CoffeeShop coffeeShop = new CoffeeShop();
        Coffee coffee = coffeeShop.createCoffee("Mocha");
        assertNotNull(coffee);
        assertEquals("Pour espresso, chocolate syrup, steamed milk, and whipped cream into a cup.", coffee.prepare());
        assertEquals("Serve with a chocolate drizzle.", coffee.serve());
    }

    @Test
    void testCreateInvalidCoffeeType() {
        CoffeeShop coffeeShop = new CoffeeShop();
        Coffee coffee = coffeeShop.createCoffee("Invalid");
        assertNull(coffee);
    }
}
