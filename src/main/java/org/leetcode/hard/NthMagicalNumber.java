package org.leetcode.hard;


/**
 * <b>#878 - Nth Magical Number</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A positive integer is magical if it is divisible by either a or b.
 *
 *
 * Given the three integers n, a, and b, return the nth magical number. Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1, a = 2, b = 3
 * Output: 2
 *
 * Example 2:
 *
 * Input: n = 4, a = 2, b = 3
 * Output: 6
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 109
 *
 * 2 &lt;= a, b &lt;= 4 * 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Binary Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/nth-magical-number/">LeetCode #878</a>
 */
public class NthMagicalNumber {

    /**
     * TODO: Implement "Nth Magical Number".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Nth Magical Number");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac NthMagicalNumber.java &amp;&amp; java org.leetcode.hard.NthMagicalNumber</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== NthMagicalNumber ===");
        NthMagicalNumber sol = new NthMagicalNumber();
        System.out.println(sol.solve(null));
    }
}
