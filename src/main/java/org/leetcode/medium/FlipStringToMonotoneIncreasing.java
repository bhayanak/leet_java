package org.leetcode.medium;


/**
 * <b>#926 - Flip String to Monotone Increasing</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A binary string is monotone increasing if it consists of some number of 0's (possibly none), followed by some number of 1's (also possibly none).
 *
 *
 * You are given a binary string s. You can flip s[i] changing it from 0 to 1 or from 1 to 0.
 *
 *
 * Return the minimum number of flips to make s monotone increasing.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "00110"
 * Output: 1
 * Explanation: We flip the last digit to get 00111.
 *
 * Example 2:
 *
 * Input: s = "010110"
 * Output: 2
 * Explanation: We flip to get 011111, or alternatively 000111.
 *
 * Example 3:
 *
 * Input: s = "00011000"
 * Output: 2
 * Explanation: We flip to get 00000000.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s[i] is either '0' or '1'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/flip-string-to-monotone-increasing/">LeetCode #926</a>
 */
public class FlipStringToMonotoneIncreasing {

    /**
     * TODO: Implement "Flip String to Monotone Increasing".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Flip String to Monotone Increasing");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac FlipStringToMonotoneIncreasing.java &amp;&amp; java org.leetcode.medium.FlipStringToMonotoneIncreasing</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== FlipStringToMonotoneIncreasing ===");
        FlipStringToMonotoneIncreasing sol = new FlipStringToMonotoneIncreasing();
        System.out.println(sol.solve(null));
    }
}
