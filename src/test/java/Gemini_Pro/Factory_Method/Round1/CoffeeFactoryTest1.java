package Gemini_Pro.Factory_Method.Round1;

// CoffeeFactoryTest.java (JUnit Test)
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class CoffeeFactoryTest1 {

    @Test
    void testCreateCoffee() {
        CoffeeFactory factory = new CoffeeFactory();

        // Test each coffee type
        assertEquals("Americano Coffee", factory.createCoffee("Americano").getDescription());
        assertEquals("Latte Coffee", factory.createCoffee("Latte").getDescription());
        assertEquals("Cappuccino Coffee", factory.createCoffee("Cappuccino").getDescription());
        assertEquals("Espresso Coffee", factory.createCoffee("Espresso").getDescription());
        assertEquals("Mocha Coffee", factory.createCoffee("Mocha").getDescription());

        // Test null and invalid input
        assertNull(factory.createCoffee(null));
        assertNull(factory.createCoffee(""));
        assertNull(factory.createCoffee("Invalid Coffee"));
    }
}
