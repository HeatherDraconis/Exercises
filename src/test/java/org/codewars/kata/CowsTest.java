package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CowsTest {
    private static char[][] show(final char[][] field) {
        for (int i = 0; i < field.length; i++) {
            System.out.println(new String(field[i]));
        }
        return field;
    }

    @Test
    public void ex1() {
        final char[][] field = new char[][] {
                "cow.cow.cow.cow.cow".toCharArray(),
                "cow.cow.cow.cow.cow".toCharArray(),
                "cow.woc.cow.cow.cow".toCharArray(),
                "cow.cow.cow.cow.cow".toCharArray(),
        };
        assertArrayEquals(new int[]{6,2}, Cows.findWrongWayCow(show(field)));
    }

    @Test
    public void ex2() {
        final char[][] field = new char[][] {
                "c..........".toCharArray(),
                "o...c......".toCharArray(),
                "w...o.c....".toCharArray(),
                "....w.o....".toCharArray(),
                "......w.cow".toCharArray()
        };
        assertArrayEquals(new int[]{8,4}, Cows.findWrongWayCow(show(field)));
    }

}