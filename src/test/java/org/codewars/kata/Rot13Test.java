package org.codewars.kata;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

class Rot13Test {
    @Test
    void testRot13() {
        assertEquals("grfg", Rot13.cipher("test"), "Input: \"test\"");
        assertEquals("Grfg", Rot13.cipher("Test"), "Input: \"Test\"");

        assertEquals("Pbqrjnef", Rot13.cipher("Codewars"), "Input: \"Codewars\"");
        assertEquals("Ehol vf pbby!", Rot13.cipher("Ruby is cool!"), "Input: \"Ruby is cool!\"");
        assertEquals("10+2 vf gjryir.", Rot13.cipher("10+2 is twelve."), "Input: \"10+2 is twelve.\"");

        assertEquals("nopqrstuvwxyzabcdefghijklm", Rot13.cipher("abcdefghijklmnopqrstuvwxyz"), "Input: \"abcdefghijklmnopqrstuvwxyz\"");
        assertEquals("NOPQRSTUVWXYZABCDEFGHIJKLM", Rot13.cipher("ABCDEFGHIJKLMNOPQRSTUVWXYZ"), "Input: \"ABCDEFGHIJKLMNOPQRSTUVWXYZ\"");
    }

    private String rot13(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ('A' <= chars[i] && chars[i] <= 'Z') {
                chars[i] = (char) ((chars[i] - 'A' + 13) % 26 + 'A');
            } else if ('a' <= chars[i] && chars[i] <= 'z') {
                chars[i] = (char) ((chars[i] - 'a' + 13) % 26 + 'a');
            }
        }
        return String.valueOf(chars);
    }

    @Test
    void randTests() {
        var randGen = ThreadLocalRandom.current();

        for (int i = 0; i < 10; i++) {
            int randAlphLength = randGen.nextInt(21);

            StringBuilder testWordBuilder = new StringBuilder(randAlphLength);
            for (int j = 0; j < randAlphLength; j++) {
                testWordBuilder.appendCodePoint(randGen.nextBoolean() ? (randGen.nextInt('A','Z'+1) | randGen.nextInt(2) * 32) : randGen.nextInt(32, 128));
            }
            String testWord = testWordBuilder.toString();
            String expected = rot13(testWord), actual = Rot13.cipher(testWord);
            assertEquals(expected, actual, "Input: \"" + testWord + "\"");
        }
    }

}