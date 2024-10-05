package org.codewars.kata;

import java.util.Arrays;

public class Matrix {
    public static int determinant(int[][] matrix) {
        if (matrix.length == 1) {
            return matrix[0][0];
        }
        int det = 0;
        int sign = 1;
        for (int i = 0; i < matrix[0].length; i++) {
            int[][] newMatrix = new int[matrix.length - 1][matrix[0].length - 1];
            for (int j = 1; j < matrix.length; j++) {
                for (int k = 0; k < matrix[j].length; k++) {
                    if (k < i) {
                        newMatrix[j - 1][k] = matrix[j][k];
                    }
                    if (k > i) {
                        newMatrix[j - 1][k - 1] = matrix[j][k];
                    }
                }
            }
            det += (sign * matrix[0][i] * determinant(newMatrix));
            sign *= -1;
        }
        return det;
    }
}
