package org.codewars.kata;

public class Rot13 {
    public static String cipher(String str) {
        String[] split = str.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : split) {
            stringBuilder.append(s.matches("[A-Z]") ? getCipher(s.toLowerCase()).toUpperCase() : getCipher(s));
        }
        return stringBuilder.toString();
    }

    private static String getCipher(String s) {
        return switch (s) {
            case "a" -> "n";
            case "b" -> "o";
            case "c" -> "p";
            case "d" -> "q";
            case "e" -> "r";
            case "f" -> "s";
            case "g" -> "t";
            case "h" -> "u";
            case "i" -> "v";
            case "j" -> "w";
            case "k" -> "x";
            case "l" -> "y";
            case "m" -> "z";
            case "n" -> "a";
            case "o" -> "b";
            case "p" -> "c";
            case "q" -> "d";
            case "r" -> "e";
            case "s" -> "f";
            case "t" -> "g";
            case "u" -> "h";
            case "v" -> "i";
            case "w" -> "j";
            case "x" -> "k";
            case "y" -> "l";
            case "z" -> "m";
            default -> s;
        };
    }
}
