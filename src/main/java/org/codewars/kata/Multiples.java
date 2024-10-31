package org.codewars.kata;

import java.util.stream.IntStream;

public class Multiples {
    public int findSum(int number) {
        return IntStream.range(0, number).filter(i -> i % 3 == 0 || i % 5 == 0).sum();
    }
}
