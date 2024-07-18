package org.codewars.kata;

import java.util.StringJoiner;

public class Accumul {
    public static String accum2(String s) {
        StringJoiner stringJoiner = new StringJoiner("-");
        String sLowerCase = s.toLowerCase();
        String sUpperCase = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            stringJoiner.add(sUpperCase.charAt(i) + String.valueOf(sLowerCase.charAt(i)).repeat(i));
        }
        return stringJoiner.toString();
    }

    public static String accum(String s) {
        StringJoiner stringJoiner = new StringJoiner("-");
        for (int i = 0; i < s.length(); i++) {
            String charToRepeat = s.substring(i, i + 1);
            stringJoiner.add(charToRepeat.toUpperCase() + charToRepeat.toLowerCase().repeat(i));
        }
        return stringJoiner.toString();
    }
}
