package org.challenges;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListCombinerTest {
    @Test
    public void emptyTest(){
        assertEquals("" , ListCombiner.combine(List.of()));
    }

    @Test
    public void smallTest1(){
        assertEquals("a" , ListCombiner.combine(List.of("a")));
    }

    @Test
    public void smallTest2(){
        assertEquals("b,z" , ListCombiner.combine(List.of("z", "b")));
    }

    @Test
    public void smallTest3(){
        assertEquals("a,c,z" , ListCombiner.combine(List.of("a", "z", "c")));
    }
    @Test
    public void fredTest(){
        assertEquals("frad" , ListCombiner.combine(List.of("fred")));
    }
    @Test
    public void bigFredTest(){
        assertEquals("frad,a,a,c,d,z" , ListCombiner.combine(List.of("a", "z", "c", "d", "e", "fred")));
    }
    @Test
    public void multipleFredsTest(){
        assertEquals("frad,frad,a,a,c,d,z" , ListCombiner.combine(List.of("a", "z", "fred", "c", "fred", "d", "e")));
    }
}