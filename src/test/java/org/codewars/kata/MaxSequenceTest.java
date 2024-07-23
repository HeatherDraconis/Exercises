package org.codewars.kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MaxSequenceTest {
    @Test
    public void testEmptyArray() throws Exception {
        assertEquals(0, MaxSequence.sequence(new int[]{}));
    }
    @Test
    public void testExampleArray() throws Exception {
        assertEquals(6, MaxSequence.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    @Test
    public void test1() throws Exception {
        assertEquals(1, MaxSequence.sequence(new int[]{1}));
    }
    @Test
    public void test2() throws Exception {
        assertEquals(1, MaxSequence.sequence(new int[]{1, -1}));
    }
    @Test
    public void test3() throws Exception {
        assertEquals(2, MaxSequence.sequence(new int[]{2, -1, 1}));
    }
    @Test
    public void test4() throws Exception {
        assertEquals(0, MaxSequence.sequence(new int[]{-1}));
    }
    @Test
    public void test5() throws Exception {
        assertEquals(3, MaxSequence.sequence(new int[]{2, -2, -3, 3, -1}));
    }
}