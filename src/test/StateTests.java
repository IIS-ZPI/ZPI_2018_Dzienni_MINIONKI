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

    @Test
    void stateTaxTest() {
        State state;
        state = new State("Test state", Double.MAX_VALUE);
        assertEquals(Double.MAX_VALUE, state.getTax());

        state = new State("Test state", Double.MIN_VALUE);
        assertEquals(Double.MIN_VALUE, state.getTax());

        state = new State("Test state", Double.NaN);
        assertEquals(Double.NaN, state.getTax());

        state = new State("Test state", Double.NEGATIVE_INFINITY);
        assertEquals(Double.NEGATIVE_INFINITY, state.getTax());

        state = new State("Test state", Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, state.getTax());

        state = new State("Test state", 29d);
        assertEquals(29.0, state.getTax());
        assertEquals(false, ((Double)state.getTax()).isNaN());
        assertEquals(false, ((Double)state.getTax()).isInfinite());

    }
}