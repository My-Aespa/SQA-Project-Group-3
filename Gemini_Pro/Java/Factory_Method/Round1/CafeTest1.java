import org.junit.jupiter.api.Test;

import code.Item;

import static org.junit.jupiter.api.Assertions.*;

public class CafeTest1 {

    @Test
    void testGetEspresso() {
        Item item = Cafe.getItem("Beverage", "Espresso");
        assertEquals("Espresso", item.getName());
        assertEquals(3.50, item.getPrice());
    }

    @Test
    void testGetLatte() {
        Item item = Cafe.getItem("Beverage", "Latte");
        assertEquals("Latte", item.getName());
        assertEquals(3.50, item.getPrice());
    }

    @Test
    void testGetMilkshakes() {
        Item item = Cafe.getItem("Beverage", "Milkshakes");
        assertEquals("Milkshakes", item.getName());
        assertEquals(3.50, item.getPrice());
    }

    @Test
    void testGetFruitJuices() {
        Item item = Cafe.getItem("Beverage", "Fruit Juices");
        assertEquals("Fruit Juices", item.getName());
        assertEquals(3.50, item.getPrice());
    }

    @Test
    void testGetCroissant() {
        Item item = Cafe.getItem("Pastry", "Croissant");
        assertEquals("Croissant", item.getName());
        assertEquals(2.00, item.getPrice());
    }

    @Test
    void testGetChocolateCake() {
        Item item = Cafe.getItem("Pastry", "Chocolate Cake");
        assertEquals("Chocolate Cake", item.getName());
        assertEquals(2.00, item.getPrice());
    }

    @Test
    void testGetChocolateChipCookies() {
        Item item = Cafe.getItem("Pastry", "Chocolate Chip Cookies");
        assertEquals("Chocolate Chip Cookies", item.getName());
        assertEquals(2.00, item.getPrice());
    }

    @Test
    void testGetTunaSandwich() {
        Item item = Cafe.getItem("Snack", "Tuna Sandwich");
        assertEquals("Tuna Sandwich", item.getName());
        assertEquals(4.00, item.getPrice());
    }

    @Test
    void testGetSpaghetti() {
        Item item = Cafe.getItem("Snack", "Spaghetti");
        assertEquals("Spaghetti", item.getName());
        assertEquals(4.00, item.getPrice());
    }

    @Test
    void testGetVegetableSalad() {
        Item item = Cafe.getItem("Snack", "Vegetable Salad");
        assertEquals("Vegetable Salad", item.getName());
        assertEquals(4.00, item.getPrice());
    }

    @Test
    void testGetInvalidItem() {
        Item item = Cafe.getItem("Invalid", "Invalid");
        assertNull(item);
    }
}