package org.codewars.kata;

public class BlackOrWhiteKey2 {
    public static String whichNote(int keyPressCount) {
        int note = (keyPressCount % 88 == 0 ? 88 : keyPressCount % 88) % 12;
        return switch (note) {
            case  1 -> "A";
            case  2 -> "A#";
            case  3 -> "B";
            case  4 -> "C";
            case  5 -> "C#";
            case  6 -> "D";
            case  7 -> "D#";
            case  8 -> "E";
            case  9 -> "F";
            case 10 -> "F#";
            case 11 -> "G";
            case  0 -> "G#";
            default ->
                    throw new IllegalStateException("Unexpected value: " + note);
        };
    }
}
