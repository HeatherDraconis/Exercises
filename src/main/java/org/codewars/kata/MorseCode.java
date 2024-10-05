package org.codewars.kata;

import java.util.ArrayList;
import java.util.Arrays;

public class MorseCode {
    public static String get(String morseCode) {
        ArrayList<String> morseCodeList = new ArrayList<>(Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."));
        ArrayList<String> alphabetList = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
        int index = morseCodeList.indexOf(morseCode);
        if (index >= 0) {
            return alphabetList.get(index);
        }

        ArrayList<String> morseCodeNumList = new ArrayList<>(Arrays.asList(".---", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----"));
        ArrayList<String> numList = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0"));
        index = morseCodeNumList.indexOf(morseCode);
        if (index >= 0) {
            return numList.get(index);
        }

        ArrayList<String> morseCodeSymList = new ArrayList<>(Arrays.asList("..--..", "-.-.--", ".-.-.-", "--..--", "-.-.-.", "---...", ".-.-.", "-....-", "-..-." ,"-...-"));
        ArrayList<String> symList = new ArrayList<>(Arrays.asList("?", "!", ".", ",", ";", ":", "+", "-", "/", "="));
        index = morseCodeSymList.indexOf(morseCode);
        if (index >= 0) {
            return symList.get(index);
        }


        return "NaN";
    }
}
