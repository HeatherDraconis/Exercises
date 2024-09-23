package org.codewars.kata;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SnailTest {
    @Test
    public void SnailTestEmpty() {
        int[][] array
                = {{}};
        int[] result = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        assertArrayEquals(result, Snail.snail(array));
    }
    @Test
    public void SnailTest1() {
        int[][] array
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[] result = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        assertArrayEquals(result, Snail.snail(array));
    }
    @Test
    public void SnailTest2() {
        int[][] array
                = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int[] result = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10};
        assertArrayEquals(result, Snail.snail(array));
    }
}