package Gemini_Flash.Java.Factory_Method.round3.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeOrderTest {

    @Test
    void testCreateCoffee_Americano() {
        CoffeeShop coffeeShop = new CoffeeShop();
        Coffee coffee = coffeeShop.createCoffee("Americano");
        assertNotNull(coffee);
        assertEquals(coffee.getClass(), Americano.class);
    }

    @Test
    void testCreateCoffee_Latte() {
        CoffeeShop coffeeShop = new CoffeeShop();
        Coffee coffee = coffeeShop.createCoffee("Latte");
        assertNotNull(coffee);
        assertEquals(coffee.getClass(), Latte.class);
    }

    @Test
    void testCreateCoffee_Cappuccino() {
        CoffeeShop coffeeShop = new CoffeeShop();
        Coffee coffee = coffeeShop.createCoffee("Cappuccino");
        assertNotNull(coffee);
        assertEquals(coffee.getClass(), Cappuccino.class);
    }

    @Test
    void testCreateCoffee_Espresso() {
        CoffeeShop coffeeShop = new CoffeeShop();
        Coffee coffee = coffeeShop.createCoffee("Espresso");
        assertNotNull(coffee);
        assertEquals(coffee.getClass(), Espresso.class);
    }

    @Test
    void testCreateCoffee_Mocha() {
        CoffeeShop coffeeShop = new CoffeeShop();
        Coffee coffee = coffeeShop.createCoffee("Mocha");
        assertNotNull(coffee);
        assertEquals(coffee.getClass(), Mocha.class);
    }

    @Test
    void testCreateCoffee_InvalidType() {
        CoffeeShop coffeeShop = new CoffeeShop();
        Coffee coffee = coffeeShop.createCoffee("Black Coffee");
        assertNull(coffee);
    }
}
