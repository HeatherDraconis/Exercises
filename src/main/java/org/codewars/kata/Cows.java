package org.codewars.kata;

public class Cows {
    static char[][] field;
    public static int[] findWrongWayCow(final char[][] field) {
        Cows.field = field;
        char cow1 = 'x';
        int[] cow1arr = new int[2];
        char cow2 = 'x';
        int[] cow2arr = new int[2];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                char cow = getCow(i, j);
                if (cow != 'x' && (cow != cow1 || cow != cow2)) {
                    if (cow1 == 'x') {
                        cow1 = cow;
                        cow1arr = new int[]{j,i};
                    } else if (cow2 == 'x') {
                        cow2 = cow;
                        cow2arr = new int[]{j,i};
                    } else if (cow1 == cow2) {
                        return new int[]{j,i};
                    } else if (cow != cow1) {
                        return cow1arr;
                    } else if (cow != cow2) {
                        return cow2arr;
                    }
                }
            }
        }
        return new int[]{0,0};
    }

    private static char getCow(int i, int j) {
        if (isCow(i, j, 'c')) {
            if (isCow(i-1, j, 'o') && isCow(i-2, j, 'w')) return 'n';
            if (isCow(i+1, j, 'o') && isCow(i+2, j, 'w')) return 's';
            if (isCow(i, j+1, 'o') && isCow(i, j+2, 'w')) return 'e';
            if (isCow(i, j-1, 'o') && isCow(i, j-2, 'w')) return 'w';
        }
        return 'x';
    }

    private static boolean isCow(int i, int j, char cow) {
        return i >= 0 && i < field.length && j >= 0 && j < field[i].length && field[i][j] == cow;
    }
}