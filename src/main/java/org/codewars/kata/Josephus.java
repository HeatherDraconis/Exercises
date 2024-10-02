package org.codewars.kata;

import java.util.ArrayList;
import java.util.List;

public class Josephus {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> countedOut = new ArrayList<>();
        List<T> itemsIn = new ArrayList<>(items);
        int position = 0;
        while (!itemsIn.isEmpty()) {
            position += (k - 1);
            while (position >= itemsIn.size()) {
                position -= itemsIn.size();
            }
            countedOut.add(itemsIn.get(position));
            itemsIn.remove(position);
        }
        return countedOut;
    }
}
