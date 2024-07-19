package org.codewars.kata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        List<String> result = new ArrayList<>();
        for (String array1Substring : array1) {
            if (isContained(array1Substring, array2)) {
                result.add(array1Substring);
            }
        }
        Collections.sort(result);
        return result.toArray(new String[0]);
    }

    private static boolean isContained(String substring, String[] array) {
        for (String s : array) {
            if (s.contains(substring)) {
                return TRUE;
            }
        }
        return FALSE;
    }
}
