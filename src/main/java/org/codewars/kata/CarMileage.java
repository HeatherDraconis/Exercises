package org.codewars.kata;

import java.util.Arrays;

public class CarMileage {
    public static int isInteresting(int number, int[] awesomePhrases) {
        if (number > 99 && match(number, awesomePhrases)) {
            return 2;
        }
        if ((number > 98 && match(number + 1, awesomePhrases))
                || (number > 97 && match(number + 2, awesomePhrases))) {
            return 1;
        }
        return 0;
    }

    private static boolean match(int number, int[] awesomePhrases) {
        String n = Integer.toString(number);
        return n.matches("\\d0+")
                || n.matches(n.charAt(0) + "+")
                || "1234567890".contains(n)
                || "9876543210".contains(n)
                || n.contentEquals(new StringBuilder(n).reverse())
                || Arrays.stream(awesomePhrases).anyMatch(awesomePhrase -> awesomePhrase == number);
    }
}