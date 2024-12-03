package org.codewars.kata;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Josephus2 {
    public static int josephusSurvivor(final int n, final int k) {
        List<Integer> people = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
        int position = 0;
        while (people.size() > 1) {
            position += (k - 1);
            while (position >= people.size()) {
                position -= people.size();
            }
            people.remove(position);
        }
        return people.getFirst();
    }
}
