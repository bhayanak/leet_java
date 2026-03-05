package org.leetcode.medium;


/**
 * <b>#932 - Beautiful Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Divide and Conquer</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * An array nums of length n is beautiful if:
 *
 *
 * nums is a permutation of the integers in the range [1, n].
 *
 * For every 0 &lt;= i &lt; j &lt; n, there is no index k with i &lt; k &lt; j where 2 * nums[k] == nums[i] + nums[j].
 *
 * Given the integer n, return any beautiful array nums of length n. There will be at least one valid answer for the given n.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4
 * Output: [2,1,4,3]
 *
 *
 * Example 2:
 *
 * Input: n = 5
 * Output: [3,1,2,5,4]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Divide and Conquer).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/beautiful-array/">LeetCode #932</a>
 */
public class BeautifulArray {

    /**
     * TODO: Implement "Beautiful Array".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Beautiful Array");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BeautifulArray.java &amp;&amp; java org.leetcode.medium.BeautifulArray</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== BeautifulArray ===");
        BeautifulArray sol = new BeautifulArray();
        System.out.println(sol.solve(null));
    }
}
