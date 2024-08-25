import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CafeTest {

    private Cafe.CafeFactory cafeFactory = new Cafe.CafeFactory();

    @Test
    void testCreateMenuItem_Coffee() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Coffee", "Espresso");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Coffee);
        assertEquals("Preparing Espresso coffee", item.prepare());
    }

    // (Tests for other coffee types)

    @Test
    void testCreateMenuItem_Tea() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Tea", "Black Tea");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Tea);
        assertEquals("Preparing Black Tea tea", item.prepare());
    }

    // (Tests for other tea types)

    @Test
    void testCreateMenuItem_ColdBeverage() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("ColdBeverage", "Fruit Smoothies");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.ColdBeverage);
        assertEquals("Preparing Fruit Smoothies", item.prepare());
    }

    // (Tests for other cold beverage types)

    // ... (Similar tests for Bread, Cake, Cookie, Sandwich, Pasta, Salad)

    @Test
    void testCreateMenuItem_InvalidCategory() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Invalid", "Item");
        assertNull(item);
    }
}