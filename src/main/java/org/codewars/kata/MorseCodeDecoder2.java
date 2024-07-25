package org.codewars.kata;

public class MorseCodeDecoder2 {
    public static String decodeBits(String bits) {
        bits = bits.replaceAll("0", " ").trim().replaceAll(" ", "0");
        bits = bits.replaceAll("01", "0 1");
        bits = bits.replaceAll("10", "1 0");
        String[] bitsArray = bits.split(" ");
        int unitLength = bits.length();
        for (int i = 0; i < bitsArray.length; i++) {
            unitLength = Math.min(bitsArray[i].length(), unitLength);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < bitsArray.length; j++) {
            if (bitsArray[j].startsWith("0")) {
                switch (bitsArray[j].length() / unitLength) {
                    case 1:
                        break;
                    case 3:
                        stringBuilder.append(" ");
                        break;
                    case 7:
                        stringBuilder.append("   ");
                        break;
                }
            }
            if (bitsArray[j].startsWith("1")) {
                switch (bitsArray[j].length() / unitLength) {
                    case 1:
                        stringBuilder.append(".");
                        break;
                    case 3:
                        stringBuilder.append("-");
                        break;
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
