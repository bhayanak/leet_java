package org.leetcode.medium;


/**
 * <b>#1513 - Number of Substrings With Only 1s</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary string s, return the number of substrings with all characters 1's. Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "0110111"
 * Output: 9
 * Explanation: There are 9 substring in total with only 1's characters.
 * "1" -&gt; 5 times.
 * "11" -&gt; 3 times.
 * "111" -&gt; 1 time.
 *
 * Example 2:
 *
 * Input: s = "101"
 * Output: 2
 * Explanation: Substring "1" is shown 2 times in s.
 *
 * Example 3:
 *
 * Input: s = "111111"
 * Output: 21
 * Explanation: Each substring contains only 1's characters.
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
 * Hint 1: Count number of 1s in each consecutive-1 group. For a group with n consecutive 1s, the total contribution of it to the final answer is (n + 1) * n // 2.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-substrings-with-only-1s/">LeetCode #1513</a>
 */
public class NumberOfSubstringsWithOnly1s {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Substrings With Only 1s");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfSubstringsWithOnly1s ===");
        NumberOfSubstringsWithOnly1s sol = new NumberOfSubstringsWithOnly1s();
        System.out.println(sol.solve(null));
    }
}
