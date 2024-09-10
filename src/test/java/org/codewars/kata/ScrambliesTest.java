package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScrambliesTest {

    @Test
    public void sampleTests() {
        assertTrue(Scramblies.scramble("", ""));
        assertFalse(Scramblies.scramble("a", "aa"));
        assertTrue(Scramblies.scramble("rkqodlw", "world"));
        assertTrue(Scramblies.scramble("cedewaraaossoqqyt", "codewars"));
        assertFalse(Scramblies.scramble("katas", "steak"));
        assertFalse(Scramblies.scramble("scriptjavx", "javascript"));
        assertTrue(Scramblies.scramble("scriptingjava", "javascript"));
        assertTrue(Scramblies.scramble("scriptsjava", "javascripts"));
        assertFalse(Scramblies.scramble("javscripts", "javascript"));
        assertTrue(Scramblies.scramble("aabbcamaomsccdd", "commas"));
        assertTrue(Scramblies.scramble("commas", "commas"));
        assertTrue(Scramblies.scramble("sammoc", "commas"));
    }

    @Test
    public void largeTest() {
        assertTrue(Scramblies.scramble("abcdefghijklmnopqrstuvwxyz".repeat(10_000), "zyxcba".repeat(9_000)));
    }

    @Test
    public void hugeTest() {
        assertTrue(Scramblies.scramble("abcdefghijklmnopqrstuvwxyz".repeat(100_000), "zyxcba".repeat(90_000)));
    }
}