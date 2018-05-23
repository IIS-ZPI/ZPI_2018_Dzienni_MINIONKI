import org.json.simple.parser.ParseException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    @Test
    public void calculatePriceTest() throws IOException, ParseException, CategoryDoesNotExistException {
        State state = new State("Alabama");
        Product product = new Product("Test product", 10.0, "groceries");

        ICalculator calculator = new Calculator();
        double tax = calculator.calculateTax(state, product);

        assertEquals(1.0, tax,0.001);
    }

    @Test
    public void calculateTaxTest() throws IOException, ParseException, CategoryDoesNotExistException {
        State state = new State("Alabama");
        Product product = new Product("Test product", 10.0, "groceries");

        ICalculator calculator = new Calculator();
        double price = calculator.calculatePrice(state, product);

        assertEquals(11.0, price, 0.001);
    }

    @Test(expected = CategoryDoesNotExistException.class)
    public void badProductCategory() throws CategoryDoesNotExistException, IOException, ParseException {
        new Product("Test product", 10.0, "WRONG CATEGORY");
    }
}
