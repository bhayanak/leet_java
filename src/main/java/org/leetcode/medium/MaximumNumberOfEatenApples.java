package org.leetcode.medium;


/**
 * <b>#1705 - Maximum Number of Eaten Apples</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a special kind of apple tree that grows apples every day for n days. On the ith day, the tree grows apples[i] apples that will rot after days[i] days, that is on day i + days[i] the apples will be rotten and cannot be eaten. On some days, the apple tree does not grow any apples, which are denoted by apples[i] == 0 and days[i] == 0.
 *
 *
 * You decided to eat at most one apple a day (to keep the doctors away). Note that you can keep eating after the first n days.
 *
 *
 * Given two integer arrays days and apples of length n, return the maximum number of apples you can eat.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: apples = [1,2,3,5,2], days = [3,2,1,4,2]
 * Output: 7
 * Explanation: You can eat 7 apples:
 * - On the first day, you eat an apple that grew on the first day.
 * - On the second day, you eat an apple that grew on the second day.
 * - On the third day, you eat an apple that grew on the second day. After this day, the apples that grew on the third day rot.
 * - On the fourth to the seventh days, you eat apples that grew on the fourth day.
 *
 * Example 2:
 *
 * Input: apples = [3,0,0,0,0,2], days = [3,0,0,0,0,2]
 * Output: 5
 * Explanation: You can eat 5 apples:
 * - On the first to the third day you eat apples that grew on the first day.
 * - Do nothing on the fouth and fifth days.
 * - On the sixth and seventh days you eat apples that grew on the sixth day.
 *
 *
 *
 * Constraints:
 *
 *
 * n == apples.length == days.length
 *
 * 1 &lt;= n &lt;= 2 * 104
 *
 * 0 &lt;= apples[i], days[i] &lt;= 2 * 104
 *
 * days[i] = 0 if and only if apples[i] = 0.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It's optimal to finish the apples that will rot first before those that will rot last
 * Hint 2: You need a structure to keep the apples sorted by their finish time
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-eaten-apples/">LeetCode #1705</a>
 */
public class MaximumNumberOfEatenApples {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Eaten Apples");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfEatenApples ===");
        MaximumNumberOfEatenApples sol = new MaximumNumberOfEatenApples();
        System.out.println(sol.solve(null));
    }
}
