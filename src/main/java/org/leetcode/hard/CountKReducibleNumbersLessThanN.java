package org.leetcode.hard;


/**
 * <b>#3352 - Count K-Reducible Numbers Less Than N</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, String, Dynamic Programming, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary string s representing a number n in its binary form.
 *
 *
 * You are also given an integer k.
 *
 *
 * An integer x is called k-reducible if performing the following operation at most k times reduces it to 1:
 *
 *
 * Replace x with the count of set bits in its binary representation.
 *
 * For example, the binary representation of 6 is "110". Applying the operation once reduces it to 2 (since "110" has two set bits). Applying the operation again to 2 (binary "10") reduces it to 1 (since "10" has one set bit).
 *
 *
 * Return an integer denoting the number of positive integers less than n that are k-reducible.
 *
 *
 * Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "111", k = 1
 *
 *
 * Output: 3
 *
 *
 * Explanation: 
 *
 *
 * n = 7. The 1-reducible integers less than 7 are 1, 2, and 4.
 *
 * Example 2:
 *
 * Input: s = "1000", k = 2
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * n = 8. The 2-reducible integers less than 8 are 1, 2, 3, 4, 5, and 6.
 *
 * Example 3:
 *
 * Input: s = "1", k = 3
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * There are no positive integers less than n = 1, so the answer is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 800
 *
 * s has no leading zeros.
 *
 * s consists only of the characters '0' and '1'.
 *
 * 1 &lt;= k &lt;= 5
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You can precompute number of operations required to convert a number with <code>x</code> bits to 1.
 * Hint 2: Use digit dp.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Dynamic Programming, Combinatorics).
 *
 * @see <a href="https://leetcode.com/problems/count-k-reducible-numbers-less-than-n/">LeetCode #3352</a>
 */
public class CountKReducibleNumbersLessThanN {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count K-Reducible Numbers Less Than N");
    }

    public static void main(String[] args) {
        System.out.println("=== CountKReducibleNumbersLessThanN ===");
        CountKReducibleNumbersLessThanN sol = new CountKReducibleNumbersLessThanN();
        System.out.println(sol.solve(null));
    }
}
