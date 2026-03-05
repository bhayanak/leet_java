package org.leetcode.medium;

/**
 * <b>#36 - Valid Sudoku</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * 
 * 
 * 	
 * Each row must contain the digits 1-9 without repetition.
 * 	
 * Each column must contain the digits 1-9 without repetition.
 * 	
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * 
 * Note:
 * 
 * 	
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * 	
 * Only the filled cells need to be validated according to the mentioned rules.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: board = 
 * [["5","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: true
 * 
 * Example 2:
 * 
 * Input: board = 
 * [["8","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: false
 * Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * board.length == 9
 * 	
 * board[i].length == 9
 * 	
 * board[i][j] is a digit 1-9 or '.'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Use three sets of sets: one per row, one per column, one per 3×3 box.
 * For each cell, check the digit hasn't appeared in its row, column, or box.
 * Box index: (row/3)*3 + col/3.
 *
 * <h2>Complexity</h2>
* Time: O(81) = O(1)  |  Space: O(81) = O(1)
 *
 * @see <a href="https://leetcode.com/problems/valid-sudoku/">LeetCode #36</a>
 */
public class ValidSudoku {

    /**
     * Validates a 9×9 Sudoku board (partial boards are allowed).
     *
     * @param board 9×9 character grid ('1'-'9' or '.')
     * @return      true if the board is currently valid
     */
    public boolean isValidSudoku(char[][] board) {
        java.util.Set<String> seen = new java.util.HashSet<>();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if (ch == '.') continue;
                // Encode position uniquely for row, column, and box
                if (!seen.add(ch + " row" + r))          return false;
                if (!seen.add(ch + " col" + c))          return false;
                if (!seen.add(ch + " box" + (r/3) + (c/3))) return false;
            }
        }
        return true;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        ValidSudoku sol = new ValidSudoku();
        System.out.println(sol.isValidSudoku(new char[][]{{'.','5','5','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.','.'}}));
    }
}
