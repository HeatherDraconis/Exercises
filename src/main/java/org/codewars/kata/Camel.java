package org.codewars.kata;

public class Camel {
    public static String camelCase(String input) {
        for (char i = 'A'; i <= 'Z'; i++) {
            input = input.replace(String.valueOf(i), " " + i);
        }
        return input;
    }
}
