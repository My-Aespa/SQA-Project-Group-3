package ChatGPT.Java.FactoryMethod.round2.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PastryFactoryTest {
    @Test
    public void testCreateCroissant() {
        ProductFactory factory = new PastryFactory();
        Product product = factory.createProduct("Croissant");
        assertEquals("Croissant", product.getName());
    }

    @Test
    public void testCreateBun() {
        ProductFactory factory = new PastryFactory();
        Product product = factory.createProduct("Bun");
        assertEquals("Bun", product.getName());
    }

    @Test
    public void testUnknownProduct() {
        ProductFactory factory = new PastryFactory();
        assertThrows(IllegalArgumentException.class, () -> {
            factory.createProduct("Unknown");
        });
    }
}

