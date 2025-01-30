package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessTest {
    @Test
    public void sampleTests() {
        assertEquals(2, Chess.knight("a1", "c1"), "Test for (a1, c1)");
        assertEquals(3, Chess.knight("a1", "f1"), "Test for (a1, f1)");
        assertEquals(3, Chess.knight("a1", "f3"), "Test for (a1, f3)");
        assertEquals(4, Chess.knight("a1", "f4"), "Test for (a1, f4)");
        assertEquals(5, Chess.knight("a1", "f7"), "Test for (a1, f7)");

        assertEquals(3, Chess.knight("g8", "d6"));
        assertEquals(5, Chess.knight("a7", "h1"));
        assertEquals(2, Chess.knight("c6", "a6"));
        assertEquals(3, Chess.knight("d6", "e2"));
        assertEquals(3, Chess.knight("g2", "c1"));

        assertEquals(3, Chess.knight("c7", "c4"));
        assertEquals(4, Chess.knight("h3", "b7"));
        assertEquals(3, Chess.knight("f2", "b5"));
        assertEquals(3, Chess.knight("g1", "g4"));
        assertEquals(3, Chess.knight("a7", "a4"));

        assertEquals(4, Chess.knight("f1", "h3"));
        assertEquals(4, Chess.knight("e5", "g3"));
        assertEquals(4, Chess.knight("a3", "c5"));
        assertEquals(4, Chess.knight("h7", "f5"));
        assertEquals(4, Chess.knight("c3", "a1"));

        assertEquals(2, Chess.knight("e7", "h8"));
        assertEquals(2, Chess.knight("c7", "d8"));

        assertEquals(4, Chess.knight("b7", "a8"));
        assertEquals(4, Chess.knight("g2", "h1"));

        assertEquals(2, Chess.knight("h5", "g4"));

        assertEquals(2, Chess.knight("a4", "b3"));
        assertEquals(2, Chess.knight("h3", "g4"));
        assertEquals(2, Chess.knight("a5", "b4"));
        assertEquals(2, Chess.knight("a7", "b6"));

    }
    @Test
    public void furtherTests() {
        assertEquals(3, Chess.knight("a4", "a1"));
        assertEquals(4, Chess.knight("b6", "a1"));

    }
}