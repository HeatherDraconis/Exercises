package org.codewars.kata;

import java.util.Arrays;
import java.util.Comparator;

public class Interval {
    public static int sumIntervals(int[][] intervals) {
        if (Arrays.deepEquals(intervals, new int[0][0])) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[0]));
        int upperBound = intervals[0][1];
        int sum = intervals[0][1] - intervals[0][0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][1] > upperBound) {
                sum += intervals[i][1] - Math.max(intervals[i][0], upperBound);
                upperBound = Math.max(intervals[i][1], upperBound);
            }
        }
        return sum;
    }
}
