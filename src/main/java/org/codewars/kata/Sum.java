package org.codewars.kata;

public class Sum {
    public static String sumStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int aLength = a.length();
        int bLength = b.length();
        int remainder = 0;
        for (int i = 0; i < Math.max(aLength, bLength); i++) {
            int term = Integer.parseInt(i < aLength ? a.split("")[aLength - 1 - i] : "0")
                    + Integer.parseInt(i < bLength ? b.split("")[bLength - 1 - i] : "0")
                    + remainder;
            result.append(term % 10);
            remainder = term / 10;
        }
        result.append(remainder);

        return result.reverse().toString().replaceFirst("0*", "");
    }
}