package ChatGPT.Java.FactoryMethod.round1.test;

// ProductFactoryTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductFactoryTest {

    @Test
    public void testBeverageFactory() {
        ProductFactory factory = new BeverageFactory();
        
        Product product = factory.createProduct("Espresso");
        assertEquals("Espresso", product.getName());

        product = factory.createProduct("Latte");
        assertEquals("Latte", product.getName());

        product = factory.createProduct("Milkshakes");
        assertEquals("Milkshakes", product.getName());

        product = factory.createProduct("Fruit Juices");
        assertEquals("Fruit Juices", product.getName());
    }

    @Test
    public void testPastryFactory() {
        ProductFactory factory = new PastryFactory();

        Product product = factory.createProduct("Croissant");
        assertEquals("Croissant", product.getName());

        product = factory.createProduct("Chocolate Cake");
        assertEquals("Chocolate Cake", product.getName());

        product = factory.createProduct("Chocolate Chip Cookies");
        assertEquals("Chocolate Chip Cookies", product.getName());
    }

    @Test
    public void testSnackFactory() {
        ProductFactory factory = new SnackFactory();

        Product product = factory.createProduct("Tuna Sandwich");
        assertEquals("Tuna Sandwich", product.getName());

        product = factory.createProduct("Spaghetti");
        assertEquals("Spaghetti", product.getName());

        product = factory.createProduct("Vegetable Salad");
        assertEquals("Vegetable Salad", product.getName());
    }

    @Test
    public void testInvalidProductType() {
        ProductFactory factory = new BeverageFactory();
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factory.createProduct("Invalid Product");
        });
        
        assertEquals("Unknown beverage type", exception.getMessage());
    }
}

