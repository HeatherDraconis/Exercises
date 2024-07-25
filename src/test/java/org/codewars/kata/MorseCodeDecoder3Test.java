package org.codewars.kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MorseCodeDecoder3Test {
    @Test
    public void testSomething1() {
        assertEquals("E", MorseCodeDecoder3.decodeMorse(MorseCodeDecoder3.decodeBitsAdvanced("00011000")));
    }
    @Test
    public void testSomething2() {
        assertEquals("H", MorseCodeDecoder3.decodeMorse(MorseCodeDecoder3.decodeBitsAdvanced("00011001100110011000")));
    }
    @Test
    public void testSomething3() {
        assertEquals("H", MorseCodeDecoder3.decodeMorse(MorseCodeDecoder3.decodeBitsAdvanced("0000000011011010011100000")));
    }
    @Test
    public void testSomething100() {
        assertEquals("HEY JUDE", MorseCodeDecoder3.decodeMorse(MorseCodeDecoder3.decodeBitsAdvanced("0000000011011010011100000110000001111110100111110011111100000000000111011111111011111011111000000101100011111100000111110011101100000100000")));
    }
}
