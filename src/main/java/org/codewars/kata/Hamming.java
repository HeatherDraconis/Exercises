package org.codewars.kata;

import java.util.SortedSet;
import java.util.TreeSet;

public class Hamming {
    public static long hamming(int n) {
        int root = (int) Math.cbrt(n);
        SortedSet<Long> numbers = new TreeSet<>();
        for (int k = 0; k < root * 2; k++) {
            for (int j = 0; j < root * 3; j++) {
                for (int i = 0; i < root * 5; i++) {
                    numbers.add((long) (Math.pow(2, i) * Math.pow(3, j) * Math.pow(5, k)));
                }
            }
        }
        return (long) numbers.toArray()[n- 1];
    }
}
