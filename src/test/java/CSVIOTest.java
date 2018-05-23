import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CSVIOTest {

    @Test
    public void readProducts() {
        HashMap<String, Product> stringProductHashMap = CSVIO.readProducts("product_list.csv");
        assertNotEquals(null, stringProductHashMap);
        assertEquals(false, stringProductHashMap.isEmpty());
    }
}