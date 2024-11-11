package org.codewars.kata;

public class Persist {
    public static int persistence(long n) {
        int count = 0;
        String nString = String.valueOf(n);
        while (nString.length() > 1) {
            long nNew = 1;
            for (int i = 0; i < nString.length(); i++) {
                nNew *= Integer.parseInt(String.valueOf(nString.charAt(i)));
            }
            nString = String.valueOf(nNew);
            count++;
        }
        return count;
    }
}
