package org.codewars.kata;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class PrimeDecomp {
    public static String factors(int n) {
        if (n <= 1) {
            return "";
        }

        SortedMap<Integer, Integer> factorsMap = new TreeMap<>();
        int i = 2;
        do {
            if (n%i == 0) {
                if (factorsMap.putIfAbsent(i, 1) != null) {
                    factorsMap.put(i, factorsMap.get(i) + 1);
                }
                n /= i;
                i--;
            }
            i++;
        } while (i <= n);

        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry: ((Map<Integer, Integer>) factorsMap).entrySet()) {
            if (entry.getValue() == 1) {
                stringBuilder.append("(").append(entry.getKey()).append(")");
            } else {
                stringBuilder.append("(").append(entry.getKey()).append("**").append(entry.getValue()).append(")");
            }
        }
        return stringBuilder.toString();
    }
}
