package ChatGPT.Java.FactoryMethod.round3.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MenuFactoryTest {

    @Test
    public void testCreateBeverage() {
        MenuFactory factory = new ConcreteMenuFactory();

        Beverage espresso = factory.createBeverage("Espresso");
        assertNotNull(espresso);
        assertEquals("Espresso", espresso.getName());

        Beverage latte = factory.createBeverage("Latte");
        assertNotNull(latte);
        assertEquals("Latte", latte.getName());

        Beverage milkshakes = factory.createBeverage("Milkshakes");
        assertNotNull(milkshakes);
        assertEquals("Milkshakes", milkshakes.getName());

        Beverage fruitJuices = factory.createBeverage("Fruit Juices");
        assertNotNull(fruitJuices);
        assertEquals("Fruit Juices", fruitJuices.getName());

        assertNull(factory.createBeverage("Nonexistent Beverage"));
    }

    @Test
    public void testCreatePastry() {
        MenuFactory factory = new ConcreteMenuFactory();

        Pastry croissant = factory.createPastry("Croissant");
        assertNotNull(croissant);
        assertEquals("Croissant", croissant.getName());

        Pastry chocolateCake = factory.createPastry("Chocolate Cake");
        assertNotNull(chocolateCake);
        assertEquals("Chocolate Cake", chocolateCake.getName());

        Pastry chocolateChipCookies = factory.createPastry("Chocolate Chip Cookies");
        assertNotNull(chocolateChipCookies);
        assertEquals("Chocolate Chip Cookies", chocolateChipCookies.getName());

        assertNull(factory.createPastry("Nonexistent Pastry"));
    }

    @Test
    public void testCreateSnack() {
        MenuFactory factory = new ConcreteMenuFactory();

        Snack tunaSandwich = factory.createSnack("Tuna Sandwich");
        assertNotNull(tunaSandwich);
        assertEquals("Tuna Sandwich", tunaSandwich.getName());

        Snack spaghetti = factory.createSnack("Spaghetti");
        assertNotNull(spaghetti);
        assertEquals("Spaghetti", spaghetti.getName());

        Snack vegetableSalad = factory.createSnack("Vegetable Salad");
        assertNotNull(vegetableSalad);
        assertEquals("Vegetable Salad", vegetableSalad.getName());

        assertNull(factory.createSnack("Nonexistent Snack"));
    }
}

