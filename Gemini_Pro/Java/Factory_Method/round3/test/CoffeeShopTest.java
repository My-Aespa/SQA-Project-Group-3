package Gemini_Pro.Java.Factory_Method.round3.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CoffeeShopTest {

    @Test
    void testOrderAmericano() {
        CoffeeShop coffeeShop = new CoffeeShop(new ConcreteCoffeeFactory());
        Coffee coffee = coffeeShop.orderCoffee("Americano");
        assertEquals("Adding hot water to espresso...", coffee.prepare());
        assertEquals("Serving Americano in a cup...", coffee.serve());
    }

    @Test
    void testOrderLatte() {
        CoffeeShop coffeeShop = new CoffeeShop(new ConcreteCoffeeFactory());
        Coffee coffee = coffeeShop.orderCoffee("Latte");
        assertEquals("Adding steamed milk to espresso...", coffee.prepare());
        assertEquals("Serving Latte in a mug...", coffee.serve());
    }

    @Test
    void testOrderCappuccino() {
        CoffeeShop coffeeShop = new CoffeeShop(new ConcreteCoffeeFactory());
        Coffee coffee = coffeeShop.orderCoffee("Cappuccino");
        assertEquals("Adding steamed milk and foamed milk to espresso...", coffee.prepare());
        assertEquals("Serving Cappuccino in a cup...", coffee.serve());
    }

    @Test
    void testOrderEspresso() {
        CoffeeShop coffeeShop = new CoffeeShop(new ConcreteCoffeeFactory());
        Coffee coffee = coffeeShop.orderCoffee("Espresso");
        assertEquals("Brewing espresso...", coffee.prepare());
        assertEquals("Serving Espresso in a shot glass...", coffee.serve());
    }

    @Test
    void testOrderMocha() {
        CoffeeShop coffeeShop = new CoffeeShop(new ConcreteCoffeeFactory());
        Coffee coffee = coffeeShop.orderCoffee("Mocha");
        assertEquals("Adding chocolate syrup, steamed milk, and whipped cream to espresso...", coffee.prepare());
        assertEquals("Serving Mocha in a mug...", coffee.serve());
    }

    @Test
    void testInvalidCoffeeType() {
        CoffeeShop coffeeShop = new CoffeeShop(new ConcreteCoffeeFactory());
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            coffeeShop.orderCoffee("InvalidCoffee");
        });
        assertEquals("Invalid coffee type: invalidcoffee", exception.getMessage());
    }
}
