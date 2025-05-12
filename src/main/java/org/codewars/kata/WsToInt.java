package org.codewars.kata;

public class WsToInt {

    public static String whitespaceNumber(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n >= 0) {
            stringBuilder.append(" ");
        } else {
            stringBuilder.append("\t");
            n = -n;
        }
        int power = (int) Math.pow(2, (int) (Math.log(n) / Math.log(2)));;
        while (power > 0) {
            if (n >= power) {
                stringBuilder.append("\t");
                n = n % power;
            } else {
                stringBuilder.append(" ");
            }
            if (power == 1) {
                break;
            }
            power /= 2;
        }
        return stringBuilder.append("\n").toString();
    }
}
