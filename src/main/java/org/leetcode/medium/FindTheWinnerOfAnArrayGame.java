package org.leetcode.medium;


/**
 * <b>#1535 - Find the Winner of an Array Game</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array arr of distinct integers and an integer k.
 *
 *
 * A game will be played between the first two elements of the array (i.e. arr[0] and arr[1]). In each round of the game, we compare arr[0] with arr[1], the larger integer wins and remains at position 0, and the smaller integer moves to the end of the array. The game ends when an integer wins k consecutive rounds.
 *
 *
 * Return the integer which will win the game.
 *
 *
 * It is guaranteed that there will be a winner of the game.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [2,1,3,5,4,6,7], k = 2
 * Output: 5
 * Explanation: Let's see the rounds of the game:
 * Round |       arr       | winner | win_count
 *   1   | [2,1,3,5,4,6,7] | 2      | 1
 *   2   | [2,3,5,4,6,7,1] | 3      | 1
 *   3   | [3,5,4,6,7,1,2] | 5      | 1
 *   4   | [5,4,6,7,1,2,3] | 5      | 2
 * So we can see that 4 rounds will be played and 5 is the winner because it wins 2 consecutive games.
 *
 * Example 2:
 *
 * Input: arr = [3,2,1], k = 10
 * Output: 3
 * Explanation: 3 will win the first 10 rounds consecutively.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= arr.length &lt;= 105
 *
 * 1 &lt;= arr[i] &lt;= 106
 *
 * arr contains distinct integers.
 *
 * 1 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If k ≥ arr.length return the max element of the array.
 * Hint 2: If k &lt; arr.length simulate the game until a number wins k consecutive games.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-the-winner-of-an-array-game/">LeetCode #1535</a>
 */
public class FindTheWinnerOfAnArrayGame {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Winner of an Array Game");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindTheWinnerOfAnArrayGame ===");
        FindTheWinnerOfAnArrayGame sol = new FindTheWinnerOfAnArrayGame();
        System.out.println(sol.solve(null));
    }
}
