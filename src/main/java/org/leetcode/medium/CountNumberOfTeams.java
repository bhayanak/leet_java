package org.leetcode.medium;


/**
 * <b>#1395 - Count Number of Teams</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Binary Indexed Tree, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n soldiers standing in a line. Each soldier is assigned a unique rating value.
 *
 *
 * You have to form a team of 3 soldiers amongst them under the following rules:
 *
 *
 * Choose 3 soldiers with index (i, j, k) with rating (rating[i], rating[j], rating[k]).
 *
 * A team is valid if: (rating[i] &lt; rating[j] &lt; rating[k]) or (rating[i] &gt; rating[j] &gt; rating[k]) where (0 &lt;= i &lt; j &lt; k &lt; n).
 *
 * Return the number of teams you can form given the conditions. (soldiers can be part of multiple teams).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: rating = [2,5,3,4,1]
 * Output: 3
 * Explanation: We can form three teams given the conditions. (2,3,4), (5,4,1), (5,3,1). 
 *
 * Example 2:
 *
 * Input: rating = [2,1,3]
 * Output: 0
 * Explanation: We can't form any team given the conditions.
 *
 * Example 3:
 *
 * Input: rating = [1,2,3,4]
 * Output: 4
 *
 *
 *
 * Constraints:
 *
 *
 * n == rating.length
 *
 * 3 &lt;= n &lt;= 1000
 *
 * 1 &lt;= rating[i] &lt;= 105
 *
 * All the integers in rating are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: BruteForce, check all possibilities.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Binary Indexed Tree, Segment Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-number-of-teams/">LeetCode #1395</a>
 */
public class CountNumberOfTeams {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Number of Teams");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountNumberOfTeams ===");
        CountNumberOfTeams sol = new CountNumberOfTeams();
        System.out.println(sol.solve(null));
    }
}
