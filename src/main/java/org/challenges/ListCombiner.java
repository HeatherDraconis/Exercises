package org.challenges;

import java.util.*;
import java.util.stream.Collectors;

public class ListCombiner {
    public static String combine(List<String> list) {
        boolean hasFred = list.contains("fred");
        return list.stream().map(s -> getString(s, hasFred)).sorted(ListCombiner::getStringComparator).collect(Collectors.joining(","));
    }

    private static String getString(String s, boolean hasFred) {
        if (hasFred) {
            s = s.replace("e", "a");
        }
        return s;
    }

    private static int getStringComparator(String o1, String o2) {
            if (o1.equals("frad")) {
                if (o2.equals("frad")) {
                    return 0;
                }
                return -1;
            }
            if (o2.equals("frad")) {
                return 1;
            }
            return o1.compareTo(o2);
    }
}
