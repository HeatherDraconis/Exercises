package org.codewars.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        while (reduce(arrList));
        return arrList.toArray(String[]::new);
    }

    private static boolean reduce(List<String> arrList) {
        for (int i = 0; i < arrList.size() -1; i++) {
            if (comparison(arrList.get(i+1), arrList.get(i))) {
                arrList.remove(i+1);
                arrList.remove(i);
                return true;
            }
        }
        return false;
    }

    private static boolean comparison(String term1, String term2) {
        if (term1.equals("NORTH") && term2.equals("SOUTH")) {
            return TRUE;
        }
        if (term1.equals("SOUTH") && term2.equals("NORTH")) {
            return TRUE;
        }
        if (term1.equals("EAST") && term2.equals("WEST")) {
            return TRUE;
        }
        if (term1.equals("WEST") && term2.equals("EAST")) {
            return TRUE;
        }
        return FALSE;
    }
}
