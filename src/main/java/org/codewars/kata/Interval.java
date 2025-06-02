package org.codewars.kata;

import java.util.ArrayList;
import java.util.List;

public class Interval {
    public static int sumIntervals(int[][] intervals) {
        int sum = 0;
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (!index.contains(i)) {
                int lowerBound = intervals[i][0];
                int upperBound = intervals[i][1];
                boolean change;
                do {
                    change = false;
                    for (int j = i + 1; j < intervals.length; j++) {
                        if (!index.contains(j)) {
                            if (intervals[j][0] >= lowerBound
                                    && intervals[j][1] <= upperBound) {
                                index.add(j);
                            } else if (intervals[j][0] < lowerBound
                                    && intervals[j][1] > upperBound) {
                                lowerBound = intervals[j][0];
                                upperBound = intervals[j][1];
                                index.add(j);
                                change = true;
                            } else if (intervals[j][1] >= lowerBound
                                    && intervals[j][1] <= upperBound
                                    && intervals[j][0] < lowerBound) {
                                lowerBound = intervals[j][0];
                                index.add(j);
                                change = true;
                            } else if (intervals[j][0] >= lowerBound
                                    && intervals[j][0] <= upperBound
                                    && intervals[j][1] > upperBound) {
                                upperBound = intervals[j][1];
                                index.add(j);
                                change = true;
                            }
                        }
                    }
                } while (change);
                sum += upperBound - lowerBound;
            }
        }
        return sum;
    }
}
