package org.leetcode.hard;


/**
 * <b>#1563 - Stone Game V</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming, Game Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are several stones arranged in a row, and each stone has an associated value which is an integer given in the array stoneValue.
 *
 *
 * In each round of the game, Alice divides the row into two non-empty rows (i.e. left row and right row), then Bob calculates the value of each row which is the sum of the values of all the stones in this row. Bob throws away the row which has the maximum value, and Alice's score increases by the value of the remaining row. If the value of the two rows are equal, Bob lets Alice decide which row will be thrown away. The next round starts with the remaining row.
 *
 *
 * The game ends when there is only one stone remaining. Alice's score is initially zero.
 *
 *
 * Return the maximum score that Alice can obtain.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: stoneValue = [6,2,3,4,5,5]
 * Output: 18
 * Explanation: In the first round, Alice divides the row to [6,2,3], [4,5,5]. The left row has the value 11 and the right row has value 14. Bob throws away the right row and Alice's score is now 11.
 * In the second round Alice divides the row to [6], [2,3]. This time Bob throws away the left row and Alice's score becomes 16 (11 + 5).
 * The last round Alice has only one choice to divide the row which is [2], [3]. Bob throws away the right row and Alice's score is now 18 (16 + 2). The game ends because only one stone is remaining in the row.
 *
 * Example 2:
 *
 * Input: stoneValue = [7,7,7,7,7,7,7]
 * Output: 28
 *
 * Example 3:
 *
 * Input: stoneValue = [4]
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= stoneValue.length &lt;= 500
 *
 * 1 &lt;= stoneValue[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We need to try all possible divisions for the current row to get the max score.
 * Hint 2: As calculating all possible divisions will lead us to calculate some sub-problems more than once, we need to think of dynamic programming.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Game Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/stone-game-v/">LeetCode #1563</a>
 */
public class StoneGameV {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Stone Game V");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== StoneGameV ===");
        StoneGameV sol = new StoneGameV();
        System.out.println(sol.solve(null));
    }
}
