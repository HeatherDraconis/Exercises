package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MorseCodeDecoder2Test {
    @Test
    public void testExampleFromDescription() throws Exception {
        assertEquals(MorseCodeDecoder2.decodeMorse(MorseCodeDecoder2.decodeBits("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011")), "HEY JUDE");
    }
}