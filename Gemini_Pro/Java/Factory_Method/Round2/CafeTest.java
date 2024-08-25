import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CafeTest {

    private Cafe.CafeFactory cafeFactory = new Cafe.CafeFactory();

    // Coffee Tests
    @Test
    void testCreateMenuItem_Coffee_Espresso() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Coffee", "Espresso");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Coffee);
        assertEquals("Preparing Espresso coffee", item.prepare());
    }

    @Test
    void testCreateMenuItem_Coffee_Cappuccino() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Coffee", "Cappuccino");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Coffee);
        assertEquals("Preparing Cappuccino coffee", item.prepare());
    }

    @Test
    void testCreateMenuItem_Coffee_Latte() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Coffee", "Latte");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Coffee);
        assertEquals("Preparing Latte coffee", item.prepare());
    }

    @Test
    void testCreateMenuItem_Coffee_Mocha() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Coffee", "Mocha");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Coffee);
        assertEquals("Preparing Mocha coffee", item.prepare());
    }

    @Test
    void testCreateMenuItem_Coffee_Americano() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Coffee", "Americano");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Coffee);
        assertEquals("Preparing Americano coffee", item.prepare());
    }

    // Tea Tests
    @Test
    void testCreateMenuItem_Tea_BlackTea() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Tea", "Black Tea");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Tea);
        assertEquals("Preparing Black Tea tea", item.prepare());
    }

    @Test
    void testCreateMenuItem_Tea_GreenTea() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Tea", "Green Tea");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Tea);
        assertEquals("Preparing Green Tea tea", item.prepare());
    }

    @Test
    void testCreateMenuItem_Tea_OolongTea() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Tea", "Oolong Tea");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Tea);
        assertEquals("Preparing Oolong Tea tea", item.prepare());
    }

    @Test
    void testCreateMenuItem_Tea_LemonTea() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Tea", "Lemon Tea");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Tea);
        assertEquals("Preparing Lemon Tea tea", item.prepare());
    }

    // Cold Beverage Tests
    @Test
    void testCreateMenuItem_ColdBeverage_FruitSmoothies() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("ColdBeverage", "Fruit Smoothies");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.ColdBeverage);
        assertEquals("Preparing Fruit Smoothies", item.prepare());
    }

    @Test
    void testCreateMenuItem_ColdBeverage_Milkshakes() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("ColdBeverage", "Milkshakes");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.ColdBeverage);
        assertEquals("Preparing Milkshakes", item.prepare());
    }

    @Test
    void testCreateMenuItem_ColdBeverage_FruitJuices() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("ColdBeverage", "Fruit Juices");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.ColdBeverage);
        assertEquals("Preparing Fruit Juices", item.prepare());
    }

    // Bread Tests
    @Test
    void testCreateMenuItem_Bread_Croissant() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Bread", "Croissant");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Bread);
        assertEquals("Preparing Croissant bread", item.prepare());
    }

    @Test
    void testCreateMenuItem_Bread_Bun() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Bread", "Bun");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Bread);
        assertEquals("Preparing Bun bread", item.prepare());
    }

    @Test
    void testCreateMenuItem_Bread_CustardBread() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Bread", "Custard Bread");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Bread);
        assertEquals("Preparing Custard Bread bread", item.prepare());
    }

    // Cake Tests
    @Test
    void testCreateMenuItem_Cake_ChocolateCake() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Cake", "Chocolate Cake");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Cake);
        assertEquals("Preparing Chocolate Cake cake", item.prepare());
    }

    @Test
    void testCreateMenuItem_Cake_StrawberryCake() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Cake", "Strawberry Cake");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Cake);
        assertEquals("Preparing Strawberry Cake cake", item.prepare());
    }

    @Test
    void testCreateMenuItem_Cake_CoconutCake() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Cake", "Coconut Cake");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Cake);
        assertEquals("Preparing Coconut Cake cake", item.prepare());
    }

    // Cookie Tests
    @Test
    void testCreateMenuItem_Cookie_ChocolateChipCookies() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Cookie", "Chocolate Chip Cookies");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Cookie);
        assertEquals("Preparing Chocolate Chip Cookies cookies", item.prepare());
    }

    @Test
    void testCreateMenuItem_Cookie_OatCookies() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Cookie", "Oat Cookies");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Cookie);
        assertEquals("Preparing Oat Cookies cookies", item.prepare());
    }

    // Sandwich Tests
    @Test
    void testCreateMenuItem_Sandwich_ChickenSandwich() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Sandwich", "Chicken Sandwich");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Sandwich);
        assertEquals("Preparing Chicken Sandwich sandwich", item.prepare());
    }

    @Test
    void testCreateMenuItem_Sandwich_TunaSandwich() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Sandwich", "Tuna Sandwich");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Sandwich);
        assertEquals("Preparing Tuna Sandwich sandwich", item.prepare());
    }

    // Pasta Tests
    @Test
    void testCreateMenuItem_Pasta_Spaghetti() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Pasta", "Spaghetti");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Pasta);
        assertEquals("Preparing Spaghetti pasta", item.prepare());
    }

    @Test
    void testCreateMenuItem_Pasta_Penne() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Pasta", "Penne");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Pasta);
        assertEquals("Preparing Penne pasta", item.prepare());
    }

    // Salad Tests
    @Test
    void testCreateMenuItem_Salad_VegetableSalad() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Salad", "Vegetable Salad");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Salad);
        assertEquals("Preparing Vegetable Salad salad", item.prepare());
    }

    @Test
    void testCreateMenuItem_Salad_ChickenSalad() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Salad", "Chicken Salad");
        assertNotNull(item);
        assertTrue(item instanceof Cafe.Salad);
        assertEquals("Preparing Chicken Salad salad", item.prepare());
    }

    // Invalid Category Test
    @Test
    void testCreateMenuItem_InvalidCategory() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Invalid", "Item");
        assertNull(item);
    }

    // Invalid Type Tests
    @Test
    void testCreateMenuItem_Coffee_InvalidType() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Coffee", "Invalid Coffee");
        assertNull(item);
    }

    @Test
    void testCreateMenuItem_Tea_InvalidType() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Tea", "Invalid Tea");
        assertNull(item);
    }

    @Test
    void testCreateMenuItem_ColdBeverage_InvalidType() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("ColdBeverage", "Invalid Cold Beverage");
        assertNull(item);
    }

    @Test
    void testCreateMenuItem_Bread_InvalidType() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Bread", "Invalid Bread");
        assertNull(item);
    }

    @Test
    void testCreateMenuItem_Cake_InvalidType() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Cake", "Invalid Cake");
        assertNull(item);
    }

    @Test
    void testCreateMenuItem_Cookie_InvalidType() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Cookie", "Invalid Cookie");
        assertNull(item);
    }

    @Test
    void testCreateMenuItem_Sandwich_InvalidType() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Sandwich", "Invalid Sandwich");
        assertNull(item);
    }

    @Test
    void testCreateMenuItem_Pasta_InvalidType() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Pasta", "Invalid Pasta");
        assertNull(item);
    }

    @Test
    void testCreateMenuItem_Salad_InvalidType() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Salad", "Invalid Salad");
        assertNull(item);
    }
}