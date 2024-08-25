import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CafeOrderTest {

    @Test
    void testCreateItem_Beverage() {
        CafeOrder order = new CafeOrder();
        MenuItem item = order.createItem("Espresso");
        assertTrue(item instanceof Espresso);
    }

    @Test
    void testCreateItem_Pastry() {
        CafeOrder order = new CafeOrder();
        MenuItem item = order.createItem("Chocolate Cake");
        assertTrue(item instanceof ChocolateCake);
    }

    @Test
    void testCreateItem_Snack() {
        CafeOrder order = new CafeOrder();
        MenuItem item = order.createItem("Tuna Sandwich");
        assertTrue(item instanceof TunaSandwich);
    }

    @Test
    void testCreateItem_Invalid() {
        CafeOrder order = new CafeOrder();
        MenuItem item = order.createItem("Invalid");
        assertNull(item);
    }

    @Test
    void testAddItem() {
        CafeOrder order = new CafeOrder();
        order.addItem("Espresso");
        assertEquals(1, order.order.size());
        assertTrue(order.order.get(0) instanceof Espresso);
    }

    @Test
    void testServeOrder() {
        CafeOrder order = new CafeOrder();
        order.addItem("Espresso");
        order.addItem("Chocolate Cake");
        order.addItem("Tuna Sandwich");
        order.serveOrder();

        String expectedOutput = "เสิร์ฟ เอสเปรสโซ\n" +
                "เสิร์ฟ เค้กช็อกโกแลต\n" +
                "เสิร์ฟ แซนวิชทูน่า\n";
        assertEquals(expectedOutput, getOutputFromSystemOut());
    }

    // วิธีการช่วยในการรับข้อความจาก System.out
    private String getOutputFromSystemOut() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        return outputStream.toString();
    }
}