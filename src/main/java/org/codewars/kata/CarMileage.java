package org.codewars.kata;

public class CarMileage {
    public static int isInteresting(int number, int[] awesomePhrases) {
        if (number > 99 && (matchZeros(number)
                || matchSame(number)
                || matchIncrementing(number)
                || matchDecrementing(number)
                || matchPalindrome(number)
                || matchAwesomePhrases(number, awesomePhrases))) {
            return 2;
        }
        if ((number > 98 && (matchZeros(number + 1)
                || matchSame(number + 1)
                || matchIncrementing(number + 1)
                || matchDecrementing(number + 1)
                || matchPalindrome(number + 1)
                || matchAwesomePhrases(number + 1, awesomePhrases)))
                || (number > 97 && (matchZeros(number + 2)
                || matchSame(number + 2)
                || matchIncrementing(number + 2)
                || matchDecrementing(number + 2)
                || matchPalindrome(number + 2)
                || matchAwesomePhrases(number + 2, awesomePhrases)))) {
            return 1;
        }
        return 0;
    }

    private static boolean matchZeros(int number) {
        String[] num = Integer.toString(number).split("");
        for (int i = 1; i < num.length; i++) {
            if (!num[i].equals("0")) {
                return false;
            }
        }
        return true;
    }

    private static boolean matchSame(int number) {
        String[] num = Integer.toString(number).split("");
        for (int i = 1; i < num.length; i++) {
            if (!num[i].equals(num[0])) {
                return false;
            }
        }
        return true;
    }

    private static boolean matchIncrementing(int number) {
        String[] num = Integer.toString(number).split("");
        int match = Integer.parseInt(num[0]);
        for (int i = 1; i < num.length; i++) {
            match++;
            if (!(num[i].equals("0") ? "10" : num[i]).equals(Integer.toString(match))) {
                return false;
            }
        }
        return true;
    }

    private static boolean matchDecrementing(int number) {
        String[] num = Integer.toString(number).split("");
        int match = Integer.parseInt(num[0]);
        for (int i = 1; i < num.length; i++) {
            match--;
            if (!num[i].equals(Integer.toString(match))) {
                return false;
            }
        }
        return true;
    }

    private static boolean matchPalindrome(int number) {
        String[] num = Integer.toString(number).split("");
        for (int i = 0; i < num.length; i++) {
            if (!num[i].equals(num[num.length - 1 - i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean matchAwesomePhrases(int number, int[] awesomePhrases) {
        for (int awesomePhrase : awesomePhrases) {
            if (awesomePhrase == number) {
                return true;
            }
        }
        return false;
    }
}