package org.challenges;

public class PrimeNumberChecker {
    public static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        if(doesDivide(num, 2) && num  > 2) {
            return false;
        }
        long sqrt = (long) Math.sqrt(num);
        for (long i = 3; i <= sqrt; i+=2) {
            if(doesDivide(num, i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean doesDivide(long num, long i) {
        return num % i == 0;
    }
}
