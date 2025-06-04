package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    @Test
    void test1() {
        assertEquals("579", Sum.sumStrings("123", "456"));
    }
    @Test
    void test2() {
        assertEquals("861829124166740122309898981798", Sum.sumStrings("0861828666113635356831260636014", "458053104765478638345784"));
    }
    @Test
    void test3() {
        assertEquals("8670", Sum.sumStrings("00103", "08567"));
    }
}