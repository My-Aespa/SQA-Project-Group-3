package ChatGPT.Java.FactoryMethod.round2.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SnackFactoryTest {
    @Test
    public void testCreateChickenSandwich() {
        ProductFactory factory = new SnackFactory();
        Product product = factory.createProduct("Chicken Sandwich");
        assertEquals("Chicken Sandwich", product.getName());
    }

    @Test
    public void testCreateTunaSandwich() {
        ProductFactory factory = new SnackFactory();
        Product product = factory.createProduct("Tuna Sandwich");
        assertEquals("Tuna Sandwich", product.getName());
    }

    @Test
    public void testUnknownProduct() {
        ProductFactory factory = new SnackFactory();
        assertThrows(IllegalArgumentException.class, () -> {
            factory.createProduct("Unknown");
        });
    }
}

