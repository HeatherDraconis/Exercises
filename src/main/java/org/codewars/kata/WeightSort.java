package org.codewars.kata;

import java.util.*;

public class WeightSort {
    public static String orderWeight(String string) {
        string = string.trim();
        if (string.isEmpty()) {
            return "";
        }
        String[] weightsArray = string.split(" +");
        List<String> weightsList = Arrays.asList( weightsArray );
        Comparator<String> byInt = Comparator.comparing(WeightSort::compare).thenComparing(o -> o);
        weightsList.sort(byInt);

        StringJoiner stringJoiner = new StringJoiner(" ");
        for (String str : weightsList) {
            stringJoiner.add(str);
        }
        return stringJoiner.toString();
    }

    private static int compare(String o1) {
        String[] o1Array = o1.split("");
        int i1 = 0;
        for (String num: o1Array) {
            i1 += Integer.parseInt(num);
        }
        return i1;
    }
}
