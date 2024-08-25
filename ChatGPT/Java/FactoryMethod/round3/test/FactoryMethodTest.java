package ChatGPT.Java.FactoryMethod.round3.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

    @Test
    void testBeverageFactory() {
        ProductFactory factory = new BeverageFactory();
        
        Product product = factory.createProduct("Espresso");
        assertEquals("Espresso", product.getName());

        product = factory.createProduct("Cappuccino");
        assertEquals("Cappuccino", product.getName());

        product = factory.createProduct("Latte");
        assertEquals("Latte", product.getName());

        product = factory.createProduct("Mocha");
        assertEquals("Mocha", product.getName());

        product = factory.createProduct("Americano");
        assertEquals("Americano", product.getName());

        product = factory.createProduct("Black Tea");
        assertEquals("Black Tea", product.getName());

        product = factory.createProduct("Green Tea");
        assertEquals("Green Tea", product.getName());

        product = factory.createProduct("Oolong Tea");
        assertEquals("Oolong Tea", product.getName());

        product = factory.createProduct("Lemon Tea");
        assertEquals("Lemon Tea", product.getName());

        product = factory.createProduct("Fruit Smoothies");
        assertEquals("Fruit Smoothies", product.getName());

        product = factory.createProduct("Milkshakes");
        assertEquals("Milkshakes", product.getName());

        product = factory.createProduct("Fruit Juices");
        assertEquals("Fruit Juices", product.getName());
    }

    @Test
    void testPastryFactory() {
        ProductFactory factory = new PastryFactory();
        
        Product product = factory.createProduct("Croissant");
        assertEquals("Croissant", product.getName());

        product = factory.createProduct("Bun");
        assertEquals("Bun", product.getName());

        product = factory.createProduct("Custard Bread");
        assertEquals("Custard Bread", product.getName());

        product = factory.createProduct("Chocolate Cake");
        assertEquals("Chocolate Cake", product.getName());

        product = factory.createProduct("Strawberry Cake");
        assertEquals("Strawberry Cake", product.getName());

        product = factory.createProduct("Coconut Cake");
        assertEquals("Coconut Cake", product.getName());

        product = factory.createProduct("Chocolate Chip Cookies");
        assertEquals("Chocolate Chip Cookies", product.getName());

        product = factory.createProduct("Oat Cookies");
        assertEquals("Oat Cookies", product.getName());
    }

    @Test
    void testSnackFactory() {
        ProductFactory factory = new SnackFactory();
        
        Product product = factory.createProduct("Chicken Sandwich");
        assertEquals("Chicken Sandwich", product.getName());

        product = factory.createProduct("Tuna Sandwich");
        assertEquals("Tuna Sandwich", product.getName());

        product = factory.createProduct("Spaghetti");
        assertEquals("Spaghetti", product.getName());

        product = factory.createProduct("Penne");
        assertEquals("Penne", product.getName());

        product = factory.createProduct("Vegetable Salad");
        assertEquals("Vegetable Salad", product.getName());

        product = factory.createProduct("Chicken Salad");
        assertEquals("Chicken Salad", product.getName());
    }

    @Test
    void testInvalidProduct() {
        ProductFactory beverageFactory = new BeverageFactory();
        assertThrows(IllegalArgumentException.class, () -> beverageFactory.createProduct("InvalidType"));
        
        ProductFactory pastryFactory = new PastryFactory();
        assertThrows(IllegalArgumentException.class, () -> pastryFactory.createProduct("InvalidType"));
        
        ProductFactory snackFactory = new SnackFactory();
        assertThrows(IllegalArgumentException.class, () -> snackFactory.createProduct("InvalidType"));
    }
}

