package org.codewars.kata;

public class NoRepeat {
    public static String firstNonRepeatingLetter(String s){
        String lowerS = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = lowerS.charAt(i);
            boolean chNotPresentBefore = lowerS.substring(0, i).indexOf(ch) == -1;
            boolean chNotPresentAfter = lowerS.substring(i + 1).indexOf(ch) == -1;
            if (chNotPresentBefore && chNotPresentAfter) {
                return s.charAt(i) + "";
            }
        }
        return "";
    }
}
