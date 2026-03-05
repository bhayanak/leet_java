package org.leetcode.medium;


/**
 * <b>#1138 - Alphabet Board Path</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * On an alphabet board, we start at position (0, 0), corresponding to character board[0][0].
 *
 *
 * Here, board = ["abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"], as shown in the diagram below.
 *
 *
 *
 *
 *
 * We may make the following moves:
 *
 *
 *
 *
 * 'U' moves our position up one row, if the position exists on the board;
 *
 * 'D' moves our position down one row, if the position exists on the board;
 *
 * 'L' moves our position left one column, if the position exists on the board;
 *
 * 'R' moves our position right one column, if the position exists on the board;
 *
 * '!' adds the character board[r][c] at our current position (r, c) to the answer.
 *
 *
 *
 * (Here, the only positions that exist on the board are positions with letters on them.)
 *
 *
 * Return a sequence of moves that makes our answer equal to target in the minimum number of moves.  You may return any path that does so.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: target = "leet"
 * Output: "DDR!UURRR!!DDD!"
 *
 *
 * Example 2:
 *
 * Input: target = "code"
 * Output: "RR!DDRR!UUL!R!"
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * 1 &lt;= target.length &lt;= 100
 *
 * target consists only of English lowercase letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create a hashmap from letter to position on the board.
 * Hint 2: Now for each letter, try moving there in steps, where at each step you check if it is inside the boundaries of the board.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/alphabet-board-path/">LeetCode #1138</a>
 */
public class AlphabetBoardPath {

    /**
     * TODO: Implement "Alphabet Board Path".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Alphabet Board Path");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac AlphabetBoardPath.java &amp;&amp; java org.leetcode.medium.AlphabetBoardPath</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== AlphabetBoardPath ===");
        AlphabetBoardPath sol = new AlphabetBoardPath();
        System.out.println(sol.solve(null));
    }
}
