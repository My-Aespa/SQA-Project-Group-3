package ChatGPT.Java.FactoryMethod.round3.test;

// CoffeeShopTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CoffeeShopTest {

    @Test
    void testOrderCoffee() {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        CoffeeShop coffeeShop = new CoffeeShop(coffeeFactory);

        // Testing all coffee types
        coffeeShop.orderCoffee("Americano");
        coffeeShop.orderCoffee("Latte");
        coffeeShop.orderCoffee("Cappuccino");
        coffeeShop.orderCoffee("Espresso");
        coffeeShop.orderCoffee("Mocha");

        // Testing unknown coffee type (exception)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            coffeeShop.orderCoffee("Unknown");
        });
        assertEquals("Unknown coffee type: Unknown", exception.getMessage());
    }
}

