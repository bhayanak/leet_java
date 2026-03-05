package org.leetcode.easy;

/** AvailableCapturesForRook solution. */
public class AvailableCapturesForRook {
    /**
     * Returns the maximum number of pawns the rook can capture in one move.
     *
     * @param board 8×8 chessboard
     * @return number of pawns the rook can capture
     *
     * <p><b>Explanation:</b> Finds the rook 'R', then scans in all four directions until</p>
     *   hitting a bishop 'B' (blocks) or pawn 'p' (count capture). Time O(n^2), Space O(1).
     */
    public int numRookCaptures(char[][] board) {
        int rx = 0, ry = 0;
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                if (board[i][j] == 'R') { rx = i; ry = j; }
        int captures = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        for (int[] d : dirs) {
            int x = rx + d[0], y = ry + d[1];
            while (x >= 0 && x < 8 && y >= 0 && y < 8) {
                if (board[x][y] == 'B') break;
                if (board[x][y] == 'p') { captures++; break; }
                x += d[0]; y += d[1];
            }
        }
        return captures;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac AvailableCapturesForRook.java &amp;&amp; java org.leetcode.easy.AvailableCapturesForRook</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== AvailableCapturesForRook ===");
        AvailableCapturesForRook sol = new AvailableCapturesForRook();
        System.out.println(sol.numRookCaptures(null));
    }
}
