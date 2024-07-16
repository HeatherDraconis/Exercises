package org.challenges;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testSimpleNoFizzBuzz() {
        assertEquals(FizzBuzz.getAnswer2(1), "1");
    }

    @Test
    public void testNoFizzBuzz2() {
        assertEquals(FizzBuzz.getAnswer2(2), "2");
    }

    @Test
    public void testNoFizzBuzz4() {
        assertEquals(FizzBuzz.getAnswer2(4), "4");
    }

    @Test
    public void testLargeNoFizzBuzz() {
        assertEquals(FizzBuzz.getAnswer2(1_000_001), "1000001");
    }

    @Test
    public void testSimpleFizz() {
        assertEquals(FizzBuzz.getAnswer2(5), "Fizz");
    }

    @Test
    public void testFizz10() {
        assertEquals(FizzBuzz.getAnswer2(10), "Fizz");
    }

    @Test
    public void testFizz20() {
        assertEquals(FizzBuzz.getAnswer2(20), "Fizz");
    }

    @Test
    public void testLargeFizz() {
        assertEquals(FizzBuzz.getAnswer2(5_000_000), "Fizz");
    }

    @Test
    public void testSimpleBuzz() {
        assertEquals(FizzBuzz.getAnswer2(3), "Buzz");
    }

    @Test
    public void testBuzz6() {
        assertEquals(FizzBuzz.getAnswer2(6), "Buzz");
    }
    @Test
    public void testBuzz18() {
        assertEquals(FizzBuzz.getAnswer2(18), "Buzz");
    }

    @Test
    public void testLargeBuzz() {
        assertEquals(FizzBuzz.getAnswer2(3_000_003), "Buzz");
    }


    @Test
    public void testSimpleFizzBuzz() {
        assertEquals(FizzBuzz.getAnswer2(15), "FizzBuzz");
    }

    @Test
    public void testFizzBuzz30() {
        assertEquals(FizzBuzz.getAnswer2(30), "FizzBuzz");
    }

    @Test
    public void testFizzBuzz45() {
        assertEquals(FizzBuzz.getAnswer2(45), "FizzBuzz");
    }

    @Test
    public void testLargeFizzBuzz() {
        assertEquals(FizzBuzz.getAnswer2(1_500_000), "FizzBuzz");
    }

    @Test
    public void testNegativeFizz() {
        assertEquals(FizzBuzz.getAnswer2(-5), "Fizz");
    }

    @Test
    public void testNegativeBuzz() {
        assertEquals(FizzBuzz.getAnswer2(-3), "Buzz");
    }

    @Test
    public void testNegativeFizzBuzz() {
        assertEquals(FizzBuzz.getAnswer2(-15), "FizzBuzz");
    }

    @Test
    public void testNaught() {
        assertEquals(FizzBuzz.getAnswer2(0), "FizzBuzz");
    }
}
