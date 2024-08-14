package org.codewars.kata;

import java.util.ArrayList;
import java.util.List;

public class FindNext {
    public static long nextBiggerNumber(long n) {
        List<Integer> higherValues = new ArrayList<>();
        int firstLower = -1;
        int lastDigit = -1;
        int j = 0;
        while (n > 0) {
            int nextInt =  (int) (n % 10);
            n /= 10;
            if (j > 0 && nextInt < lastDigit) {
                firstLower = nextInt;
                break;
            }
            higherValues.add(nextInt);
            lastDigit = nextInt;
            j++;
        }
        if (firstLower == -1) {
            return -1;
        }
        long answer = n;
        for (int i = 0; i < higherValues.size(); i++) {
            if (higherValues.get(i) > firstLower) {
                answer = answer * 10 + higherValues.get(i);
                higherValues.set(i, firstLower);
                break;
            }
        }
        for (Integer higherValue : higherValues) {
            answer = answer * 10 + higherValue;
        }
        return answer;
    }

    //below here is the old solution

    public static long nextBiggerNumber2(long n) {
        String nString = String.valueOf(n);
        List<Integer> nArray = new ArrayList<>();
        for (int i = 0; i < nString.length(); i++) {
            nArray.add(Integer.parseInt(String.valueOf(nString.charAt(i))));
        }
        return findAnswer(n, nArray);
    }

    private static long findAnswer(long n, List<Integer> nArray) {
        long newN = -1;
        int nLength = nArray.size();
        if (nLength > 1) {
            List<Integer[]> oldCombinations = findCombinations(nLength - 1, nArray);
            for (Integer[] oldCombination : oldCombinations) {
                int oCLength = oldCombination.length;
                for (int j = 0; j < oCLength; j++) {
                    long answer = 0;
                    for (int i = 0; i < j; i++) {
                        answer = answer * 10 + oldCombination[i];
                    }
                    answer = answer * 10 + nArray.get(nLength - 1);
                    for (int i = j; i < oCLength; i++) {
                        answer = answer * 10 + oldCombination[i];
                    }
                    if (answer > n && (newN == -1 || answer < newN)) {
                        newN = answer;
                    }
                }
            }
        }
        return newN;
    }

    public static List<Integer[]> findCombinations(int nLength, List<Integer> nArray) {
        List<Integer[]> combinations = new ArrayList<>();
        if (nLength > 1) {
            List<Integer[]> oldCombinations = findCombinations(nLength - 1, nArray);
            for (Integer[] oldCombination : oldCombinations) {
                int oCLength = oldCombination.length;
                for (int j = 0; j <= oCLength; j++) {
                    Integer[] order = new Integer[oCLength + 1];
                    for (int i = 0; i < j; i++) {
                        order[i] = oldCombination[i];
                    }
                    order[j] = nArray.get(nLength - 1);
                    for (int i = j; i < oCLength; i++) {
                        order[i + 1] = oldCombination[i];
                    }
                    combinations.add(order);
                }
            }
        } else {
            combinations.add(new Integer[]{nArray.get(0)});
        }
        return combinations;
    }
}