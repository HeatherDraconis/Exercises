package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WsToIntTest {
    @Test
    public void exampleTest1() {
        assertEquals(" \t\n", WsToInt.whitespaceNumber(1));
    }
    @Test
    public void exampleTest2() {
        assertEquals(" \n", WsToInt.whitespaceNumber(0));
    }
    @Test
    public void exampleTest3() {
        assertEquals("\t\t\n", WsToInt.whitespaceNumber(-1));
    }
    @Test
    public void exampleTest4() {
        assertEquals(" \t \n", WsToInt.whitespaceNumber(2));
    }
    @Test
    public void exampleTest5() {
        assertEquals("\t\t\t\n", WsToInt.whitespaceNumber(-3));
    }

    @Test
    public void myTest1() {
        assertEquals("\t\t    \n", WsToInt.whitespaceNumber(-16));
    }
    @Test
    public void myTest2() {
        assertEquals("\t\t   \t\n", WsToInt.whitespaceNumber(-17));
    }
    @Test
    public void myTest3() {
        assertEquals(" \t\t \t\n", WsToInt.whitespaceNumber(13));
    }
}