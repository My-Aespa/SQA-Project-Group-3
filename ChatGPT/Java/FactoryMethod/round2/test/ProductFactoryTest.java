package ChatGPT.Java.FactoryMethod.round2.test;

// ProductFactoryTest.java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ProductFactoryTest {

    @Test
    public void testEspressoFactory() {
        ProductFactory factory = new EspressoFactory();
        Product product = factory.createProduct();
        assertEquals("Espresso", product.getName());
    }

    @Test
    public void testLatteFactory() {
        ProductFactory factory = new LatteFactory();
        Product product = factory.createProduct();
        assertEquals("Latte", product.getName());
    }

    @Test
    public void testMilkshakesFactory() {
        ProductFactory factory = new MilkshakesFactory();
        Product product = factory.createProduct();
        assertEquals("Milkshakes", product.getName());
    }

    @Test
    public void testFruitJuicesFactory() {
        ProductFactory factory = new FruitJuicesFactory();
        Product product = factory.createProduct();
        assertEquals("Fruit Juices", product.getName());
    }

    @Test
    public void testCroissantFactory() {
        ProductFactory factory = new CroissantFactory();
        Product product = factory.createProduct();
        assertEquals("Croissant", product.getName());
    }

    @Test
    public void testChocolateCakeFactory() {
        ProductFactory factory = new ChocolateCakeFactory();
        Product product = factory.createProduct();
        assertEquals("Chocolate Cake", product.getName());
    }

    @Test
    public void testChocolateChipCookiesFactory() {
        ProductFactory factory = new ChocolateChipCookiesFactory();
        Product product = factory.createProduct();
        assertEquals("Chocolate Chip Cookies", product.getName());
    }

    @Test
    public void testTunaSandwichFactory() {
        ProductFactory factory = new TunaSandwichFactory();
        Product product = factory.createProduct();
        assertEquals("Tuna Sandwich", product.getName());
    }

    @Test
    public void testSpaghettiFactory() {
        ProductFactory factory = new SpaghettiFactory();
        Product product = factory.createProduct();
        assertEquals("Spaghetti", product.getName());
    }

    @Test
    public void testVegetableSaladFactory() {
        ProductFactory factory = new VegetableSaladFactory();
        Product product = factory.createProduct();
        assertEquals("Vegetable Salad", product.getName());
    }
}
