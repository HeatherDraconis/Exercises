package org.codewars.kata;

public class Spiralizor {
    public static int[][] spiralize(int size) {
        int[][] spiral = new int[size][size];
        int change = 0;
        while (true){
            if (size <= 2 * change) {
                break;
            }
            for (int i = size - change - 1; i >= change - 1 &&  i >= 0; i--) {
                spiral[change][i] = 1;
            }
            for (int i = change + 1; i < size - change; i++) {
                spiral[i][size - change - 1] = 1;
            }
            if (size - 2 <= 2 * change) {
                break;
            }
            for (int i = change; i < size - change - 1; i++) {
                spiral[size - change - 1][i] = 1;
            }
            for (int i = change + 2; i < size - change - 1; i++) {
                spiral[i][change] = 1;
            }
            change += 2;
        }
        return spiral;
    }
}
