import org.json.simple.parser.ParseException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    @Test
    public void calculatePriceTest() throws IOException, ParseException {
        State state = new State("Alabama");
        Product product = new Product("Test product", 10.0, "Groceries");

        ICalculator calculator = new Calculator();
        double tax = calculator.calculateTax(state, product);

        assertEquals(1.0, tax,0.001);
    }

    @Test
    public void calculateTaxTest() throws IOException, ParseException {
        State state = new State("Alabama");
        Product product = new Product("Test product", 10.0, "Groceries");

        ICalculator calculator = new Calculator();
        double price = calculator.calculatePrice(state, product);

        assertEquals(11.0, price, 0.001);
    }
}
