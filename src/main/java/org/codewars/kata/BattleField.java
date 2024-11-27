package org.codewars.kata;

public class BattleField {
    static int[][] field;
    public static boolean fieldValidator(int[][] field) {
        BattleField.field = field;
        int battleship = 1, cruiser = 2, destroyer = 3, submarine = 4;
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (hasShip(y, x)) {
                    if (hasShip(y + 1, x + 1) || hasShip(y + 1, x - 1)) return false;
                }
            }
        }
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (hasShip(y, x)) {
                    field[y][x] = 0;
                    int count = 1;
                    while (hasShip(y + count, x)) {
                        field[y + count][x] = 0;
                        count++;
                    }
                    if (count == 1) {
                        while (hasShip(y,x + count)) {
                            field[y][x + count] = 0;
                            count++;
                        }
                    }
                    switch (count) {
                        case 4 -> battleship--;
                        case 3 -> cruiser--;
                        case 2 -> destroyer--;
                        case 1 -> submarine--;
                        default -> {
                            return false;
                        }
                    }
                }
            }
        }
        return battleship == 0 && cruiser == 0 && destroyer == 0 && submarine == 0;
    }
    
    private static boolean hasShip(int y, int x) {
        if (y >= 10 || y < 0 || x >= 10 || x < 0) {
            return false;
        }
        return field[y][x] == 1;
    }
}
