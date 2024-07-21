package org.codewars.kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    static Map<Integer,List<Integer>> valueToPosition;

    public static int[] twoSumEfficient(int[] numbers, int target) {
        createLookupMap(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            Integer j = find(i, target - numbers[i]);
            if (j != null){
                return new int[]{i, j};
            }
        }
        return null;
    }

    private static void createLookupMap(int[] numbers) {
        valueToPosition = new HashMap<>();
        for (int j = 0; j < numbers.length; j++) {
            valueToPosition.computeIfAbsent(numbers[j], p->new ArrayList<>()).add(j);
        }
    }

    private static Integer find(int i, int lookFor) {
        List<Integer> vals = valueToPosition.get(lookFor);
        return vals==null?null:vals.stream().filter( k->k!=i).findFirst().orElse( null );
    }
}
