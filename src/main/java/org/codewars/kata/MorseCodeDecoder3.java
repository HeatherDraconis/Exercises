package org.codewars.kata;

public class MorseCodeDecoder3 {
    public static String decodeBitsAdvanced(String bits) {
        bits = bits.replaceAll("0", " ").trim().replaceAll(" ", "0");
        bits = bits.replaceAll("01", "0 1");
        bits = bits.replaceAll("10", "1 0");
        String[] bitsArray = bits.split(" ");
        int noSpaceLength = bits.length();
        int shortSpaceLength = bits.length();
        int longSpaceLength = bits.length();
        int dotLength = bits.length();
        int dashLength = bits.length();
        int longestSLength = 0;
        int shortestSLength = bits.length();
        int longestDLength = 0;
        int shortestDLength = bits.length();
        for (int i = 0; i < bitsArray.length; i++) {
            if (bitsArray[i].startsWith("0")) {
                if (bitsArray[i].length() < shortestSLength) {
                    shortestSLength = bitsArray[i].length();
                }
                if (bitsArray[i].length() > longestSLength) {
                    longestSLength = bitsArray[i].length();
                }
            }
            if (bitsArray[i].startsWith("1")) {
                if (bitsArray[i].length() < shortestDLength) {
                    shortestDLength = bitsArray[i].length();
                }
                if (bitsArray[i].length() > longestDLength) {
                    longestDLength = bitsArray[i].length();
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < bitsArray.length; j++) {
            if (bitsArray[j].startsWith("0")) {
                if (bitsArray[j].length() == shortSpaceLength) {
                    stringBuilder.append(" ");
                }
                if (bitsArray[j].length() == longSpaceLength) {
                    stringBuilder.append("   ");
                }
            }
            if (bitsArray[j].startsWith("1")) {
                if (bitsArray[j].length() == dotLength) {
                    stringBuilder.append(".");
                }
                if (bitsArray[j].length() == dashLength) {
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
