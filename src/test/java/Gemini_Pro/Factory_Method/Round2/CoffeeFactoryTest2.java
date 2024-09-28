package Gemini_Pro.Factory_Method.Round2;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CoffeeFactoryTest2 {

    @Test
    void testCreateAmericano() {
        Coffee coffee = CoffeeFactory.createCoffee("Americano");
        assertTrue(coffee instanceof Americano);
    }

    @Test
    void testCreateLatte() {
        Coffee coffee = CoffeeFactory.createCoffee("Latte");
        assertTrue(coffee instanceof Latte);
    }

    @Test
    void testCreateCappuccino() {
        Coffee coffee = CoffeeFactory.createCoffee("Cappuccino");
        assertTrue(coffee instanceof Cappuccino);
    }

    @Test
    void testCreateEspresso() {
        Coffee coffee = CoffeeFactory.createCoffee("Espresso");
        assertTrue(coffee instanceof Espresso);
    }

    @Test
    void testCreateMocha() {
        Coffee coffee = CoffeeFactory.createCoffee("Mocha");
        assertTrue(coffee instanceof Mocha);
    }

    @Test
    void testInvalidCoffeeType() {
        assertThrows(IllegalArgumentException.class, () -> {
            CoffeeFactory.createCoffee("InvalidType");
        });
    }
}
