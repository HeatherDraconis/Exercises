package org.codewars.kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindNextTest {
    @Test
    public void basicTest1() {
        assertEquals(-1, FindNext.nextBiggerNumber(0));
        assertEquals(-1, FindNext.nextBiggerNumber(1));
    }
    @Test
    public void basicTest2() {
        assertEquals(21, FindNext.nextBiggerNumber(12));
        assertEquals(42, FindNext.nextBiggerNumber(24));
    }
    @Test
    public void basicTest3() {
        assertEquals(531, FindNext.nextBiggerNumber(513));
        assertEquals(441, FindNext.nextBiggerNumber(414));
        assertEquals(414, FindNext.nextBiggerNumber(144));
        assertEquals(312, FindNext.nextBiggerNumber(231));
        assertEquals(182, FindNext.nextBiggerNumber(128));
        assertEquals(218, FindNext.nextBiggerNumber(182));
        assertEquals(281, FindNext.nextBiggerNumber(218));
    }
    @Test
    public void basicTest4() {
        assertEquals(3182, FindNext.nextBiggerNumber(3128));
        assertEquals(3218, FindNext.nextBiggerNumber(3182));
        assertEquals(3281, FindNext.nextBiggerNumber(3218));
    }
    @Test
    public void basicTest5() {
        assertEquals(19009, FindNext.nextBiggerNumber(10990));
    }

    @Test
    public void bigTest() {
        assertEquals(9002836512L, FindNext.nextBiggerNumber(9002836251L));
//        assertEquals(9102345678L, Kata.nextBiggerNumber(9087654321L));
//        assertEquals(14826487825L, Kata.nextBiggerNumber(14826487582L));
    }
}