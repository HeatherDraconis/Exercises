package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathEvaluatorTest {
    @Test public void testAddition() {
        assertEquals(2d, new MathEvaluator().calculate("1+1"), 0.01);
    }

    @Test public void testSubtraction() {
        assertEquals(0d, new MathEvaluator().calculate("1 - 1"), 0.01);
    }

    @Test public void testMultiplication() {
        assertEquals(1d, new MathEvaluator().calculate("1* 1"), 0.01);
    }

    @Test public void testDivision() {
        assertEquals(1d, new MathEvaluator().calculate("1 /1"), 0.01);
    }

    @Test public void testNegative() {
        assertEquals(-123d, new MathEvaluator().calculate("-123"), 0.01);
    }

    @Test public void testLiteral() {
        assertEquals(123d, new MathEvaluator().calculate("123"), 0.01);
    }

    @Test public void testExpression() {
        assertEquals(21.25, new MathEvaluator().calculate("2 /2+3 * 4.75- -6"), 0.01);
    }

    @Test public void testSimple() {
        assertEquals(1476d, new MathEvaluator().calculate("12* 123"), 0.01);
    }

    @Test
    public void testComplex() {
        assertEquals(7.732, new MathEvaluator().calculate("2 / (2 + 3) * 4.33 - -6"), 0.01);
    }

    @Test
    public void testFinal() {
        assertEquals(0, new MathEvaluator().calculate("-0"), 0.01);
        assertEquals(0, new MathEvaluator().calculate("--0"), 0.01);
        assertEquals(-3, new MathEvaluator().calculate("-5+2"), 0.01);
        assertEquals(0, new MathEvaluator().calculate("1 - 1"), 0.01);
        assertEquals(-4, new MathEvaluator().calculate("-4"), 0.01);
        assertEquals(4, new MathEvaluator().calculate("--4.0"), 0.01);
        assertEquals(3, new MathEvaluator().calculate("-1 + -(-4.0)"), 0.01);
        assertEquals(2, new MathEvaluator().calculate("1--1+-1--1+1-1"), 0.01);
        assertEquals(-11, new MathEvaluator().calculate("-11"), 0.01);
        assertEquals(-2076.7428571428572, new MathEvaluator().calculate("-48.49285714285714-2028.25"), 0.01);
    }

    @Test
    public void testFinal2() {
        assertEquals(1, new MathEvaluator().calculate("(123.45*(678.90 / (-2.5+ 11.5)-(((80 -(19))) *33.25)) / 20) - (123.45*(678.90 / (-2.5+ 11.5)-(((80 -(19))) *33.25)) / 20) + (13 - 2)/ -(-11)"), 0.01);
    }
}