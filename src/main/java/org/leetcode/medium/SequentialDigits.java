package org.leetcode.medium;


/**
 * <b>#1291 - Sequential Digits</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * An integer has sequential digits if and only if each digit in the number is one more than the previous digit.
 *
 *
 * Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: low = 100, high = 300
 * Output: [123,234]
 *
 *
 * Example 2:
 *
 * Input: low = 1000, high = 13000
 * Output: [1234,2345,3456,4567,5678,6789,12345]
 *
 *
 *
 * Constraints:
 *
 *
 * 10 &lt;= low &lt;= high &lt;= 10^9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Generate all numbers with sequential digits and check if they are in the given range.
 * Hint 2: Fix the starting digit then do a recursion that tries to append all valid digits.
 *
 * <h2>Approach</h2>
 * Think about the category (Enumeration).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sequential-digits/">LeetCode #1291</a>
 */
public class SequentialDigits {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sequential Digits");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SequentialDigits ===");
        SequentialDigits sol = new SequentialDigits();
        System.out.println(sol.solve(null));
    }
}
