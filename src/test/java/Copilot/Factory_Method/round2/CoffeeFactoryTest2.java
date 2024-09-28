package Copilot.Factory_Method.round2;
// package Copilot.Java.Factory_Method.round2.test;

// CoffeeFactoryTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CoffeeFactoryTest2 {

    @Test
    public void testAmericano() {
        Coffee coffee = CoffeeFactory.createCoffee("Americano");
        assertTrue(coffee instanceof Americano);
        assertEquals("Preparing Americano", coffee.prepare());
        assertEquals("Serving Americano", coffee.serve());
    }

    @Test
    public void testLatte() {
        Coffee coffee = CoffeeFactory.createCoffee("Latte");
        assertTrue(coffee instanceof Latte);
        assertEquals("Preparing Latte", coffee.prepare());
        assertEquals("Serving Latte", coffee.serve());
    }

    @Test
    public void testCappuccino() {
        Coffee coffee = CoffeeFactory.createCoffee("Cappuccino");
        assertTrue(coffee instanceof Cappuccino);
        assertEquals("Preparing Cappuccino", coffee.prepare());
        assertEquals("Serving Cappuccino", coffee.serve());
    }

    @Test
    public void testEspresso() {
        Coffee coffee = CoffeeFactory.createCoffee("Espresso");
        assertTrue(coffee instanceof Espresso);
        assertEquals("Preparing Espresso", coffee.prepare());
        assertEquals("Serving Espresso", coffee.serve());
    }

    @Test
    public void testMocha() {
        Coffee coffee = CoffeeFactory.createCoffee("Mocha");
        assertTrue(coffee instanceof Mocha);
        assertEquals("Preparing Mocha", coffee.prepare());
        assertEquals("Serving Mocha", coffee.serve());
    }

    @Test
    public void testUnknownCoffee() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            CoffeeFactory.createCoffee("Unknown");
        });
        assertEquals("Unknown coffee type: Unknown", exception.getMessage());
    }
}
