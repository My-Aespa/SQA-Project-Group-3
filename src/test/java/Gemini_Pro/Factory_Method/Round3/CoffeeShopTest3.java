package Gemini_Pro.Factory_Method.Round3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CoffeeShopTest3 {

    @Test
    void testOrderAmericano() {
        CoffeeShop coffeeShop = new CoffeeShop(new CoffeeFactory());
        Coffee coffee = coffeeShop.orderCoffee("Americano");
        assertEquals("Americano Coffee", coffee.getDescription());
        assertEquals(3.5, coffee.getCost());
    }

    @Test
    void testOrderLatte() {
        CoffeeShop coffeeShop = new CoffeeShop(new CoffeeFactory());
        Coffee coffee = coffeeShop.orderCoffee("Latte");
        assertEquals("Latte Coffee", coffee.getDescription());
        assertEquals(4.0, coffee.getCost());
    }

    @Test
    void testOrderCappuccino() {
        CoffeeShop coffeeShop = new CoffeeShop(new CoffeeFactory());
        Coffee coffee = coffeeShop.orderCoffee("Cappuccino");
        assertEquals("Cappuccino Coffee", coffee.getDescription());
        assertEquals(4.5, coffee.getCost());
    }

    @Test
    void testOrderEspresso() {
        CoffeeShop coffeeShop = new CoffeeShop(new CoffeeFactory());
        Coffee coffee = coffeeShop.orderCoffee("Espresso");
        assertEquals("Espresso Coffee", coffee.getDescription());
        assertEquals(3.0, coffee.getCost());
    }

    @Test
    void testOrderMocha() {
        CoffeeShop coffeeShop = new CoffeeShop(new CoffeeFactory());
        Coffee coffee = coffeeShop.orderCoffee("Mocha");
        assertEquals("Mocha Coffee", coffee.getDescription());
        assertEquals(4.25, coffee.getCost());
    }

    @Test
    void testInvalidCoffeeType() {
        CoffeeShop coffeeShop = new CoffeeShop(new CoffeeFactory());
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            coffeeShop.orderCoffee("InvalidCoffee");
        });
        assertEquals("Invalid coffee type: invalidcoffee", exception.getMessage());
    }
}
