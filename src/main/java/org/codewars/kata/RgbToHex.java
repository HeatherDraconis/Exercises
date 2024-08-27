package org.codewars.kata;

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        b = checkBoundary(b);
        g = checkBoundary(g);
        r = checkBoundary(r);
        return getHexDigit(r /16) + getHexDigit(r %16) + getHexDigit(g /16) + getHexDigit(g %16) + getHexDigit(b /16) + getHexDigit(b %16);
    }

    private static int checkBoundary(int colour) {
        if (colour <= 0) {
            return 0;
        }
        if (colour >= 255) {
            return 255;
        }
        return colour;
    }

    private static String getHexDigit(int i) {
        return switch (i) {
            case 10 -> "A";
            case 11 -> "B";
            case 12 -> "C";
            case 13 -> "D";
            case 14 -> "E";
            case 15 -> "F";
            default -> Integer.toString(i);
        };
    }
}
