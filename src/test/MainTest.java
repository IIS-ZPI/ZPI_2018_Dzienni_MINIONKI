import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FirstJUnit5Tests {

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void getPriceTest()
    {
        ICalculator iCalculator = new Calculator();
        State state = new State();
        Product product = new Product();
        double price = iCalculator.calculatePrice(stan, product);
    }

    @Test
    void createState()
    {

    }
}