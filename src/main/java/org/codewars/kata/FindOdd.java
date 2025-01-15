package org.codewars.kata;

public class FindOdd {
    public static int findIt(int[] a) {
        int count = 0;
        for (int i : a) {
            for (int j : a) {
                if (j == i) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                return i;
            }
        }
        throw new RuntimeException("Unreachable");
    }
}
