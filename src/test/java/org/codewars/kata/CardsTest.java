package org.codewars.kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CardsTest {
    @Test
    void sampleTests() {
        assertEquals(8, Cards.cardGame(10));
        assertEquals(3, Cards.cardGame(4));
        assertEquals(2, Cards.cardGame(5));
        assertEquals(9, Cards.cardGame(12));
    }
    @Test
    void bigTest1() {
        assertEquals(8, Cards.cardGame(10));
        assertEquals(4, Cards.cardGame(9));
    }
    @Test
    void bigTest2() {
        assertEquals(93, Cards.cardGame(100));
        assertEquals(7, Cards.cardGame(99));
    }
    @Test
    void bigTest3() {
        assertEquals(987, Cards.cardGame(1000));
        assertEquals(13, Cards.cardGame(999));
    }
    @Test
    void bigTest4() {
        assertEquals(9983, Cards.cardGame(10000));
        assertEquals(17, Cards.cardGame(9999));
    }
    @Test
    void bigTest5() {
        assertEquals(99980, Cards.cardGame(100000));
        assertEquals(20, Cards.cardGame(99999));
    }
    @Test
    void bigTest6() {
        assertEquals(999976, Cards.cardGame(1000000));
        assertEquals(24, Cards.cardGame(999999));
    }
    @Test
    void bigTest7() {
        assertEquals(9999970, Cards.cardGame(10000000));
        assertEquals(30, Cards.cardGame(9999999));
    }
    @Test
    void bigTest8() {
        assertEquals(99999963, Cards.cardGame(100000000));
        assertEquals(37, Cards.cardGame(99999999));
    }
    @Test
    void bigTest9() {
        assertEquals(999999960, Cards.cardGame(1000000000));
        assertEquals(40, Cards.cardGame(999999999));
    }
}