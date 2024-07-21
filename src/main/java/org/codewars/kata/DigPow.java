package org.codewars.kata;

public class DigPow {
    public static long digPow(int n, int p) {
        String nString = String.valueOf(n);
        long sumOfTerm = 0;
        for (int i = 0; i < nString.length(); i++) {
            int a = Integer.parseInt(nString.substring(i, i+1));
            sumOfTerm += (long) Math.pow(a, p+i);
        }
        if (sumOfTerm % n == 0){
            return (sumOfTerm / n);
        }
        return -1;
    }
}
