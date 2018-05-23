import org.json.simple.parser.ParseException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ProductTest {
    String testName = "Test name";
    String testCategory = "Test name";
    double testPrice = 435.34;

    @Test
    public void getName() throws ParseException, CategoryDoesNotExistException, IOException {
        Product product = new Product(testName, testPrice, testCategory);
        assertEquals(testName, product.getName());
    }

    @Test
    public void getPrice() throws ParseException, CategoryDoesNotExistException, IOException {
        Product product = new Product(testName, testPrice, testCategory);
        assertEquals(testPrice, product.getPrice(), 0.001);
    }

    @Test
    public void getCategory() throws ParseException, CategoryDoesNotExistException, IOException {
        Product product = new Product(testName, testPrice, testCategory);
        assertEquals(testCategory, product.getCategory());
    }
}