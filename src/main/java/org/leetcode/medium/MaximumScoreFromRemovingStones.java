package org.leetcode.medium;


/**
 * <b>#1753 - Maximum Score From Removing Stones</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Greedy, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are playing a solitaire game with three piles of stones of sizes a​​​​​​, b,​​​​​​ and c​​​​​​ respectively. Each turn you choose two different non-empty piles, take one stone from each, and add 1 point to your score. The game stops when there are fewer than two non-empty piles (meaning there are no more available moves).
 *
 *
 * Given three integers a​​​​​, b,​​​​​ and c​​​​​, return the maximum score you can get.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: a = 2, b = 4, c = 6
 * Output: 6
 * Explanation: The starting state is (2, 4, 6). One optimal set of moves is:
 * - Take from 1st and 3rd piles, state is now (1, 4, 5)
 * - Take from 1st and 3rd piles, state is now (0, 4, 4)
 * - Take from 2nd and 3rd piles, state is now (0, 3, 3)
 * - Take from 2nd and 3rd piles, state is now (0, 2, 2)
 * - Take from 2nd and 3rd piles, state is now (0, 1, 1)
 * - Take from 2nd and 3rd piles, state is now (0, 0, 0)
 * There are fewer than two non-empty piles, so the game ends. Total: 6 points.
 *
 * Example 2:
 *
 * Input: a = 4, b = 4, c = 6
 * Output: 7
 * Explanation: The starting state is (4, 4, 6). One optimal set of moves is:
 * - Take from 1st and 2nd piles, state is now (3, 3, 6)
 * - Take from 1st and 3rd piles, state is now (2, 3, 5)
 * - Take from 1st and 3rd piles, state is now (1, 3, 4)
 * - Take from 1st and 3rd piles, state is now (0, 3, 3)
 * - Take from 2nd and 3rd piles, state is now (0, 2, 2)
 * - Take from 2nd and 3rd piles, state is now (0, 1, 1)
 * - Take from 2nd and 3rd piles, state is now (0, 0, 0)
 * There are fewer than two non-empty piles, so the game ends. Total: 7 points.
 *
 * Example 3:
 *
 * Input: a = 1, b = 8, c = 8
 * Output: 8
 * Explanation: One optimal set of moves is to take from the 2nd and 3rd piles for 8 turns until they are empty.
 * After that, there are fewer than two non-empty piles, so the game ends.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= a, b, c &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It's optimal to always remove one stone from the biggest 2 piles
 * Hint 2: Note that the limits are small enough for simulation
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Greedy, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-score-from-removing-stones/">LeetCode #1753</a>
 */
public class MaximumScoreFromRemovingStones {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Score From Removing Stones");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumScoreFromRemovingStones ===");
        MaximumScoreFromRemovingStones sol = new MaximumScoreFromRemovingStones();
        System.out.println(sol.solve(null));
    }
}
