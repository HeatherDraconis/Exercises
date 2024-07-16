package org.codewars.kata;

import java.util.StringJoiner;

public class SpinWords {
    public String spinWords(String sentence) {
        String[] splitSentence = sentence.split(" ");
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (String s : splitSentence) {
            if (s.length() >= 5) {
                stringJoiner.add(flipWord(s));
            }
            else {
                stringJoiner.add(s);
            }
        }
        return stringJoiner.toString();
    }

    private static String flipWord(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() -1; i >= 0 ; i--) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
