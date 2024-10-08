package org.codewars.kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class DoubleLinearTest {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests dblLinear");
//        testing(DoubleLinear.dblLinear(10), 22);
        testing(DoubleLinear.dblLinear(20000), 377625);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests dblLinear");
//        testing(DoubleLinear.dblLinear(10), 22);
        testing(DoubleLinear.dblLinear(20), 57);
        testing(DoubleLinear.dblLinear(30), 91);
        testing(DoubleLinear.dblLinear(50), 175);

    }
}
