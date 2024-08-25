package ChatGPT.Java.FactoryMethod.round1.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ChatGPT.Java.FactoryMethod.round1.source.*;

public class FactoryTests {
    @Test
    public void testBeverageFactory() {
        ProductFactory factory = new BeverageFactory();

        Product espresso = factory.createProduct("Espresso");
        assertEquals("Coffee: Espresso", espresso.getName());

        Product blackTea = factory.createProduct("Black Tea");
        assertEquals("Tea: Black Tea", blackTea.getName());

        Product smoothie = factory.createProduct("Fruit Smoothies");
        assertEquals("Cold Beverage: Fruit Smoothies", smoothie.getName());
    }

    @Test
    public void testPastryFactory() {
        ProductFactory factory = new PastryFactory();

        Product croissant = factory.createProduct("Croissant");
        assertEquals("Bread: Croissant", croissant.getName());

        Product chocolateCake = factory.createProduct("Chocolate Cake");
        assertEquals("Cake: Chocolate Cake", chocolateCake.getName());

        Product cookies = factory.createProduct("Chocolate Chip Cookies");
        assertEquals("Cookie: Chocolate Chip Cookies", cookies.getName());
    }

    @Test
    public void testSnackFactory() {
        ProductFactory factory = new SnackFactory();

        Product sandwich = factory.createProduct("Chicken Sandwich");
        assertEquals("Sandwich: Chicken Sandwich", sandwich.getName());

        Product pasta = factory.createProduct("Spaghetti");
        assertEquals("Pasta: Spaghetti", pasta.getName());

        Product salad = factory.createProduct("Vegetable Salad");
        assertEquals("Salad: Vegetable Salad", salad.getName());
    }
}
