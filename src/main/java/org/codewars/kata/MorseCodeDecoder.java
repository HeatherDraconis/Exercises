package org.codewars.kata;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {
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
