package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() {
        assertEquals(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), "HEY JUDE");
    }
}