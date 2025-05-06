package org.codewars.kata;

public class StringSplit {
    public static String[] solution(String s) {
        String[] sArray = new String[(s.length() + 1) / 2];
        for (int i = 0; i < s.length(); i++)
            sArray[i / 2] = s.charAt(i) + Character.toString(i++ < s.length() - 1 ? s.charAt(i) : '_');
        return sArray;
    }
}
