package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {
    @Test
    public void test() {
        assertEquals(23, new Multiples().findSum(10));
    }
}