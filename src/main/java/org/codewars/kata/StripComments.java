package org.codewars.kata;

import java.util.StringJoiner;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        if (text.isEmpty() || commentSymbols.length == 0) {
            return text;
        }
        StringJoiner stringJoiner = new StringJoiner("\n");
        for (String line : text.split("\n")) {
            for (String symbol : commentSymbols) {
                line = line.startsWith(symbol) ? "" : line.split("\\" + symbol)[0];
            }
            stringJoiner.add(("#" + line).strip().replaceFirst("#", ""));
        }
        return stringJoiner.toString();
    }
}
