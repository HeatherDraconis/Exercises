package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDividedTest {
    @Test
    public void testOne() {
        int[] lst = new int[] {12, 15};
        assertEquals("(2 12)(3 27)(5 15)", SumOfDivided.sumOfDivided(lst));
    }
}