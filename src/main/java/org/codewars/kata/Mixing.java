package org.codewars.kata;

import java.util.*;

public class Mixing {
    public static String mix(String s1, String s2) {
        List<String> parts = new ArrayList<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count1 = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == ch) {
                    count1++;
                }
            }
            int count2 = 0;
            for (int i = 0; i < s2.length(); i++) {
                if (s2.charAt(i) == ch) {
                    count2++;
                }
            }
            int countMax = Math.max(count1, count2);
            if (countMax > 1) {
                parts.add(new StringBuilder()
                        .append(count1 == count2 ? "=" : count1 > count2 ? "1" : "2")
                        .append(":").repeat(ch, countMax).toString());
            }
        }
        parts.sort((part1, part2) -> {
            int length1 = part1.length();
            int length2 = part2.length();
            return length1 != length2 ? length2 - length1
                    : part1.charAt(0) == part2.charAt(0) ? part1.charAt(length1 - 1) - part2.charAt(length2 - 1)
                    : part1.startsWith("1") || part1.startsWith("2") && part2.startsWith("=") ? -1
                    : 1;
        });
        StringJoiner stringJoiner = new StringJoiner("/");
        parts.forEach(stringJoiner::add);
        return stringJoiner.toString();
    }

}

