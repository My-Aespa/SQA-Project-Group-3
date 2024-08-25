package ChatGPT.Java.FactoryMethod.round2.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BeverageFactoryTest {
    @Test
    public void testCreateEspresso() {
        ProductFactory factory = new BeverageFactory();
        Product product = factory.createProduct("Espresso");
        assertEquals("Espresso", product.getName());
    }

    @Test
    public void testCreateCappuccino() {
        ProductFactory factory = new BeverageFactory();
        Product product = factory.createProduct("Cappuccino");
        assertEquals("Cappuccino", product.getName());
    }

    @Test
    public void testUnknownProduct() {
        ProductFactory factory = new BeverageFactory();
        assertThrows(IllegalArgumentException.class, () -> {
            factory.createProduct("Unknown");
        });
    }
}
