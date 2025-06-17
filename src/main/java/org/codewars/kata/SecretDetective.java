package org.codewars.kata;

import java.util.*;

public class SecretDetective {
    public static String recoverSecret(char[][] triplets) {
        Map<String, Set<String>> letters = new HashMap<>();
        Arrays.stream(triplets).forEach(triplet -> {
            letters.putIfAbsent(String.valueOf(triplet[0]), new HashSet<>());
            letters.putIfAbsent(String.valueOf(triplet[1]), new HashSet<>());
            letters.get(String.valueOf(triplet[1])).add(String.valueOf(triplet[0]));
            letters.putIfAbsent(String.valueOf(triplet[2]), new HashSet<>());
            letters.get(String.valueOf(triplet[2])).add(String.valueOf(triplet[1]));
            letters.get(String.valueOf(triplet[2])).add(String.valueOf(triplet[0]));
        });
        letters.forEach((key, value) -> letters.values().stream().filter(v -> v.contains(key)).forEach(v -> v.addAll(value)));
        SortedMap<Integer, String> order = new TreeMap<>();
        letters.forEach((key, value) -> order.put(value.size(), key));
        return String.join("", order.values());
    }
}