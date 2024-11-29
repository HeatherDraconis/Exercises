package org.codewars.kata;

import java.util.stream.IntStream;

public class BattleField2 {
    static int[][] field;
    static int battleship, cruiser, destroyer, submarine;

    public static boolean fieldValidator(int[][] field) {
        BattleField2.field = field;
        battleship = 1;
        cruiser = 2;
        destroyer = 3;
        submarine = 4;
        int count = 0;
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (hasShip(field, y, x)) count++;
            }
        }
        if (count != battleship * 4 + cruiser * 3 + destroyer * 2 + submarine) return false;
        return trialShips(field, 4);
    }

    private static boolean trialShips(int[][] inputField, int i) {
        int[][] copyField = copyArray(inputField);
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (hasShip(copyField, y, x)) {
                    copyField[y][x] = 0;
                    int count = 1;
                    while (hasShip(copyField, y + count, x) && count < i) {
                        copyField[y + count][x] = 0;
                        count++;
                    }
                    if (isShip(i, count, copyField)) return true;
                    copyField = copyArray(inputField);
                    copyField[y][x] = 0;
                    count = 1;
                    while (hasShip(copyField, y, x + count) && count < i) {
                        copyField[y][x + count] = 0;
                        count++;
                    }
                    if (isShip(i, count, copyField)) return true;
                    copyField = copyArray(inputField);
                }
            }
        }
        return false;
    }

    private static Boolean isShip(int i, int count, int[][] copyField) {
        if (count == i) {
            switch (count) {
                case 4 -> battleship--;
                case 3 -> cruiser--;
                case 2 -> destroyer--;
                case 1 -> submarine--;
            }
            if (cruiser > 0) {
                if (trialShips(copyField, 3)) return true;
            } else if (destroyer > 0) {
                if (trialShips(copyField, 2)) return true;
            } else if (submarine > 0) {
                if (trialShips(copyField, 1)) return true;
            } else {
                return true;
            }
            switch (count) {
                case 4 -> battleship++;
                case 3 -> cruiser++;
                case 2 -> destroyer++;
                case 1 -> submarine++;
            }
        }
        return false;
    }

    private static int[][] copyArray(int[][] inputField) {
        int[][] copyField = new int[10][10];
        IntStream.range(0, 10).forEach(y -> System.arraycopy(inputField[y], 0, copyField[y], 0, 10));
        return copyField;
    }

    private static boolean hasShip(int[][] field, int y, int x) {
        if (y >= 10 || y < 0 || x >= 10 || x < 0) {
            return false;
        }
        return field[y][x] == 1;
    }
}