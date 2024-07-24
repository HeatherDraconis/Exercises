package org.codewars.kata;

public class NoRepeat {
    public static String firstNonRepeatingLetter(String s){
        String lowerS = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if ((lowerS.substring(0, i).indexOf(lowerS.charAt(i)) == -1) && (lowerS.substring(i + 1).indexOf(lowerS.charAt(i)) == -1)) {
                return s.charAt(i) + "";
            }
        }
        return "";
    }
}
