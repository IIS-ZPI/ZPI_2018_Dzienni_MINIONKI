import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {
    String testName = "Test name";
    String testCategory = "Test name";
    double testPrice = 435.34;

    @Test
    public void getName() {
        Product product = new Product(testName, testPrice, testCategory);
        assertEquals(testName, product.getName());
    }

    @Test
    public void getPrice() {
        Product product = new Product(testName, testPrice, testCategory);
        assertEquals(testPrice, product.getPrice(), 0.001);
    }

    @Test
    public void getCategory() {
        Product product = new Product(testName, testPrice, testCategory);
        assertEquals(testCategory, product.getCategory());
    }
}