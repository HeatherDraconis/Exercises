package org.codewars.kata;

import java.util.Arrays;

public class BirdMountain {
    public static int peakHeight(char[][] mountain) {
        int count = 0;
        char ch;
        while (Arrays.deepToString(mountain).contains("^")) {
            count++;
            ch = count == 1 ? ' ' : (char) (count - 1);
            for (int i = 0; i < mountain.length; i++) {
                for (int j = 0; j < mountain[i].length; j++) {
                    if (mountain[i][j] == '^' && (i == 0 || j == 0
                            || i + 1 == mountain.length || j + 1 == mountain[i].length
                            || mountain[i - 1][j] == ch || mountain[i][j - 1] == ch
                            || mountain[i + 1][j] == ch || mountain[i][j + 1] == ch)) {
                        mountain[i][j] = (char) count;
                    }
                }
            }
        }
        return count;
    }
}
