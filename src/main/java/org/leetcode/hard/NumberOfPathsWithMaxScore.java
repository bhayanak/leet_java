package org.leetcode.hard;


/**
 * <b>#1301 - Number of Paths with Max Score</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a square board of characters. You can move on the board starting at the bottom right square marked with the character 'S'.
 *
 *
 * You need to reach the top left square marked with the character 'E'. The rest of the squares are labeled either with a numeric character 1, 2, ..., 9 or with an obstacle 'X'. In one move you can go up, left or up-left (diagonally) only if there is no obstacle there.
 *
 *
 * Return a list of two integers: the first integer is the maximum sum of numeric characters you can collect, and the second is the number of such paths that you can take to get that maximum sum, taken modulo 10^9 + 7.
 *
 *
 * In case there is no path, return [0, 0].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: board = ["E23","2X2","12S"]
 * Output: [7,1]
 *
 *
 * Example 2:
 *
 * Input: board = ["E12","1X1","21S"]
 * Output: [4,2]
 *
 *
 * Example 3:
 *
 * Input: board = ["E11","XXX","11S"]
 * Output: [0,0]
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
 * 2 &lt;= board.length == board[i].length &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming to find the path with the max score.
 * Hint 2: Use another dynamic programming array to count the number of paths with max score.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-paths-with-max-score/">LeetCode #1301</a>
 */
public class NumberOfPathsWithMaxScore {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Paths with Max Score");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfPathsWithMaxScore ===");
        NumberOfPathsWithMaxScore sol = new NumberOfPathsWithMaxScore();
        System.out.println(sol.solve(null));
    }
}
