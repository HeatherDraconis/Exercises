package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversionTest {

    private Conversion conversion = new Conversion();

    @Test
    public void shouldConvertToRoman() {
        assertEquals("I", conversion.solution(1));
        assertEquals("IV", conversion.solution(4));
        assertEquals("VI", conversion.solution(6));

        assertEquals("MMMCMXCIX", conversion.solution(3999));
    }
}
