package org.challenges;

import java.util.List;
import java.util.stream.Collectors;

public class LargestNumberGenerator {
    public static int generateNumber(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        list.sort((o1, o2) -> Integer.compare(combine(o2, o1), combine(o1, o2)));
        return Integer.parseInt(list.stream().mapToInt(i -> i).mapToObj(String::valueOf).collect(Collectors.joining()));
    }

    private static int combine(int o1, int o2) {
        return Integer.parseInt(String.valueOf(o1) + o2);
    }
}
