package org.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    public void Test1() {
        assertEquals(1, Factorial.nFactorial(1));
    }
    @Test
    public void Test2() {
        assertEquals(2, Factorial.nFactorial(2));
    }
    @Test
    public void Test3() {
        assertEquals(6, Factorial.nFactorial(3));
    }
    @Test
    public void Test4() {
        assertEquals(24, Factorial.nFactorial(4));
    }
    @Test
    public void Test5() {
        assertEquals(120, Factorial.nFactorial(5));
    }
    @Test
    public void Test6() {
        assertEquals(720, Factorial.nFactorial(6));
    }
}