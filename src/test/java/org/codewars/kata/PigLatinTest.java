package org.codewars.kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PigLatinTest {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
        assertEquals("", PigLatin.pigIt(""));
        assertEquals(" ", PigLatin.pigIt(" "));
        assertEquals("igPay  atinlay siay oolcay", PigLatin.pigIt("Pig  latin is cool"));
        assertEquals("hisTay siay ymay tringsay !", PigLatin.pigIt("This is my string !"));
//        assertEquals("igPay,atinlay", PigLatin.pigIt("Pig,latin")); Will not work.
    }
}