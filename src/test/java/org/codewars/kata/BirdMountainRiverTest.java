package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdMountainRiverTest {
    @Test
    public void ex() {
        char[][] terrain = {
                "  ^^^^^^             ".toCharArray(),
                "^^^^^^^^       ^^^   ".toCharArray(),
                "^^^^^^^  ^^^         ".toCharArray(),
                "^^^^^^^  ^^^         ".toCharArray(),
                "^^^^^^^  ^^^         ".toCharArray(),
                "---------------------".toCharArray(),
                "^^^^^                ".toCharArray(),
                "   ^^^^^^^^  ^^^^^^^ ".toCharArray(),
                "^^^^^^^^     ^     ^ ".toCharArray(),
                "^^^^^        ^^^^^^^ ".toCharArray()
        };
        assertArrayEquals(new int[]{189,99,19,3}, BirdMountainRiver.dryGround(terrain));
    }
}