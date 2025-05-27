package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackOrWhiteKey2Test {
    @Test
    public void ExampleTests() {
        assertEquals("A", BlackOrWhiteKey2.whichNote(1));
        assertEquals("C#", BlackOrWhiteKey2.whichNote(5));
        assertEquals("G#", BlackOrWhiteKey2.whichNote(12));
        assertEquals("D", BlackOrWhiteKey2.whichNote(42));
        assertEquals("C", BlackOrWhiteKey2.whichNote(88));
        assertEquals("A", BlackOrWhiteKey2.whichNote(89));
        assertEquals("C", BlackOrWhiteKey2.whichNote(92));
        assertEquals("G#", BlackOrWhiteKey2.whichNote(100));
        assertEquals("G", BlackOrWhiteKey2.whichNote(111));
        assertEquals("G#", BlackOrWhiteKey2.whichNote(200));
        assertEquals("F", BlackOrWhiteKey2.whichNote(2017));
    }

}