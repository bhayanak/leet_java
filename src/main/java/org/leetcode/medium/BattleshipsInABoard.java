package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #419: Battleships in a Board
 * @see <a href="https://leetcode.com/problems/battleships-in-a-board/">Problem</a>
 */
public class BattleshipsInABoard {

    /**
     * LeetCode #419 – Battleships in a Board
     * Difficulty: MEDIUM
     * Topics: Array, Depth-First Search, Matrix
     *
     * Given an m x n matrix board where each cell is a battleship 'X' or empty
     * '.', return the number of the battleships on board.
     * 
     * 
     * Battleships can only be placed horizontally or vertically on board. In
     * other words, they can only be made of the shape 1 x k (1 row, k columns) or
     * k x 1 (k rows, 1 column), where k can be of any size. At least one
     * horizontal or vertical cell separates between two battleships (i.e., there
     * are no adjacent battleships).
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: board = [["X",".",".","X"],[".",".",".","X"],[".",".",".","X"]]
     * Output: 2
     * 
     * Example 2:
     * 
     * Input: board = [["."]]
     * Output: 0
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * m == board.length
     * 
     * n == board[i].length
     * 
     * 1 &lt;= m, n &lt;= 200
     * 
     * board[i][j] is either '.' or 'X'.
     * 
     * 
     * 
     * Follow up: Could you do it in one-pass, using only O(1) extra memory and
     * without modifying the values board?
     */
    // Count 'X' cells that have no 'X' above or to the left (they're heads of ships)
    /**
     * Counts Count battleships.
     *
     * @param board the board (char[][])
     * @return the computed int result
     */
    public int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'X' &&
                    (i == 0 || board[i-1][j] == '.') &&
                    (j == 0 || board[i][j-1] == '.'))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        BattleshipsInABoard sol = new BattleshipsInABoard();
        System.out.println(sol.countBattleships(new char[][]{{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}}));
    }
}
