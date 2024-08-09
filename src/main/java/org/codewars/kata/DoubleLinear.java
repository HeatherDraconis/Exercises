package org.codewars.kata;

import java.util.*;

public class DoubleLinear {
    public static int dblLinear(int n) {
        LinkedList<Integer> sequence = new LinkedList<>();
        sequence.add(1);
        int lastValue = 0;
        for (int i = 0; i <= n; i++) {
            int x = sequence.get(i);
            int y = 2 * x + 1;
            for (int j = lastValue + 1; j <= sequence.size(); j++) {
                if (j == sequence.size()) {
                    sequence.add(y);
                    lastValue = j;
                    break;
                }
                if (y == sequence.get(j)) {
                    break;
                }
                if (y < sequence.get(j)) {
                    sequence.add(j, y);
                    lastValue = j;
                    break;
                }
            }
            if (sequence.size() > n && y > sequence.get(n)) {
                break;
            }
            sequence.add(3 * x + 1);
        }
        return sequence.get(n);
    }
}


