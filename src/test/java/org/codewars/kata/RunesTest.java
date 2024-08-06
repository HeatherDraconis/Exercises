package org.codewars.kata;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RunesTest {

    @Test void testSample1() {
        assertEquals(2, Runes.solveExpression("1+1=?"), "expression = \"1+1=?\"");
    }
    @Test void testSample2() {
        assertEquals( 6, Runes.solveExpression("123*45?=5?088"), "expression = \"123*45?=5?088\"");
    }
    @Test void testSample3() {
        assertEquals( 0, Runes.solveExpression("-5?*-1=5?"), "expression = \"-5?*-1=5?\"");
    }
    @Test void testSample4() {
        assertEquals(-1, Runes.solveExpression("19--45=5?"), "expression = \"19--45=5?\"");
    }
    @Test void testSample5() {
        assertEquals( 5, Runes.solveExpression("??*??=302?"), "expression = \"??*??=302?\"");
    }
    @Test void testSample6() {
        assertEquals( 2, Runes.solveExpression("?*11=??"), "expression = \"?*11=??\"");
    }
    @Test void testSample7() {
        assertEquals( 2, Runes.solveExpression("??*1=??"), "expression = \"??*1=??\"");
    }
    @Test void testSample8() {
        assertEquals(-1, Runes.solveExpression("??+??=??"), "expression = \"??+??=??\"");
    }
    @Test void testSample9() {
        assertEquals( 6, Runes.solveExpression("-7715?5--484?00=-28?9?5"), "expression = \"-7715?5--484?00=-28?9?5\"");
    }
    @Test void testSample10() {
        assertEquals(0, Runes.solveExpression("-8?72--3?7?=-5??2"), "expression = \"-8?72--3?7?=-5??2\"");
    }
    @Test void testSample11() {
        assertEquals(8, Runes.solveExpression("-?56373--9216=-?47157"), "expression = \"-?56373--9216=-?47157\"");
    }
    @Test void testSample12() {
        assertEquals(1, Runes.solveExpression("5-4=?"), "expression = \"5-4=?\"");
    }
}