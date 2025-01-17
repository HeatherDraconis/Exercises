package org.codewars.kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {
    public static Map<String, List<Integer>> getPeaks(int[] array) {
        Map<String, List<Integer>> answer = new HashMap<>();
        answer.put("pos", new ArrayList<>());
        answer.put("peaks", new ArrayList<>());
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1]) {
                int j = i + 1;
                while (j < array.length - 1 && array[i] == array[j]) {
                    j++;
                }
                if (array[i] > array[j]) {
                    answer.get("pos").add(i);
                    answer.get("peaks").add(array[i]);
                }
                i = j - 1;
            }
        }
        return answer;
    }
}
