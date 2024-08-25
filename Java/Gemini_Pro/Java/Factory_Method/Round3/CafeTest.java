import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CafeTest {

    private Cafe.CafeFactory cafeFactory = new Cafe.CafeFactory();

    @Test
    void testCreateMenuItem_Coffee() {
        Cafe.MenuItem espresso = cafeFactory.createMenuItem("Coffee", "Espresso");
        assertNotNull(espresso);
        assertTrue(espresso instanceof Cafe.Coffee);
        assertEquals("Preparing Espresso coffee", espresso.prepare());

        Cafe.MenuItem cappuccino = cafeFactory.createMenuItem("Coffee", "Cappuccino");
        assertNotNull(cappuccino);
        assertTrue(cappuccino instanceof Cafe.Coffee);
        assertEquals("Preparing Cappuccino coffee", cappuccino.prepare());

        Cafe.MenuItem latte = cafeFactory.createMenuItem("Coffee", "Latte");
        assertNotNull(latte);
        assertTrue(latte instanceof Cafe.Coffee);
        assertEquals("Preparing Latte coffee", latte.prepare());

        Cafe.MenuItem mocha = cafeFactory.createMenuItem("Coffee", "Mocha");
        assertNotNull(mocha);
        assertTrue(mocha instanceof Cafe.Coffee);
        assertEquals("Preparing Mocha coffee", mocha.prepare());

        Cafe.MenuItem americano = cafeFactory.createMenuItem("Coffee", "Americano");
        assertNotNull(americano);
        assertTrue(americano instanceof Cafe.Coffee);
        assertEquals("Preparing Americano coffee", americano.prepare());

        Cafe.MenuItem invalidCoffee = cafeFactory.createMenuItem("Coffee", "Invalid Coffee");
        assertNull(invalidCoffee);
    }

    @Test
    void testCreateMenuItem_Tea() {
        Cafe.MenuItem blackTea = cafeFactory.createMenuItem("Tea", "Black Tea");
        assertNotNull(blackTea);
        assertTrue(blackTea instanceof Cafe.Tea);
        assertEquals("Preparing Black Tea tea", blackTea.prepare());

        Cafe.MenuItem greenTea = cafeFactory.createMenuItem("Tea", "Green Tea");
        assertNotNull(greenTea);
        assertTrue(greenTea instanceof Cafe.Tea);
        assertEquals("Preparing Green Tea tea", greenTea.prepare());

        Cafe.MenuItem oolongTea = cafeFactory.createMenuItem("Tea", "Oolong Tea");
        assertNotNull(oolongTea);
        assertTrue(oolongTea instanceof Cafe.Tea);
        assertEquals("Preparing Oolong Tea tea", oolongTea.prepare());

        Cafe.MenuItem lemonTea = cafeFactory.createMenuItem("Tea", "Lemon Tea");
        assertNotNull(lemonTea);
        assertTrue(lemonTea instanceof Cafe.Tea);
        assertEquals("Preparing Lemon Tea tea", lemonTea.prepare());

        Cafe.MenuItem invalidTea = cafeFactory.createMenuItem("Tea", "Invalid Tea");
        assertNull(invalidTea);
    }

    @Test
    void testCreateMenuItem_ColdBeverage() {
        Cafe.MenuItem fruitSmoothies = cafeFactory.createMenuItem("ColdBeverage", "Fruit Smoothies");
        assertNotNull(fruitSmoothies);
        assertTrue(fruitSmoothies instanceof Cafe.ColdBeverage);
        assertEquals("Preparing Fruit Smoothies", fruitSmoothies.prepare());

        Cafe.MenuItem milkshakes = cafeFactory.createMenuItem("ColdBeverage", "Milkshakes");
        assertNotNull(milkshakes);
        assertTrue(milkshakes instanceof Cafe.ColdBeverage);
        assertEquals("Preparing Milkshakes", milkshakes.prepare());

        Cafe.MenuItem fruitJuices = cafeFactory.createMenuItem("ColdBeverage", "Fruit Juices");
        assertNotNull(fruitJuices);
        assertTrue(fruitJuices instanceof Cafe.ColdBeverage);
        assertEquals("Preparing Fruit Juices", fruitJuices.prepare());

        Cafe.MenuItem invalidColdBeverage = cafeFactory.createMenuItem("ColdBeverage", "Invalid Cold Beverage");
        assertNull(invalidColdBeverage);
    }

    @Test
    void testCreateMenuItem_Bread() {
        Cafe.MenuItem croissant = cafeFactory.createMenuItem("Bread", "Croissant");
        assertNotNull(croissant);
        assertTrue(croissant instanceof Cafe.Bread);
        assertEquals("Preparing Croissant bread", croissant.prepare());

        Cafe.MenuItem bun = cafeFactory.createMenuItem("Bread", "Bun");
        assertNotNull(bun);
        assertTrue(bun instanceof Cafe.Bread);
        assertEquals("Preparing Bun bread", bun.prepare());

        Cafe.MenuItem custardBread = cafeFactory.createMenuItem("Bread", "Custard Bread");
        assertNotNull(custardBread);
        assertTrue(custardBread instanceof Cafe.Bread);
        assertEquals("Preparing Custard Bread bread", custardBread.prepare());

        Cafe.MenuItem invalidBread = cafeFactory.createMenuItem("Bread", "Invalid Bread");
        assertNull(invalidBread);
    }

    @Test
    void testCreateMenuItem_Cake() {
        Cafe.MenuItem chocolateCake = cafeFactory.createMenuItem("Cake", "Chocolate Cake");
        assertNotNull(chocolateCake);
        assertTrue(chocolateCake instanceof Cafe.Cake);
        assertEquals("Preparing Chocolate Cake cake", chocolateCake.prepare());

        Cafe.MenuItem strawberryCake = cafeFactory.createMenuItem("Cake", "Strawberry Cake");
        assertNotNull(strawberryCake);
        assertTrue(strawberryCake instanceof Cafe.Cake);
        assertEquals("Preparing Strawberry Cake cake", strawberryCake.prepare());

        Cafe.MenuItem coconutCake = cafeFactory.createMenuItem("Cake", "Coconut Cake");
        assertNotNull(coconutCake);
        assertTrue(coconutCake instanceof Cafe.Cake);
        assertEquals("Preparing Coconut Cake cake", coconutCake.prepare());

        Cafe.MenuItem invalidCake = cafeFactory.createMenuItem("Cake", "Invalid Cake");
        assertNull(invalidCake);
    }

    @Test
    void testCreateMenuItem_Cookie() {
        Cafe.MenuItem chocolateChipCookies = cafeFactory.createMenuItem("Cookie", "Chocolate Chip Cookies");
        assertNotNull(chocolateChipCookies);
        assertTrue(chocolateChipCookies instanceof Cafe.Cookie);
        assertEquals("Preparing Chocolate Chip Cookies cookies", chocolateChipCookies.prepare());

        Cafe.MenuItem oatCookies = cafeFactory.createMenuItem("Cookie", "Oat Cookies");
        assertNotNull(oatCookies);
        assertTrue(oatCookies instanceof Cafe.Cookie);
        assertEquals("Preparing Oat Cookies cookies", oatCookies.prepare());

        Cafe.MenuItem invalidCookie = cafeFactory.createMenuItem("Cookie", "Invalid Cookie");
        assertNull(invalidCookie);
    }

    @Test
    void testCreateMenuItem_Sandwich() {
        Cafe.MenuItem chickenSandwich = cafeFactory.createMenuItem("Sandwich", "Chicken Sandwich");
        assertNotNull(chickenSandwich);
        assertTrue(chickenSandwich instanceof Cafe.Sandwich);
        assertEquals("Preparing Chicken Sandwich sandwich", chickenSandwich.prepare());

        Cafe.MenuItem tunaSandwich = cafeFactory.createMenuItem("Sandwich", "Tuna Sandwich");
        assertNotNull(tunaSandwich);
        assertTrue(tunaSandwich instanceof Cafe.Sandwich);
        assertEquals("Preparing Tuna Sandwich sandwich", tunaSandwich.prepare());

        Cafe.MenuItem invalidSandwich = cafeFactory.createMenuItem("Sandwich", "Invalid Sandwich");
        assertNull(invalidSandwich);
    }

    @Test
    void testCreateMenuItem_Pasta() {
        Cafe.MenuItem spaghetti = cafeFactory.createMenuItem("Pasta", "Spaghetti");
        assertNotNull(spaghetti);
        assertTrue(spaghetti instanceof Cafe.Pasta);
        assertEquals("Preparing Spaghetti pasta", spaghetti.prepare());

        Cafe.MenuItem penne = cafeFactory.createMenuItem("Pasta", "Penne");
        assertNotNull(penne);
        assertTrue(penne instanceof Cafe.Pasta);
        assertEquals("Preparing Penne pasta", penne.prepare());

        Cafe.MenuItem invalidPasta = cafeFactory.createMenuItem("Pasta", "Invalid Pasta");
        assertNull(invalidPasta);
    }

    @Test
    void testCreateMenuItem_Salad() {
        Cafe.MenuItem vegetableSalad = cafeFactory.createMenuItem("Salad", "Vegetable Salad");
        assertNotNull(vegetableSalad);
        assertTrue(vegetableSalad instanceof Cafe.Salad);
        assertEquals("Preparing Vegetable Salad salad", vegetableSalad.prepare());

        Cafe.MenuItem chickenSalad = cafeFactory.createMenuItem("Salad", "Chicken Salad");
        assertNotNull(chickenSalad);
        assertTrue(chickenSalad instanceof Cafe.Salad);
        assertEquals("Preparing Chicken Salad salad", chickenSalad.prepare());

        Cafe.MenuItem invalidSalad = cafeFactory.createMenuItem("Salad", "Invalid Salad");
        assertNull(invalidSalad);
    }

    @Test
    void testCreateMenuItem_InvalidCategory() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Invalid", "Item");
        assertNull(item);
    }

    @Test
    void testCreateMenuItem_NullCategory() {
        Cafe.MenuItem item = cafeFactory.createMenuItem(null, "Item");
        assertNull(item);
    }

    @Test
    void testCreateMenuItem_NullType() {
        Cafe.MenuItem item = cafeFactory.createMenuItem("Coffee", null);
        assertNull(item);
    }
}