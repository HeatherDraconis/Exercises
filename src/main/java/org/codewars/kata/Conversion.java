package org.codewars.kata;

public class Conversion {
    public String solution(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < value.length; i++) {
            while (n >= value[i]) {
                stringBuilder.append(symbol[i]);
                n = n - value[i];
            }
        }
        return String.valueOf(stringBuilder);
    }
}
