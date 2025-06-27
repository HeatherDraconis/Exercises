package org.challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberCheckerTest {
    @Test
    public void testSmallPrimes(){
        assertTrue(PrimeNumberChecker.isPrime(2));
        assertTrue(PrimeNumberChecker.isPrime(3));
        assertTrue(PrimeNumberChecker.isPrime(5));
        assertTrue(PrimeNumberChecker.isPrime(7));
    }

    @Test
    public void testSmallNotPrimes(){
        assertFalse(PrimeNumberChecker.isPrime(4));
        assertFalse(PrimeNumberChecker.isPrime(6));
        assertFalse(PrimeNumberChecker.isPrime(8));
        assertFalse(PrimeNumberChecker.isPrime(9));
    }
    @Test
    public void testOne(){
        assertFalse(PrimeNumberChecker.isPrime(1));
    }
    @Test
    public void testZero(){
        assertFalse(PrimeNumberChecker.isPrime(0));
    }
    @Test
    public void testNegative(){
        assertFalse(PrimeNumberChecker.isPrime(-1));
        assertFalse(PrimeNumberChecker.isPrime(-2));
        assertFalse(PrimeNumberChecker.isPrime(-3));
        assertFalse(PrimeNumberChecker.isPrime(-4));
    }
    @Test
    public void testBigPrime() {
        assertTrue(PrimeNumberChecker.isPrime(2_147_483_647));
    }
    @Test
    public void testVeryBigPrime() {
        assertTrue(PrimeNumberChecker.isPrime(9_223_372_036_854_775_783L));
    }
}