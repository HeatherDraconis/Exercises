package org.codewars.kata;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SudokuSolver {
    public static int[][] sudoku(int[][] puzzle) {
        boolean hasZero = false;
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                if (puzzle[x][y] == 0) {
                    Set<Integer> values = IntStream.rangeClosed(1, 9).boxed().collect(Collectors.toSet());
                    for (int k = 0; k < 9; k++) {
                        values.remove(puzzle[x][k]);
                        values.remove(puzzle[k][y]);
                    }
                    switch (x) {
                        case 0, 1, 2 -> {
                            switch (y) {
                                case 0, 1, 2 -> {
                                    IntStream.range(0, 3).forEach(i -> Arrays.stream(puzzle[i], 0, 3).forEach(values::remove));
                                }
                                case 3, 4, 5 -> {
                                    IntStream.range(0, 3).forEach(i -> Arrays.stream(puzzle[i], 3, 6).forEach(values::remove));
                                }
                                case 6, 7, 8 -> {
                                    IntStream.range(0, 3).forEach(i -> Arrays.stream(puzzle[i], 6, 9).forEach(values::remove));
                                }
                            }
                        }
                        case 3, 4, 5 -> {
                            switch (y) {
                                case 0, 1, 2 -> {
                                    IntStream.range(3, 6).forEach(i -> Arrays.stream(puzzle[i], 0, 3).forEach(values::remove));
                                }
                                case 3, 4, 5 -> {
                                    IntStream.range(3, 6).forEach(i -> Arrays.stream(puzzle[i], 3, 6).forEach(values::remove));
                                }
                                case 6, 7, 8 -> {
                                    IntStream.range(3, 6).forEach(i -> Arrays.stream(puzzle[i], 6, 9).forEach(values::remove));
                                }
                            }
                        }
                        case 6, 7, 8 -> {
                            switch (y) {
                                case 0, 1, 2 -> {
                                    IntStream.range(6, 9).forEach(i -> Arrays.stream(puzzle[i], 0, 3).forEach(values::remove));
                                }
                                case 3, 4, 5 -> {
                                    IntStream.range(6, 9).forEach(i -> Arrays.stream(puzzle[i], 3, 6).forEach(values::remove));
                                }
                                case 6, 7, 8 -> {
                                    IntStream.range(6, 9).forEach(i -> Arrays.stream(puzzle[i], 6, 9).forEach(values::remove));
                                }
                            }
                        }
                    }
                    if (values.size() == 1) {
                        puzzle[x][y] = Integer.parseInt(values.toString().replaceAll("[\\[\\]]", ""));
                    } else {
                        hasZero = true;
                    }
                }
            }
        }
        return hasZero ? sudoku(puzzle) : puzzle;
    }
}
