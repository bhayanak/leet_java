package org.leetcode.medium;


/**
 * <b>#2443 - Sum of Number and Its Reverse</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a non-negative integer num, return true if num can be expressed as the sum of any non-negative integer and its reverse, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = 443
 * Output: true
 * Explanation: 172 + 271 = 443 so we return true.
 *
 * Example 2:
 *
 * Input: num = 63
 * Output: false
 * Explanation: 63 cannot be expressed as the sum of a non-negative integer and its reverse so we return false.
 *
 * Example 3:
 *
 * Input: num = 181
 * Output: true
 * Explanation: 140 + 041 = 181 so we return true. Note that when a number is reversed, there may be leading zeros.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= num &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The constraints are small enough that we can check every number.
 * Hint 2: To reverse a number, first convert it to a string. Then, create a new string that is the reverse of the first one. Finally, convert the new string back into a number.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/sum-of-number-and-its-reverse/">LeetCode #2443</a>
 */
public class SumOfNumberAndItsReverse {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Number and Its Reverse");
    }

    public static void main(String[] args) {
        System.out.println("=== SumOfNumberAndItsReverse ===");
        SumOfNumberAndItsReverse sol = new SumOfNumberAndItsReverse();
        System.out.println(sol.solve(null));
    }
}
