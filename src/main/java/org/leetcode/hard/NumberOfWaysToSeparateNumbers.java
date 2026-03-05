package org.leetcode.hard;


/**
 * <b>#1977 - Number of Ways to Separate Numbers</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming, Suffix Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You wrote down many positive integers in a string called num. However, you realized that you forgot to add commas to seperate the different numbers. You remember that the list of integers was non-decreasing and that no integer had leading zeros.
 *
 *
 * Return the number of possible lists of integers that you could have written down to get the string num. Since the answer may be large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = "327"
 * Output: 2
 * Explanation: You could have written down the numbers:
 * 3, 27
 * 327
 *
 * Example 2:
 *
 * Input: num = "094"
 * Output: 0
 * Explanation: No numbers can have leading zeros and all numbers must be positive.
 *
 * Example 3:
 *
 * Input: num = "0"
 * Output: 0
 * Explanation: No numbers can have leading zeros and all numbers must be positive.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num.length &lt;= 3500
 *
 * num consists of digits '0' through '9'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If we know the current number has d digits, how many digits can the previous number have?
 * Hint 2: Is there a quick way of calculating the number of possibilities for the previous number if we know that it must have less than or equal to d digits? Try to do some pre-processing.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, Suffix Array).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-ways-to-separate-numbers/">LeetCode #1977</a>
 */
public class NumberOfWaysToSeparateNumbers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Ways to Separate Numbers");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfWaysToSeparateNumbers ===");
        NumberOfWaysToSeparateNumbers sol = new NumberOfWaysToSeparateNumbers();
        System.out.println(sol.solve(null));
    }
}
