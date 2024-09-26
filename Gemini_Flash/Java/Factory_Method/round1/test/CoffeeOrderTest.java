package Gemini_Flash.Java.Factory_Method.round1.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoffeeOrderTest {

    @Test
    void testOrderAmericano() {
        CoffeeOrder order = new CoffeeOrder(new CoffeeShop());
        Coffee coffee = order.orderCoffee("Americano");
        assertNotNull(coffee);
        assertEquals("Adding hot water to espresso.", coffee.prepare());
        assertEquals("Serving Americano with a glass of water.", coffee.serve());
    }

    @Test
    void testOrderLatte() {
        CoffeeOrder order = new CoffeeOrder(new CoffeeShop());
        Coffee coffee = order.orderCoffee("Latte");
        assertNotNull(coffee);
        assertEquals("Adding steamed milk to espresso.", coffee.prepare());
        assertEquals("Serving Latte with latte art.", coffee.serve());
    }

    @Test
    void testOrderCappuccino() {
        CoffeeOrder order = new CoffeeOrder(new CoffeeShop());
        Coffee coffee = order.orderCoffee("Cappuccino");
        assertNotNull(coffee);
        assertEquals("Adding steamed milk and foamed milk to espresso.", coffee.prepare());
        assertEquals("Serving Cappuccino with latte art.", coffee.serve());
    }

    @Test
    void testOrderEspresso() {
        CoffeeOrder order = new CoffeeOrder(new CoffeeShop());
        Coffee coffee = order.orderCoffee("Espresso");
        assertNotNull(coffee);
        assertEquals("Brewing espresso.", coffee.prepare());
        assertEquals("Serving Espresso in a small cup.", coffee.serve());
    }

    @Test
    void testOrderMocha() {
        CoffeeOrder order = new CoffeeOrder(new CoffeeShop());
        Coffee coffee = order.orderCoffee("Mocha");
        assertNotNull(coffee);
        assertEquals("Adding chocolate syrup, steamed milk and whipped cream to espresso.", coffee.prepare());
        assertEquals("Serving Mocha with whipped cream and chocolate sprinkles.", coffee.serve());
    }

    @Test
    void testOrderInvalidType() {
        CoffeeOrder order = new CoffeeOrder(new CoffeeShop());
        Coffee coffee = order.orderCoffee("InvalidType");
        assertNull(coffee);
    }
}
