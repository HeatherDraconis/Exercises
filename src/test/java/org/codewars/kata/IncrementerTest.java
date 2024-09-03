package org.codewars.kata;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IncrementerTest {

    @Test
    public void exampleTests() {
        assertEquals("foobar001", Incrementer.incrementString("foobar000"));
        assertEquals("foo1", Incrementer.incrementString("foo"));
        assertEquals("foobar002", Incrementer.incrementString("foobar001"));
        assertEquals("foobar100", Incrementer.incrementString("foobar99"));
        assertEquals("foobar100", Incrementer.incrementString("foobar099"));
        assertEquals("1", Incrementer.incrementString(""));
    }

    @Test
    public void furtherTests() {
        assertEquals("2", Incrementer.incrementString("1"));
        assertEquals("number5then2", Incrementer.incrementString("number5then1"));
        assertEquals(">/@F'tu$n95P|p=S5`4r/\"_EP}Ii>`:07229558076524808598158484099506484", Incrementer.incrementString(">/@F'tu$n95P|p=S5`4r/\"_EP}Ii>`:07229558076524808598158484099506483"));
    }

}