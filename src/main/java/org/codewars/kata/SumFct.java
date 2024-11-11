package org.codewars.kata;

import java.math.BigInteger;

public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        var sum = BigInteger.ZERO;
        var fib = BigInteger.ONE;
        var fibNext = BigInteger.ONE;
        var i = BigInteger.ZERO;
        while (i.compareTo(n) <= 0) {
            i = i.add(BigInteger.ONE);
            sum = sum.add(fib);
            var fibPrev = fib;
            fib = fibNext;
            fibNext = fib.add(fibPrev);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }
}
