package org.codewars.kata;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TopWordsTest {

    @Test
    void sampleTest1() {
        assertEquals(List.of("e", "d", "a"), TopWords.top3("a a a  b  c c  d d d d  e e e e e"));
    }
    @Test
    void sampleTest2() {
        assertEquals(List.of("e", "ddd", "aa"), TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
    }
    @Test
    void sampleTest3() {
        assertEquals(List.of("won't", "wont"), TopWords.top3("  //wont won't won't "));
    }
    @Test
    void sampleTest4() {
        assertEquals(List.of("e"), TopWords.top3("  , e   .. "));
    }
    @Test
    void sampleTest5() {
        assertEquals(List.of(), TopWords.top3("  ...  "));
    }
    @Test
    void sampleTest6() {
        assertEquals(List.of(), TopWords.top3("  '  "));
    }
    @Test
    void sampleTest7() {
        assertEquals(List.of(), TopWords.top3("  '''  "));
    }
    @Test
    void sampleTest8() {
        assertTrue(List.of("'a", "a'a'", "'a'").equals(TopWords.top3("'a 'A 'a' a'A' a'a'!")) || List.of("a'a'", "'a", "'a'").equals(TopWords.top3("'a 'A 'a' a'A' a'a'!")));
    }
    @Test
    void sampleTest9() {
        assertEquals(List.of("a", "of", "on"), TopWords.top3("""
                             In a village of La Mancha, the name of which I have no desire to call to
                             mind, there lived not long since one of those gentlemen that keep a lance
                             in the lance-rack, an old buckler, a lean hack, and a greyhound for
                             coursing. An olla of rather more beef than mutton, a salad on most
                             nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra
                             on Sundays, made away with three-quarters of his income."""
        ));
    }
    @Test
    void sampleTest10() {
        assertEquals(List.of(), TopWords.top3("'"));
    }


}