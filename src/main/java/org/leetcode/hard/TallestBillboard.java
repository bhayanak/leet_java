package org.leetcode.hard;


/**
 * <b>#956 - Tallest Billboard</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are installing a billboard and want it to have the largest height. The billboard will have two steel supports, one on each side. Each steel support must be an equal height.
 *
 *
 * You are given a collection of rods that can be welded together. For example, if you have rods of lengths 1, 2, and 3, you can weld them together to make a support of length 6.
 *
 *
 * Return the largest possible height of your billboard installation. If you cannot support the billboard, return 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: rods = [1,2,3,6]
 * Output: 6
 * Explanation: We have two disjoint subsets {1,2,3} and {6}, which have the same sum = 6.
 *
 * Example 2:
 *
 * Input: rods = [1,2,3,4,5,6]
 * Output: 10
 * Explanation: We have two disjoint subsets {2,3,5} and {4,6}, which have the same sum = 10.
 *
 * Example 3:
 *
 * Input: rods = [1,2]
 * Output: 0
 * Explanation: The billboard cannot be supported, so we return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= rods.length &lt;= 20
 *
 * 1 &lt;= rods[i] &lt;= 1000
 *
 * sum(rods[i]) &lt;= 5000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/tallest-billboard/">LeetCode #956</a>
 */
public class TallestBillboard {

    /**
     * TODO: Implement "Tallest Billboard".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Tallest Billboard");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac TallestBillboard.java &amp;&amp; java org.leetcode.hard.TallestBillboard</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== TallestBillboard ===");
        TallestBillboard sol = new TallestBillboard();
        System.out.println(sol.solve(null));
    }
}
