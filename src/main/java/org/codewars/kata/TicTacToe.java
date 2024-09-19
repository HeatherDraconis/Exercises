package org.codewars.kata;

import java.util.Arrays;

public class TicTacToe {
    public static int isSolved(int[][] board) {
        for (int boardValue = 1; boardValue <= 2; boardValue++) {
            if (hasLine(board, boardValue)) {
                return boardValue;
            }
        }
        if (Arrays.deepToString(board).contains("0")) {
            return -1;
        }
        return 0;
    }

    private static boolean hasLine(int[][] board, int boardValue) {
        return containsVerticalLine(board, boardValue) ||
                containsHorizontalLine(board, boardValue) ||
                containsBoardValueDiagonalLeft(board, boardValue) ||
                containsBoardValueDiagonalRight(board, boardValue);
    }

    private static boolean containsVerticalLine(int[][] board, int boardValue) {
        for (int i = 0; i < board.length; i++) {
            if (colIsVerticalLine(board, boardValue, i)) return true;
        }
        return false;
    }

    private static boolean colIsVerticalLine(int[][] board, int boardValue, int i) {
        return Arrays.stream(board).allMatch( row -> row[i] == boardValue);
    }

    private static boolean containsBoardValueDiagonalLeft(int[][] board, int boardValue) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != boardValue) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsBoardValueDiagonalRight(int[][] board, int boardValue) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][board.length - 1 - i] != boardValue) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsHorizontalLine(int[][] board, int boardValue) {
        return Arrays.stream(board).anyMatch( row -> rowAllOfValue(boardValue, row));
    }

    private static boolean rowAllOfValue(int boardValue, int[] row) {
        return Arrays.stream(row).allMatch(cell->cell==boardValue);
    }

    public static int isSolved2(int[][] board) {
        for (int i = 1; i <= 2; i++) {
            if ((board[0][0] == i && board[0][1] == i && board[0][2] == i)
                    || (board[1][0] == i && board[1][1] == i && board[1][2] == i)
                    || (board[2][0] == i && board[2][1] == i && board[2][2] == i)

                    || (board[0][0] == i && board[1][0] == i && board[2][0] == i)
                    || (board[0][1] == i && board[1][1] == i && board[2][1] == i)
                    || (board[0][2] == i && board[1][2] == i && board[2][2] == i)

                    || (board[0][0] == i && board[1][1] == i && board[2][2] == i)
                    || (board[2][0] == i && board[1][1] == i && board[0][2] == i)) {
                return i;
            }
        }
        if(Arrays.stream(board).anyMatch(row-> Arrays.stream(row).anyMatch(cell -> cell == 0))) {
            return -1;
        }
        return 0;
    }
}
