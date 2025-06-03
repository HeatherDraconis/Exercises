package org.codewars.kata;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    static List<String> orders;
    static StringBuilder stringBuilder;
    static List<Integer> indices;

    public static List<String> singlePermutations(String s) {
        orders = new ArrayList<>();
        stringBuilder = new StringBuilder();
        indices = new ArrayList<>();
        setOrders(s.split(""));
        return orders;
    }

    private static void setOrders(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!indices.contains(i)) {
                indices.add(i);
                stringBuilder.append(array[i]);
                String order = stringBuilder.toString();
                if (order.length() < array.length) {
                    setOrders(array);
                } else if (!orders.contains(order)) {
                    orders.add(order);
                }
                stringBuilder.replace(indices.size() - 1, indices.size(), "");
                indices.removeLast();
            }
        }
    }
}
