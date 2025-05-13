package org.codewars.kata;

public class BlackOrWhiteKey {
    public static String blackOrWhiteKey(int keyPressCount) {
        return switch ((keyPressCount % 88 == 0 ? 88 : keyPressCount % 88) % 12) {
            case 1, 3, 4, 6, 8, 9, 11 -> "white";
            default -> "black";
        };
    }
}
