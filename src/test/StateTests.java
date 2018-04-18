import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StateTests {
    @Test
    void stateNameTest() {
        State state = new State("Test state", 0.0);

        char[] helloArray = { 'T', 'e', 's', 't', ' ', 's', 't', 'a', 't', 'e' };
        String expectedName = new String(helloArray);
        assertEquals(expectedName, state.getName());
    }


}