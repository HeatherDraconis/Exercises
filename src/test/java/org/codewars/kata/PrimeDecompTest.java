package org.codewars.kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeDecompTest {
    @Test
    public void testPrimeDecompOne() {
        assertEquals("(2**2)(3**3)(5)(7)(11**2)(17)", PrimeDecomp.factors(7775460));
    }

    @Test
    public void testPrimeDecomptwo() {
        assertEquals("(2)", PrimeDecomp.factors(2));
    }

    @Test
    public void testPrimeDecompthree() {
        assertEquals("(2**2)", PrimeDecomp.factors(4));
    }
}