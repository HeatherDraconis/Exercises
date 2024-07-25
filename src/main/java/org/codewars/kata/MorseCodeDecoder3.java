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
        for (int i = 0; i < bitsArray.length; i++) {
            if (bitsArray[i].startsWith("0")) {
                if (bitsArray[i].length() < noSpaceLength) {
                    longSpaceLength = shortSpaceLength;
                    shortSpaceLength = noSpaceLength;
                    noSpaceLength = bitsArray[i].length();
                }
                else if ((bitsArray[i].length() < shortSpaceLength) && (bitsArray[i].length() > noSpaceLength)) {
                    longSpaceLength = shortSpaceLength;
                    shortSpaceLength = bitsArray[i].length();
                }
                else if ((bitsArray[i].length() < longSpaceLength) && (bitsArray[i].length() > noSpaceLength)) {
                    longSpaceLength = bitsArray[i].length();
                }
            }
            if (bitsArray[i].startsWith("1")) {
                if (bitsArray[i].length() < dotLength) {
                    dashLength = dotLength;
                    dotLength = bitsArray[i].length();
                }
                else if ((bitsArray[i].length() < dashLength) && (bitsArray[i].length() > dotLength)) {
                    dashLength = bitsArray[i].length();
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < bitsArray.length; j++) {
            if (bitsArray[j].startsWith("0")) {
                if (bitsArray[j].length() <= noSpaceLength + 2) {
                    stringBuilder.append("");
                }
                else if (bitsArray[j].length() <= shortSpaceLength + 2) {
                    stringBuilder.append(" ");
                }
                else if (bitsArray[j].length() >= longSpaceLength - 2) {
                    stringBuilder.append("   ");
                }
            }
            if (bitsArray[j].startsWith("1")) {
                if (bitsArray[j].length() <= dotLength + 2) {
                    stringBuilder.append(".");
                }
                else if (bitsArray[j].length() >= dashLength - 2) {
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
