package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Javatlacati on 01/03/2017.
 */
public class ShortestWordTest {
    @Test
    public void findShort() {
        assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, ShortestWord.findShort("Let's travel abroad shall we"));
        assertEquals(0, ShortestWord.findShort(""));
        assertEquals(4, ShortestWord.findShort("Fred"));
    }

}