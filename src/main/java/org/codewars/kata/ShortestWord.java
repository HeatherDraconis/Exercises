package org.codewars.kata;

public class ShortestWord {
    public static int findShort(String s) {
        String[] sArray = s.split(" ");
        int lenShortWord = s.length();
        for (String word : sArray) {
            int lenWord = word.length();
            lenShortWord = Math.min(lenWord, lenShortWord);
        }
        return lenShortWord;
    }
}
