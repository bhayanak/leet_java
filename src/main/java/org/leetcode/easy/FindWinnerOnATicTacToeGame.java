package org.leetcode.easy;


/**
 * <b>#1275 - Find Winner on a Tic Tac Toe Game</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Matrix, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Tic-tac-toe is played by two players A and B on a 3 x 3 grid. The rules of Tic-Tac-Toe are:
 *
 *
 * Players take turns placing characters into empty squares ' '.
 *
 * The first player A always places 'X' characters, while the second player B always places 'O' characters.
 *
 * 'X' and 'O' characters are always placed into empty squares, never on filled ones.
 *
 * The game ends when there are three of the same (non-empty) character filling any row, column, or diagonal.
 *
 * The game also ends if all squares are non-empty.
 *
 * No more moves can be played if the game is over.
 *
 * Given a 2D integer array moves where moves[i] = [rowi, coli] indicates that the ith move will be played on grid[rowi][coli]. return the winner of the game if it exists (A or B). In case the game ends in a draw return "Draw". If there are still movements to play return "Pending".
 *
 *
 * You can assume that moves is valid (i.e., it follows the rules of Tic-Tac-Toe), the grid is initially empty, and A will play first.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: moves = [[0,0],[2,0],[1,1],[2,1],[2,2]]
 * Output: "A"
 * Explanation: A wins, they always play first.
 *
 * Example 2:
 *
 * Input: moves = [[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]
 * Output: "B"
 * Explanation: B wins.
 *
 * Example 3:
 *
 * Input: moves = [[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2],[2,2]]
 * Output: "Draw"
 * Explanation: The game ends in a draw since there are no moves to make.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= moves.length &lt;= 9
 *
 * moves[i].length == 2
 *
 * 0 &lt;= rowi, coli &lt;= 2
 *
 * There are no repeated elements on moves.
 *
 * moves follow the rules of tic tac toe.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It's straightforward to check if A or B won or not, check for each row/column/diag if all the three are the same.
 * Hint 2: Then if no one wins, the game is a draw iff the board is full, i.e. moves.length = 9 otherwise is pending.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Matrix, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/">LeetCode #1275</a>
  *
  * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
  */
public class FindWinnerOnATicTacToeGame {

    /**
     * Solves the problem: Tictactoe.
     *
     * @param moves the moves (int[][])
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public String tictactoe(int[][] moves) {
        int[][] rows=new int[2][3], cols=new int[2][3];
        int[] diag=new int[2], anti=new int[2];
        int n=3;
        for (int i=0;i<moves.length;i++) {
            int r=moves[i][0], c=moves[i][1], p=i%2;
            if (++rows[p][r]==n || ++cols[p][c]==n) return p==0?"A":"B";
            if (r==c && ++diag[p]==n) return p==0?"A":"B";
            if (r+c==n-1 && ++anti[p]==n) return p==0?"A":"B";
        }
        return moves.length==9?"Draw":"Pending";
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        FindWinnerOnATicTacToeGame sol = new FindWinnerOnATicTacToeGame();
                System.out.println(sol.tictactoe(new int[][]{{0,0},{2,0},{1,1},{2,1},{2,2}})); // "A"
                System.out.println(sol.tictactoe(new int[][]{{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}})); // "B"
                System.out.println(sol.tictactoe(new int[][]{{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}})); // "Draw"
    }
}
