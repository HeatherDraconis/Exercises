package org.codewars.kata;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NoRepeatTest {
    @Test @DisplayName("Sample tests")
    void sampleTests() {
        assertEquals("a", NoRepeat.firstNonRepeatingLetter("a"), "For input \"a\"");
        assertEquals("t", NoRepeat.firstNonRepeatingLetter("streSS"), "For input \"streSS\"");
        assertEquals("-", NoRepeat.firstNonRepeatingLetter("moon-men"), "For input \"moon-men\"");
        assertEquals("", NoRepeat.firstNonRepeatingLetter("moonmoon"), "For input \"moonmoon\"");
    }
}