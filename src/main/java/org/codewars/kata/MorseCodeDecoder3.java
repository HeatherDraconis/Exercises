package org.codewars.kata;

import java.util.Arrays;

public class MorseCodeDecoder3 {
    public static String decodeBitsAdvanced(String bits) {
        bits = bits.replaceAll("0", " ").trim().replaceAll(" ", "0");
        bits = bits.replaceAll("01", "0 1");
        bits = bits.replaceAll("10", "1 0");
        String[] bitsArray = bits.split(" ");

        Integer[] signalArray = new Integer[bitsArray.length];
        for (int i = 0; i < bitsArray.length; i++) {
            signalArray[i] = bitsArray[i].length();
        }
        Arrays.sort(signalArray);
        int smallLength = signalArray[0];
        int largeLength = signalArray[bitsArray.length - 1];

        Integer[] gapsArray = new Integer[largeLength - smallLength + 1];
        for (int i = smallLength; i < largeLength - smallLength + 1; i++) {
            if (!Arrays.toString(signalArray).contains(i + "")) {
                gapsArray[i] = i + smallLength - 1;
            }
        }

        int gap1 = bits.length() + 1;
        int gap2 = bits.length() + 1;

        for (int i = 0; i < gapsArray.length; i++) {
            if (gapsArray[i] != null && gap1 == bits.length() + 1) {
                gap1 = gapsArray[i];
            }
        }

        for (int i = gapsArray.length -1 ; i >= 0; i--) {
            if (gapsArray[i] != null && gapsArray[i] > gap1 && gap2 == bits.length() + 1) {
                gap2 = gapsArray[i];
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < bitsArray.length; j++) {
            if (bitsArray[j].startsWith("0")) {
                if (bitsArray[j].length() <= gap1) {
                    stringBuilder.append("");
                }
                else if (bitsArray[j].length() <= gap2) {
                    stringBuilder.append(" ");
                }
                else {
                    stringBuilder.append("   ");
                }
            }
            if (bitsArray[j].startsWith("1")) {
                if (bitsArray[j].length() <= gap1) {
                    stringBuilder.append(".");
                }
                else {
                    stringBuilder.append("-");
                }
            }
        }
        return stringBuilder.toString().trim();
    }

    public static String decodeMorse (String morseCode) {
        morseCode = morseCode.trim();
        StringBuilder stringBuilder = new StringBuilder();
        int lastSpace = -1;
        do {
            int thisSpace = morseCode.indexOf(" ", lastSpace + 1);
            String letter;
            if (thisSpace == -1) {
                letter = morseCode.substring(lastSpace + 1);
            }
            else {
                letter = morseCode.substring(lastSpace + 1, thisSpace);
            }
            if (letter.isEmpty()) {
                stringBuilder.append(" ");
                thisSpace += 1;
            }
            else {
                stringBuilder.append(MorseCode.get(letter));
            }
            lastSpace = thisSpace;
        } while (lastSpace >= 0);
        return stringBuilder.toString();
    }
}
