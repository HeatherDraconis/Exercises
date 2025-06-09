package org.codewars.kata;

public class RomanNumerals {
    static int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String toRoman(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < value.length; i++) {
            while (n >= value[i]) {
                stringBuilder.append(symbol[i]);
                n = n - value[i];
            }
        }
        return String.valueOf(stringBuilder);
    }

    public static int fromRoman(String romanNumeral) {
        int result = 0;
        StringBuilder stringBuilder = new StringBuilder().append(romanNumeral);
        for (int i = 0; i < symbol.length; i++) {
            while (stringBuilder.length() >= symbol[i].length() && stringBuilder.substring(0, symbol[i].length()).equals(symbol[i])) {
                result += value[i];
                stringBuilder.delete(0, symbol[i].length());
            }
        }
        return result;
    }
}
