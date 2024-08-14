package org.challenges;

public class Factorial {
    public static int nFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int nFactorial2(int n) {
        return result(n);
    }

    private static int result(int n) {
        if (n > 1) {
            return n  * result(n - 1);
        } else {
            return 1;
        }
    }
}
