package org.codewars.kata;

public class Greed {
    public static int greedy(int[] dice){
        int points = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                one += 1;
            }
            if (dice[i] == 2) {
                two += 1;
            }
            if (dice[i] == 3) {
                three += 1;
            }
            if (dice[i] == 4) {
                four += 1;
            }
            if (dice[i] == 5) {
                five += 1;
            }
            if (dice[i] == 6) {
                six += 1;
            }
        }
        if (one >= 3) {
            points += 1000;
            one -= 3;
        }
        if (six >= 3) {
            points += 600;
        }
        if (five >= 3) {
            points += 500;
            five -= 3;
        }
        if (four >= 3) {
            points += 400;
        }
        if (three >= 3) {
            points += 300;
        }
        if (two >= 3) {
            points += 200;
        }
        while (one > 0) {
            points += 100;
            one -= 1;
        }
        while (five > 0) {
            points += 50;
            five -= 1;
        }
        return points;
    }
}
