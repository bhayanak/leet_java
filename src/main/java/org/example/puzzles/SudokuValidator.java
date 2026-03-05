package org.example.puzzles;

import java.util.HashSet;
import java.util.Set;

/**
 * SudokuValidator
 *
 * Problem: Given a 9x9 Sudoku board, check if it is valid (no duplicate numbers in rows, columns, or 3x3 subgrids).
 *
 * Approach: Use sets to track seen numbers for each row, column, and subgrid.
 * This is a classic grid validation problem, testing 2D array manipulation and set usage.
 *
 * Example:
 *   isValidSudoku(new int[9][9]) -&gt; true (empty board is valid)
 */
public class SudokuValidator {
    /**
     * Validates a 9x9 Sudoku board.
     * @param board 9x9 int array (0 for empty)
     * @return true if valid, false otherwise
     */
    public static boolean isValidSudoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Integer> row = new HashSet<>();
            Set<Integer> col = new HashSet<>();
            Set<Integer> box = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                // Check row for duplicates
                if (board[i][j] != 0 && !row.add(board[i][j])) return false;
                // Check column for duplicates
                if (board[j][i] != 0 && !col.add(board[j][i])) return false;
                // Check 3x3 box for duplicates
                int r = 3 * (i / 3) + j / 3;
                int c = 3 * (i % 3) + j % 3;
                if (board[r][c] != 0 && !box.add(board[r][c])) return false;
            }
        }
        return true;
    }

    /**
     * Main method to demonstrate Sudoku validation.
     */
    public static void main(String[] args) {
        int[][] board = new int[9][9];
        System.out.println(isValidSudoku(board)); // true (empty board)
    }
}
