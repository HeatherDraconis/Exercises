package org.codewars.kata;

import java.util.Arrays;

public class FindOutlier {
    static int find(int[] integers) {
        return integers[0] % 2 == 0 != (integers[1] % 2 == 0) ?
                ((integers[1] % 2 == 0) == (integers[2] % 2 == 0) ? integers[0] : integers[1]) :
                Arrays.stream(integers).filter(n -> (n % 2 == 0) != (integers[0] % 2 == 0)).findFirst().orElse(0);
    }
}
