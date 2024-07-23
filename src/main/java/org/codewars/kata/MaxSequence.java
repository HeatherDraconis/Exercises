package org.codewars.kata;

import java.util.Arrays;

public class MaxSequence {
    public static int sequence(int[] arr) {
        int greatestSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <= arr.length; j++) {
                greatestSum = Math.max(greatestSum, sumOfSubarray(arr, i, j));
            }
        }
        return greatestSum;
    }

    private static int sumOfSubarray(int[] arr, int start, int end) {
        int newGreatestSum = 0;
        for (int k = start; k < end; k++) {
            newGreatestSum += arr[k];
        }
        return newGreatestSum;
    }
}
