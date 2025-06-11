package org.codewars.kata;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;


public class SumOfDivided  {
    public static String sumOfDivided(int[] list) {
        SortedMap<Integer, Integer> primes =new TreeMap<>();
        for (int n : list) {
            int factor = n;
            int key = 2;
            while (factor > 1 || factor < -1) {
                if (factor % key == 0) {
                    while (factor % key == 0) {
                        factor /= key;
                    }
                    if (primes.putIfAbsent(key, n) != null) {
                        primes.replace(key, n + primes.get(key));
                    }
                }
                key++;
            }
        }
        return primes.entrySet().stream().map(prime -> "(" + prime.getKey() + " " + prime.getValue() + ")").collect(Collectors.joining());
    }
}
