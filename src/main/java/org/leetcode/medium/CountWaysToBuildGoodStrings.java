package org.leetcode.medium;


/**
 * <b>#2466 - Count Ways To Build Good Strings</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the integers zero, one, low, and high, we can construct a string by starting with an empty string, and then at each step perform either of the following:
 *
 *
 * Append the character '0' zero times.
 *
 * Append the character '1' one times.
 *
 * This can be performed any number of times.
 *
 *
 * A good string is a string constructed by the above process having a length between low and high (inclusive).
 *
 *
 * Return the number of different good strings that can be constructed satisfying these properties. Since the answer can be large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: low = 3, high = 3, zero = 1, one = 1
 * Output: 8
 * Explanation: 
 * One possible valid good string is "011". 
 * It can be constructed as follows: "" -&gt; "0" -&gt; "01" -&gt; "011". 
 * All binary strings from "000" to "111" are good strings in this example.
 *
 * Example 2:
 *
 * Input: low = 2, high = 3, zero = 1, one = 2
 * Output: 5
 * Explanation: The good strings are "00", "11", "000", "110", and "011".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= low &lt;= high &lt;= 105
 *
 * 1 &lt;= zero, one &lt;= low
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Calculate the number of good strings with length less or equal to some constant x.
 * Hint 2: Apply dynamic programming using the group size of consecutive zeros and ones.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/count-ways-to-build-good-strings/">LeetCode #2466</a>
 */
public class CountWaysToBuildGoodStrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Ways To Build Good Strings");
    }

    public static void main(String[] args) {
        System.out.println("=== CountWaysToBuildGoodStrings ===");
        CountWaysToBuildGoodStrings sol = new CountWaysToBuildGoodStrings();
        System.out.println(sol.solve(null));
    }
}
