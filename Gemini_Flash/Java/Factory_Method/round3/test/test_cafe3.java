import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CafeOrderTest {

    @Test
    void testCreateItem_Beverage_Coffee() {
        CafeOrder order = new CafeOrder();
        MenuItem item = order.createItem("Beverage", "Espresso");
        assertTrue(item instanceof Coffee);
        assertEquals("Espresso", ((Coffee) item).type);
    }

    @Test
    void testCreateItem_Beverage_Tea() {
        CafeOrder order = new CafeOrder();
        MenuItem item = order.createItem("Beverage", "Green Tea");
        assertTrue(item instanceof Tea);
        assertEquals("Green Tea", ((Tea) item).type);
    }

    @Test
    void testCreateItem_Beverage_Cold() {
        CafeOrder order = new CafeOrder();
        MenuItem item = order.createItem("Beverage", "Fruit Smoothies");
        assertTrue(item instanceof ColdBeverage);
        assertEquals("Fruit Smoothies", ((ColdBeverage) item).type);
    }

    @Test
    void testCreateItem_Pastry_Bread() {
        CafeOrder order = new CafeOrder();
        MenuItem item = order.createItem("Pastry", "Croissant");
        assertTrue(item instanceof Bread);
        assertEquals("Croissant", ((Bread) item).type);
    }

    @Test
    void testCreateItem_Pastry_Cake() {
        CafeOrder order = new CafeOrder();
        MenuItem item = order.createItem("Pastry", "Chocolate Cake");
        assertTrue(item instanceof Cake);
        assertEquals("Chocolate Cake", ((Cake) item).type);
    }

    @Test
    void testCreateItem_Pastry_Cookies() {
        CafeOrder order = new CafeOrder();
        MenuItem item = order.createItem("Pastry", "Chocolate Chip Cookies");
        assertTrue(item instanceof Cookies);
        assertEquals("Chocolate Chip Cookies", ((Cookies) item).type);
    }

    @Test
    void testCreateItem_Snack_Sandwiches() {
        CafeOrder order = new CafeOrder();
        MenuItem item = order.createItem("Snack", "Chicken Sandwich");
        assertTrue(item instanceof Sandwiches);
        assertEquals("Chicken Sandwich", ((Sandwiches) item).type);
    }

    @Test
    void testCreateItem_Snack_Pasta() {
        CafeOrder order = new CafeOrder();
        MenuItem item = order.createItem("Snack", "Spaghetti");
        assertTrue(item instanceof Pasta);
        assertEquals("Spaghetti", ((Pasta) item).type);
    }

    @Test
    void testCreateItem_Snack_Salads() {
        CafeOrder order = new CafeOrder();
        MenuItem item = order.createItem("Snack", "Vegetable Salad");
        assertTrue(item instanceof Salads);
        assertEquals("Vegetable Salad", ((Salads) item).type);
    }

    @Test
    void testCreateItem_Invalid() {
        CafeOrder order = new CafeOrder();
        MenuItem item = order.createItem("Invalid", "Invalid");
        assertNull(item);
    }

    @Test
    void testAddItem() {
        CafeOrder order = new CafeOrder();
        order.addItem("Beverage", "Espresso");
        assertEquals(1, order.order.size());
        assertTrue(order.order.get(0) instanceof Coffee);
        assertEquals("Espresso", ((Coffee) order.order.get(0)).type);
    }

    @Test
    void testPrepareOrder() {
        CafeOrder order = new CafeOrder();
        order.addItem("Beverage", "Espresso");
        order.addItem("Pastry", "Chocolate Cake");
        order.addItem("Snack", "Chicken Sandwich");
        order.prepareOrder();

        String expectedOutput = "กำลังเตรียม Espresso กาแฟ\n" +
                "กำลังเตรียม Chocolate Cake เค้ก\n" +
                "กำลังเตรียม Chicken Sandwich แซนวิช\n";
        assertEquals(expectedOutput, getOutputFromSystemOut());
    }

    // วิธีการช่วยในการรับข้อความจาก System.out
    private String getOutputFromSystemOut() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        return outputStream.toString();
    }
}