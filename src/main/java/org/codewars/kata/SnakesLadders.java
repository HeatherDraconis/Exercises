package org.codewars.kata;

public class SnakesLadders {
    static int n, x1, x2;
    public SnakesLadders() {
        n = 1;
        x1 = 0;
        x2 = 0;
    }
    public String play(int die1, int die2) {
        if (x1 == 100 || x2 == 100) return "Game over!";
        switch (n) {
            case 1 -> {
                if (die1 != die2) n = 2;
                x1 = getPosition(x1 + die1 + die2);
                if (x1 == 100) return "Player 1 Wins!";
                return "Player 1 is on square " + x1;
            }
            case 2 -> {
                if (die1 != die2) n = 1;
                x2 = getPosition(x2 + die1 + die2);
                if (x2 == 100) return "Player 2 Wins!";
                return "Player 2 is on square " + x2;
            }
        }
        return "";
    }

    private int getPosition(int x) {
        x = (x > 100) ? (200 - x) : x;
        return switch (x) {
            case 2 -> 38;
            case 7 -> 14;
            case 8 -> 31;
            case 15 -> 26;
            case 16 -> 6;
            case 21 -> 42;
            case 28 -> 84;
            case 36 -> 44;
            case 46 -> 25;
            case 49 -> 11;
            case 51 -> 67;
            case 62 -> 19;
            case 64 -> 60;
            case 71 -> 91;
            case 74 -> 53;
            case 78 -> 98;
            case 87 -> 94;
            case 89 -> 68;
            case 92 -> 88;
            case 95 -> 75;
            case 99 -> 80;
            default -> x;
        };
    }
}
