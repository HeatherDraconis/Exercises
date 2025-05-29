package org.codewars.kata;

public class RangeExtraction {
    public static String rangeExtraction(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) stringBuilder.append(",");
            stringBuilder.append(arr[i]);
            int j = i;
            while (j < arr.length - 1 && arr[j] + 1 == arr[j + 1]) j++;
            if (j > i + 1) {
                i = j;
                stringBuilder.append("-").append(arr[i]);
            }
        }
        return stringBuilder.toString();
    }
}
