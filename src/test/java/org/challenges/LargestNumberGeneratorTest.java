package org.challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestNumberGeneratorTest {
    int runGenerate( Integer... inputs ) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll( list, inputs );
        return LargestNumberGenerator.generateNumber( list );
    }

    @Test
    public void firstTestForFree() {
        assertEquals( 7, runGenerate( 7 ) );
    }

    @Test
    public void oneSingleDigit()
    {
        assertEquals( 1, runGenerate( 1 ) );
        assertEquals( 5, runGenerate( 5 ) );
        assertEquals( 9, runGenerate( 9 ) );
    }

    @Test
    public void emptyInput()
    {
        assertEquals( 0, runGenerate() );
    }

    @Test
    public void oneDoubleDigit()
    {
        assertEquals( 35, runGenerate( 35 ) );
        assertEquals( 11, runGenerate( 11 ) );
        assertEquals( 98, runGenerate( 98 ) );
    }

    @Test
    public void twoSingleDigits()
    {
        assertEquals( 53, runGenerate( 5, 3 ) );
        assertEquals( 53, runGenerate( 3, 5 ) );
        assertEquals( 99, runGenerate( 9, 9 ) );
    }

    @Test
    public void multipleZeros()
    {
        assertEquals( 0, runGenerate( 0, 0 ) );
    }

    @Test
    public void doubleAndSingleDigit()
    {
        assertEquals( 453, runGenerate( 45, 3 ) );
        assertEquals( 315, runGenerate( 15, 3 ) );
        assertEquals( 353, runGenerate( 35, 3 ) );
        assertEquals( 332, runGenerate( 32, 3 ) );
    }

    @Test
    public void multipleSingleDigits()
    {
        assertEquals( 1111, runGenerate( 1, 1, 1, 1 ) );
        assertEquals( 4321, runGenerate( 1, 2, 3, 4 ) );
        assertEquals( 4321, runGenerate( 1, 2, 4, 3 ) );
        assertEquals( 4321, runGenerate( 4, 2, 3, 1 ) );
        assertEquals( 9911, runGenerate( 1, 9, 9, 1 ) );
        assertEquals( 964421, runGenerate( 1, 4, 4, 2, 9, 6 ) );
    }

    @Test
    public void multipleDoubleAndSingleDigits()
    {
        assertEquals( 95021, runGenerate( 50, 2, 1, 9 ) );
        assertEquals( 56550, runGenerate( 5, 50, 56 ) );
    }

    @Test
    public void multipleDigits()
    {
        assertEquals( 950522221, runGenerate( 505, 2222, 1, 9 ) );
        assertEquals( 555351, runGenerate( 53, 51, 55 ) );
        assertEquals( 505503501, runGenerate( 503, 501, 505 ) );
        assertEquals( 50550503, runGenerate( 503, 505, 50 ) );
    }

    @Test
    public void zeroAsAnInput()
    {
        assertEquals( 0, runGenerate( 0 ) );
        assertEquals( 30, runGenerate( 3, 0 ) );
        assertEquals( 30, runGenerate( 0, 3 ) );
    }
}