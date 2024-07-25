package org.codewars.kata;

import java.util.ArrayList;
import java.util.Arrays;

public class MorseCode {
    public static String get(String morseCode) {
        ArrayList<String> morseCodeList = new ArrayList<>(Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."));
        ArrayList<String> alphabetList = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
        return alphabetList.get(morseCodeList.indexOf(morseCode));
    }
}
