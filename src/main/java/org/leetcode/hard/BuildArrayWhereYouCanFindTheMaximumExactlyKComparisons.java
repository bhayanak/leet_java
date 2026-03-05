package org.leetcode.hard;


/**
 * <b>#1420 - Build Array Where You Can Find The Maximum Exactly K Comparisons</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given three integers n, m and k. Consider the following algorithm to find the maximum element of an array of positive integers:
 *
 *
 * You should build the array arr which has the following properties:
 *
 *
 * arr has exactly n integers.
 *
 * 1 &lt;= arr[i] &lt;= m where (0 &lt;= i &lt; n).
 *
 * After applying the mentioned algorithm to arr, the value search_cost is equal to k.
 *
 * Return the number of ways to build the array arr under the mentioned conditions. As the answer may grow large, the answer must be computed modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, m = 3, k = 1
 * Output: 6
 * Explanation: The possible arrays are [1, 1], [2, 1], [2, 2], [3, 1], [3, 2] [3, 3]
 *
 * Example 2:
 *
 * Input: n = 5, m = 2, k = 3
 * Output: 0
 * Explanation: There are no possible arrays that satisfy the mentioned conditions.
 *
 * Example 3:
 *
 * Input: n = 9, m = 1, k = 1
 * Output: 1
 * Explanation: The only possible array is [1, 1, 1, 1, 1, 1, 1, 1, 1]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 50
 *
 * 1 &lt;= m &lt;= 100
 *
 * 0 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming approach. Build dp table where dp[a][b][c] is the number of ways you can start building the array starting from index a where the search_cost = c and the maximum used integer was b.
 * Hint 2: Recursively, solve the small sub-problems first. Optimize your answer by stopping the search if you exceeded k changes.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/build-array-where-you-can-find-the-maximum-exactly-k-comparisons/">LeetCode #1420</a>
 */
public class BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Build Array Where You Can Find The Maximum Exactly K Comparisons");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons ===");
        BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons sol = new BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons();
        System.out.println(sol.solve(null));
    }
}
