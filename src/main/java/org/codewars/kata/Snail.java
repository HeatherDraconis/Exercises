package org.codewars.kata;

public class Snail {
    public static int[] snail(int[][] array) {
        if (array[0].length == 0) {
            return new int[0];
        }
        int snailLength = array.length;
        int[] snailArray = new int[snailLength * snailLength];
        int snailIndex = 0;
        int snailChange = 0;
        while (snailIndex < snailLength * snailLength - 1) {
            for (int i = snailChange; i < snailLength - snailChange; i++) {
                snailArray[snailIndex] = array[snailChange][i];
                snailIndex++;
            }
            for (int i = snailChange + 1; i < snailLength - snailChange - 1; i++) {
                snailArray[snailIndex] = array[i][snailLength - snailChange - 1];
                snailIndex++;
            }
            for (int i = snailLength - snailChange - 1; i >= snailChange; i--) {
                snailArray[snailIndex] = array[snailLength - snailChange - 1][i];
                snailIndex++;
            }
            for (int i = snailLength - snailChange - 2; i >= snailChange + 1; i--) {
                snailArray[snailIndex] = array[i][snailChange];
                snailIndex++;
            }
            snailChange++;
        }
        if (snailIndex < snailLength * snailLength) {
            snailArray[snailIndex] = array[snailChange][snailChange];
        }
        return snailArray;
    }
}
