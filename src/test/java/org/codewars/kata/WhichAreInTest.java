package org.codewars.kata;

import static org.junit.Assert.*;
import org.junit.Test;

public class WhichAreInTest {
    @Test
    public void test1() {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }

    @Test
    public void test2() {
        String a[] = new String[]{ "123", "234" };
        String b[] = new String[] { "1234" };
        String r[] = new String[] { "123", "234" };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
    @Test
    public void test3() {
        String a[] = new String[]{ "tarp", "mice", "bull" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { };
        assertArrayEquals(r, WhichAreIn.inArray(a, b));
    }
}