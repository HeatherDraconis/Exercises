package org.codewars.kata;

import java.util.Arrays;

public class BirdMountainRiver {
    public static int[] dryGround(char[][] terrain) {
        if (terrain.length == 0) {
            return new int[]{0, 0, 0, 0};
        }

        if (!Arrays.deepToString(terrain).contains("-")) {
            int size = terrain.length * terrain[0].length;
            return new int[]{size, size, size, size};
        }

        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if (terrain[i][j] == ' ') {
                    terrain[i][j] = '0';
                }
            }
        }
        addHeights(terrain, '-', '1');
        addHeights(terrain, '0', '1');
        addHeights(terrain, '1', '2');
        addHeights(terrain, '2', '3');

        int[] ground = new int[4];

        for (int river = 0; river < 4; river++) {
            boolean flood;
            int count;
            do {
                count = 0;
                flood = false;
                for (int i = 0; i < terrain.length; i++) {
                    for (int j = 0; j < terrain[i].length; j++) {
                        if (terrain[i][j] != '-' && terrain[i][j] != '^'
                                && Integer.parseInt(String.valueOf(terrain[i][j])) < river
                                && (i != 0 && terrain[i - 1][j] == '-'
                                || j != 0 && terrain[i][j - 1] == '-'
                                || i + 1 != terrain.length && terrain[i + 1][j] == '-'
                                || j + 1 != terrain[i].length && terrain[i][j + 1] == '-')) {
                            terrain[i][j] = '-';
                            flood = true;
                        }
                        if (terrain[i][j] != '-') {
                            count++;
                        }
                    }
                }
            } while (flood);
            ground[river] = count;
        }
        return ground;
    }

    private static void addHeights(char[][] terrain, char adjacent, char value) {
        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if (terrain[i][j] == '^'
                        && (i == 0 || j == 0 || i + 1 == terrain.length || j + 1 == terrain[i].length
                        || terrain[i - 1][j] == adjacent || terrain[i][j - 1] == adjacent
                        || terrain[i + 1][j] == adjacent || terrain[i][j + 1] == adjacent)) {
                    terrain[i][j] = value;
                }
            }
        }
    }
}
