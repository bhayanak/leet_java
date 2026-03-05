package org.leetcode.medium;


/**
 * <b>#1936 - Add Minimum Number of Rungs</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a strictly increasing integer array rungs that represents the height of rungs on a ladder. You are currently on the floor at height 0, and you want to reach the last rung.
 *
 *
 * You are also given an integer dist. You can only climb to the next highest rung if the distance between where you are currently at (the floor or on a rung) and the next rung is at most dist. You are able to insert rungs at any positive integer height if a rung is not already there.
 *
 *
 * Return the minimum number of rungs that must be added to the ladder in order for you to climb to the last rung.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: rungs = [1,3,5,10], dist = 2
 * Output: 2
 * Explanation:
 * You currently cannot reach the last rung.
 * Add rungs at heights 7 and 8 to climb this ladder. 
 * The ladder will now have rungs at [1,3,5,7,8,10].
 *
 * Example 2:
 *
 * Input: rungs = [3,6,8,10], dist = 3
 * Output: 0
 * Explanation:
 * This ladder can be climbed without adding additional rungs.
 *
 * Example 3:
 *
 * Input: rungs = [3,4,6,7], dist = 2
 * Output: 1
 * Explanation:
 * You currently cannot reach the first rung from the ground.
 * Add a rung at height 1 to climb this ladder.
 * The ladder will now have rungs at [1,3,4,6,7].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= rungs.length &lt;= 105
 *
 * 1 &lt;= rungs[i] &lt;= 109
 *
 * 1 &lt;= dist &lt;= 109
 *
 * rungs is strictly increasing.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Go as far as you can on the available rungs before adding new rungs.
 * Hint 2: If you have to add a new rung, add it as high up as possible.
 * Hint 3: Try using division to decrease the number of computations.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/add-minimum-number-of-rungs/">LeetCode #1936</a>
 */
public class AddMinimumNumberOfRungs {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Add Minimum Number of Rungs");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== AddMinimumNumberOfRungs ===");
        AddMinimumNumberOfRungs sol = new AddMinimumNumberOfRungs();
        System.out.println(sol.solve(null));
    }
}
