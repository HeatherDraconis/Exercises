package org.codewars.kata;

public class Greed {
    public static int greedy(int[] dice){
        int points = 0;
        int[] num = new int[6];
        for (int roll : dice) {
            num[roll - 1] += 1;
        }
        if (num[0] >= 3) {
            points += 1000;
            num[0] -= 3;
        }
        if (num[5] >= 3) {
            points += 600;
        }
        if (num[4] >= 3) {
            points += 500;
            num[4] -= 3;
        }
        if (num[3] >= 3) {
            points += 400;
        }
        if (num[2] >= 3) {
            points += 300;
        }
        if (num[1] >= 3) {
            points += 200;
        }
        points += num[0] * 100;
        points += num[4] * 50;
        return points;
    }
}
