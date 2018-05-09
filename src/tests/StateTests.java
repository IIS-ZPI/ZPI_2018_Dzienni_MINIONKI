import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StateTests {
    @Test
    public void stateNameTest() {
        State state = new State("Test state");

        char[] helloArray = { 'T', 'e', 's', 't', ' ', 's', 't', 'a', 't', 'e' };
        String expectedName = new String(helloArray);
        assertEquals(expectedName, state.getName());
    }

    @Test
    public void stateTaxTest() {
        State state = new State("Test state");
        //assertEquals(29.0, state);
    }
}