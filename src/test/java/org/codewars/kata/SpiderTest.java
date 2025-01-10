package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiderTest {
    @Test
    public void example() {
        assertEquals("H3-H2-H1-A0-E1-E2", Spider.spiderToFly("H3", "E2"));
    }

    @Test
    public void misc() {
        assertEquals("A4-A3-A2-A1-B1", Spider.spiderToFly("A4", "B1"));
        assertEquals("A4-A3-A2-A1-B1-C1", Spider.spiderToFly("A4", "C1"));
        assertEquals("A4-A3-A2-A1-A0-D1", Spider.spiderToFly("A4", "D1"));
        assertEquals("A4-A3-A2-B2", Spider.spiderToFly("A4", "B2"));
        assertEquals("A4-A3-A2-B2-C2", Spider.spiderToFly("A4", "C2"));
        assertEquals("A4-A3-A2-A1-A0-D1-D2", Spider.spiderToFly("A4", "D2"));
    }

    @Test
    public void same() {
        assertEquals("C2", Spider.spiderToFly("C2", "C2"));
        assertEquals("A0", Spider.spiderToFly("A0", "A0"));
        assertEquals("F3", Spider.spiderToFly("F3", "F3"));
    }

    @Test
    public void examples() {
        assertEquals("H3-H2-H1-G1", Spider.spiderToFly("H3", "G1"));
        assertEquals("C1-B1-B2-B3-B4", Spider.spiderToFly("C1", "B4"));
    }

}