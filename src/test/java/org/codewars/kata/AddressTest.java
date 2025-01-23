package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {
    @Test
    public void sampleTest() {
        assertEquals("128.114.17.104", Address.longToIP(2154959208L));
        assertEquals("0.0.0.0", Address.longToIP(0));
        assertEquals("128.32.10.1", Address.longToIP(2149583361L));
    }
}