package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PureHandTest {
    @Test
    public void sampleTest1() {
        assertEquals("89", PureHand.solution("1113335557779"));
    }
    @Test
    public void sampleTest2() {
        assertEquals("258", PureHand.solution("1223334455678"));
    }
    @Test
    public void sampleTest3() {
        assertEquals("", PureHand.solution("1335556789999"));
    }
}