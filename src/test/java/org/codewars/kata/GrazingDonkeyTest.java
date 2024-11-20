package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrazingDonkeyTest {
    @Test
    public void testEdgeNoEat() {
        int rope = GrazingDonkey.getRopeLength(200, 0.0);
        assertEquals(0, rope);
    }

    @Test
    public void testEdgeEatAll() {
        int rope = GrazingDonkey.getRopeLength(200, 1.0);
        assertEquals(200, rope);
    }

    @Test
    public void testEdgeNoGrass() {
        int rope = GrazingDonkey.getRopeLength(0, 0.0);
        assertEquals(0, rope);

        rope = GrazingDonkey.getRopeLength(0, 0.5);
        assertEquals(0, rope);

        rope = GrazingDonkey.getRopeLength(0, 1);
        assertEquals(0, rope);
    }

    @Test
    public void sampleTests() {

        int rope = GrazingDonkey.getRopeLength(10, 0.5);
        assertEquals(5, rope);

        rope = GrazingDonkey.getRopeLength(200, 0.5);
        assertEquals(115, rope);
    }

    @Test
    public void extraTests() {
        int rope = GrazingDonkey.getRopeLength(100, 0);
        assertEquals(0, rope);

        rope = GrazingDonkey.getRopeLength(100, 0.1);
        assertEquals(23, rope);

        rope = GrazingDonkey.getRopeLength(100, 0.2);
        assertEquals(34, rope);

        rope = GrazingDonkey.getRopeLength(100, 0.3);
        assertEquals(42, rope);

        rope = GrazingDonkey.getRopeLength(100, 0.4);
        assertEquals(50, rope);

        rope = GrazingDonkey.getRopeLength(100, 0.5);
        assertEquals(57, rope);

        rope = GrazingDonkey.getRopeLength(100, 0.6);
        assertEquals(64, rope);

        rope = GrazingDonkey.getRopeLength(100, 0.7);
        assertEquals(72, rope);

        rope = GrazingDonkey.getRopeLength(100, 0.8);
        assertEquals(79, rope);

        rope = GrazingDonkey.getRopeLength(100, 0.9);
        assertEquals(87, rope);

        rope = GrazingDonkey.getRopeLength(100, 1);
        assertEquals(100, rope);
    }

    @Test
    public void BigTest10() {
        int rope = GrazingDonkey.getRopeLength(10, 0.5);
        assertEquals(5, rope);
    }

    @Test
    public void BigTest100() {
        int rope = GrazingDonkey.getRopeLength(100, 0.5);
        assertEquals(57, rope);
    }

    @Test
    public void BigTest1000() {
        int rope = GrazingDonkey.getRopeLength(1000, 0.5);
        assertEquals(579, rope);
    }

    @Test
    public void BigTest10_000() {
        int rope = GrazingDonkey.getRopeLength(10_000, 0.5);
        assertEquals(5793, rope);
    }

    @Test
    public void BigTests() {
        int rope = GrazingDonkey.getRopeLength(3, 0.5);
        assertEquals(1, rope);

        rope = GrazingDonkey.getRopeLength(31, 0.5);
        assertEquals(17, rope);

        rope = GrazingDonkey.getRopeLength(314, 0.5);
        assertEquals(181, rope);

        rope = GrazingDonkey.getRopeLength(3141, 0.5);
        assertEquals(1819, rope);

        rope = GrazingDonkey.getRopeLength(31415, 0.5);
        assertEquals(18200, rope);

        rope = GrazingDonkey.getRopeLength(314159, 0.5);
        assertEquals(182012, rope);

        rope = GrazingDonkey.getRopeLength(3141592, 0.5);
        assertEquals(1820126, rope);

        rope = GrazingDonkey.getRopeLength(31415926, 0.5);
        assertEquals(18201263, rope);

        rope = GrazingDonkey.getRopeLength(314159265, 0.5);
        assertEquals(182012642, rope);
    }

}