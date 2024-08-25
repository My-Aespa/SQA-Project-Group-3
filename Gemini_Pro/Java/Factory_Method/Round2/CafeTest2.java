import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CafeTest2 {

    @Test
    void testCreateMenuItem() {
        MenuFactory factory = new CafeMenuFactory();

        assertEquals("Espresso", factory.createMenuItem("Espresso").getName());
        assertEquals("Latte", factory.createMenuItem("Latte").getName());
        assertEquals("Milkshake", factory.createMenuItem("Milkshake").getName());
        assertEquals("Fruit Juice", factory.createMenuItem("Fruit Juice").getName());
        assertEquals("Croissant", factory.createMenuItem("Croissant").getName());
        assertEquals("Chocolate Cake", factory.createMenuItem("Chocolate Cake").getName());
        assertEquals("Chocolate Chip Cookies", factory.createMenuItem("Chocolate Chip Cookies").getName());
        assertEquals("Tuna Sandwich", factory.createMenuItem("Tuna Sandwich").getName());
        assertEquals("Spaghetti", factory.createMenuItem("Spaghetti").getName());
        assertEquals("Vegetable Salad", factory.createMenuItem("Vegetable Salad").getName());
    }

    @Test
    void testTakeOrder() {
        Cafe2 cafe = new Cafe2(new CafeMenuFactory());

        cafe.takeOrder("Espresso");
        cafe.takeOrder("Latte");
        cafe.takeOrder("Chocolate Cake");
        cafe.takeOrder("Spaghetti");
    }

    @Test
    void testUnknownItem() {
        MenuFactory factory = new CafeMenuFactory();

        assertThrows(IllegalArgumentException.class, () -> {
            factory.createMenuItem("Unknown Item");
        });
    }
}
