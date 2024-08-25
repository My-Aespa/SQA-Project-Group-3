import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CafeTest {
    @Test
    public void testOrderBeverage() {
        Cafe cafe = new Cafe();
        MenuItem item = cafe.orderItem("Beverage", "Espresso");
        assertTrue(item instanceof Espresso);
        item.serve();
    }

    @Test
    public void testOrderPastry() {
        Cafe cafe = new Cafe();
        MenuItem item = cafe.orderItem("Pastry", "Croissant");
        assertTrue(item instanceof Croissant);
        item.serve();
    }

    @Test
    public void testOrderSnack() {
        Cafe cafe = new Cafe();
        MenuItem item = cafe.orderItem("Snack", "Tuna Sandwich");
        assertTrue(item instanceof TunaSandwich);
        item.serve();
    }

    @Test
    public void testUnknownBeverage() {
        Cafe cafe = new Cafe();
        assertThrows(IllegalArgumentException.class, () -> {
            cafe.orderItem("Beverage", "Unknown");
        });
    }

    @Test
    public void testUnknownPastry() {
        Cafe cafe = new Cafe();
        assertThrows(IllegalArgumentException.class, () -> {
            cafe.orderItem("Pastry", "Unknown");
        });
    }

    @Test
    public void testUnknownSnack() {
        Cafe cafe = new Cafe();
        assertThrows(IllegalArgumentException.class, () -> {
            cafe.orderItem("Snack", "Unknown");
        });
    }

    @Test
    public void testUnknownCategory() {
        Cafe cafe = new Cafe();
        assertThrows(IllegalArgumentException.class, () -> {
            cafe.orderItem("Unknown", "Espresso");
        });
    }
}