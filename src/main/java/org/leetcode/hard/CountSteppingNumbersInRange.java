package org.leetcode.hard;


/**
 * <b>#2801 - Count Stepping Numbers in Range</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two positive integers low and high represented as strings, find the count of stepping numbers in the inclusive range [low, high].
 *
 *
 * A stepping number is an integer such that all of its adjacent digits have an absolute difference of exactly 1.
 *
 *
 * Return an integer denoting the count of stepping numbers in the inclusive range [low, high]. 
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 * Note: A stepping number should not have a leading zero.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: low = "1", high = "11"
 * Output: 10
 * Explanation: The stepping numbers in the range [1,11] are 1, 2, 3, 4, 5, 6, 7, 8, 9 and 10. There are a total of 10 stepping numbers in the range. Hence, the output is 10.
 *
 * Example 2:
 *
 * Input: low = "90", high = "101"
 * Output: 2
 * Explanation: The stepping numbers in the range [90,101] are 98 and 101. There are a total of 2 stepping numbers in the range. Hence, the output is 2. 
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= int(low) &lt;= int(high) &lt; 10100
 *
 * 1 &lt;= low.length, high.length &lt;= 100
 *
 * low and high consist of only digits.
 *
 * low and high don't have any leading zeros.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Calculate the number of stepping numbers in the range [1, high] and subtract the number of stepping numbers in the range [1, low - 1].
 * Hint 2: The main problem is calculating the number of stepping numbers in the range [1, x].
 * Hint 3: First, calculate the number of stepping numbers shorter than x in length, which can be done using dynamic programming. (dp[i][j] is the number of i-digit stepping numbers ending with digit j).
 * Hint 4: Finally, calculate the number of stepping numbers that have the same length as x similarly. However, this time we need to maintain whether the prefix (in string) is smaller than or equal to x in the DP state.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/count-stepping-numbers-in-range/">LeetCode #2801</a>
 */
public class CountSteppingNumbersInRange {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Stepping Numbers in Range");
    }

    public static void main(String[] args) {
        System.out.println("=== CountSteppingNumbersInRange ===");
        CountSteppingNumbersInRange sol = new CountSteppingNumbersInRange();
        System.out.println(sol.solve(null));
    }
}
