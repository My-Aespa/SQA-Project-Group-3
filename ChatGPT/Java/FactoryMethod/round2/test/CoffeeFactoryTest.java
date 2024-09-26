package ChatGPT.Java.FactoryMethod.round2.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoffeeFactoryTest {

    @Test
    public void testOrderCoffee() {
        CoffeeFactory coffeeFactory = new SimpleCoffeeFactory();

        // Test all coffee types
        Coffee americano = coffeeFactory.orderCoffee("Americano");
        assertTrue(americano instanceof Americano);

        Coffee latte = coffeeFactory.orderCoffee("Latte");
        assertTrue(latte instanceof Latte);

        Coffee cappuccino = coffeeFactory.orderCoffee("Cappuccino");
        assertTrue(cappuccino instanceof Cappuccino);

        Coffee espresso = coffeeFactory.orderCoffee("Espresso");
        assertTrue(espresso instanceof Espresso);

        Coffee mocha = coffeeFactory.orderCoffee("Mocha");
        assertTrue(mocha instanceof Mocha);
    }

    @Test
    public void testOrderUnknownCoffee() {
        CoffeeFactory coffeeFactory = new SimpleCoffeeFactory();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            coffeeFactory.orderCoffee("Unknown");
        });

        String expectedMessage = "Unknown coffee type: Unknown";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}

