package org.leetcode.hard;


/**
 * <b>#1223 - Dice Roll Simulation</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A die simulator generates a random number from 1 to 6 for each roll. You introduced a constraint to the generator such that it cannot roll the number i more than rollMax[i] (1-indexed) consecutive times.
 *
 *
 * Given an array of integers rollMax and an integer n, return the number of distinct sequences that can be obtained with exact n rolls. Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 * Two sequences are considered different if at least one element differs from each other.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, rollMax = [1,1,2,2,2,3]
 * Output: 34
 * Explanation: There will be 2 rolls of die, if there are no constraints on the die, there are 6 * 6 = 36 possible combinations. In this case, looking at rollMax array, the numbers 1 and 2 appear at most once consecutively, therefore sequences (1,1) and (2,2) cannot occur, so the final answer is 36-2 = 34.
 *
 * Example 2:
 *
 * Input: n = 2, rollMax = [1,1,1,1,1,1]
 * Output: 30
 *
 * Example 3:
 *
 * Input: n = 3, rollMax = [1,1,1,2,2,3]
 * Output: 181
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 5000
 *
 * rollMax.length == 6
 *
 * 1 &lt;= rollMax[i] &lt;= 15
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think on Dynamic Programming.
 * Hint 2: DP(pos, last) which means we are at the position pos having as last the last character seen.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/dice-roll-simulation/">LeetCode #1223</a>
 */
public class DiceRollSimulation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Dice Roll Simulation");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== DiceRollSimulation ===");
        DiceRollSimulation sol = new DiceRollSimulation();
        System.out.println(sol.solve(null));
    }
}
