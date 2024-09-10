package org.codewars.kata;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        int[] str1Array = charCount(str1);
        int[] str2Array = charCount(str2);
        for (int i = 0; i < 26; i++) {
            if (str2Array[i] > str1Array[i]) {
                return false;
            }
        }
        return true;
    }

    private static int[] charCount(String str) {
        int[] strArray = new int[26];
        for (int i = 0; i < str.length(); i++) {
            strArray[str.codePointAt(i) - 97]++;
        }
        return strArray;
    }

    public static boolean scrambleOld(String str1, String str2) {
        while (!str1.isEmpty()) {
            String letter = str1.substring(0, 1);
            if (str2.contains(letter)) {
                str2 = str2.replaceFirst(letter, "");
                if(str2.isEmpty()) {
                    return true;
                }
                str1 = str1.replaceFirst(letter, "");
            } else {
                str1 = str1.replaceAll(letter, "");
            }
        }
        return str2.isEmpty();
    }
}
