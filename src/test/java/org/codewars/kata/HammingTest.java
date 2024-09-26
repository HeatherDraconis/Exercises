package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HammingTest {

    @Test
    public void Test1() {
        assertEquals(1, Hamming.hamming(1));
        assertEquals(2, Hamming.hamming(2));
        assertEquals(3, Hamming.hamming(3));
        assertEquals(4, Hamming.hamming(4));
        assertEquals(5, Hamming.hamming(5));
        assertEquals(6, Hamming.hamming(6));
        assertEquals(8, Hamming.hamming(7));
        assertEquals(9, Hamming.hamming(8));
        assertEquals(10, Hamming.hamming(9));
        assertEquals(12, Hamming.hamming(10));
        assertEquals(15, Hamming.hamming(11));
        assertEquals(16, Hamming.hamming(12));
        assertEquals(18, Hamming.hamming(13));
        assertEquals(20, Hamming.hamming(14));
        assertEquals(24, Hamming.hamming(15));
        assertEquals(25, Hamming.hamming(16));
        assertEquals(27, Hamming.hamming(17));
        assertEquals(30, Hamming.hamming(18));
        assertEquals(32, Hamming.hamming(19));
    }
    @Test
    public void TestLong1() {
        //9 ms
        assertEquals(5, Hamming.hamming(5));
    }
    @Test
    public void TestLong2() {
        //19 ms
        assertEquals(243, Hamming.hamming(50));
    }
    @Test
    public void TestLong3() {
        //9 sec 369 ms
        assertEquals(937500, Hamming.hamming(500));
    }
    @Test
    public void TestLong4() {
        //time out at 2 min
        assertEquals(50837316566580L, Hamming.hamming(5_000));
    }

    @Test
    public void Test512() {
        //time out at 2 min
        assertEquals(1049760, Hamming.hamming(512));
    }

    @Test
    public void Test729() {
        //time out at 2 min
        assertEquals(7464960, Hamming.hamming(729));
    }
}