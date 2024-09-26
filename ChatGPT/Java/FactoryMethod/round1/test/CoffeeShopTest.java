package ChatGPT.Java.FactoryMethod.round1.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoffeeShopTest {

    @Test
    public void testOrderAmericano() {
        CoffeeFactory factory = new SimpleCoffeeFactory();
        CoffeeShop shop = new CoffeeShop(factory);
        
        Coffee coffee = shop.orderCoffee("Americano");
        assertTrue(coffee instanceof Americano);
    }

    @Test
    public void testOrderLatte() {
        CoffeeFactory factory = new SimpleCoffeeFactory();
        CoffeeShop shop = new CoffeeShop(factory);
        
        Coffee coffee = shop.orderCoffee("Latte");
        assertTrue(coffee instanceof Latte);
    }

    @Test
    public void testOrderCappuccino() {
        CoffeeFactory factory = new SimpleCoffeeFactory();
        CoffeeShop shop = new CoffeeShop(factory);
        
        Coffee coffee = shop.orderCoffee("Cappuccino");
        assertTrue(coffee instanceof Cappuccino);
    }

    @Test
    public void testOrderEspresso() {
        CoffeeFactory factory = new SimpleCoffeeFactory();
        CoffeeShop shop = new CoffeeShop(factory);
        
        Coffee coffee = shop.orderCoffee("Espresso");
        assertTrue(coffee instanceof Espresso);
    }

    @Test
    public void testOrderMocha() {
        CoffeeFactory factory = new SimpleCoffeeFactory();
        CoffeeShop shop = new CoffeeShop(factory);
        
        Coffee coffee = shop.orderCoffee("Mocha");
        assertTrue(coffee instanceof Mocha);
    }

    @Test
    public void testOrderUnknownCoffee() {
        CoffeeFactory factory = new SimpleCoffeeFactory();
        CoffeeShop shop = new CoffeeShop(factory);
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            shop.orderCoffee("Unknown");
        });
        assertEquals("Unknown coffee type: Unknown", exception.getMessage());
    }
}

