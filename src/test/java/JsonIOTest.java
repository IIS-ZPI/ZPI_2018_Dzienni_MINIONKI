import org.junit.Test;

import static org.junit.Assert.*;

public class JsonIOTest {

    @Test
    public void constructorTest() {
        JsonIO jsonIO = new JsonIO("Test json");
        assertEquals("Test json", jsonIO.name);
        assertNotEquals(null, jsonIO.states);
    }
}