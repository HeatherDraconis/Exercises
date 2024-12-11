package org.codewars.kata;

import java.util.ArrayList;
import java.util.List;

public class Mutation {
    static boolean valid;
    static String[] alice, bob;
    static List<String> words;
    public static int mutations(String[] alice, String[] bob, String word, int first) {
        Mutation.alice = alice;
        Mutation.bob = bob;
        words = new ArrayList<>();
        words.add(word);
        valid = true;
        return checkWord(first, word);
    }

    private static int checkWord(int i, String word) {
        for (String str: i == 0 ? alice : bob) {
            if (!words.contains(str) && hasOneLetterDiferent(word, str) && !hasARepeatedLetter(str)) {
                words.add(str);
                return valid ? checkWord(i == 0 ? 1 : 0, str) : i;
            }
        }
        if (!valid) {
            return -1;
        }
        if (words.size() == 1) {
            valid = false;
            return checkWord(i == 0 ? 1 : 0, word);
        }
        return i == 0 ? 1 : 0;
    }

    private static boolean hasOneLetterDiferent(String word, String str) {
        return (str.charAt(0) == word.charAt(0) ? 1 : 0)
                + (str.charAt(1) == word.charAt(1) ? 1 : 0)
                + (str.charAt(2) == word.charAt(2) ? 1 : 0)
                + (str.charAt(3) == word.charAt(3) ? 1 : 0) == 3;
    }

    private static boolean hasARepeatedLetter(String str) {
        return str.charAt(0) == str.charAt(1) || str.charAt(0) == str.charAt(2) ||str.charAt(0) == str.charAt(3) ||
                str.charAt(1) == str.charAt(2) || str.charAt(1) == str.charAt(3) ||
                str.charAt(2) == str.charAt(3);
    }
}
