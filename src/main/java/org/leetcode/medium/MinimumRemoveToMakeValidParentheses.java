package org.leetcode.medium;


/**
 * <b>#1249 - Minimum Remove to Make Valid Parentheses</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s of '(' , ')' and lowercase English characters.
 *
 *
 * Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.
 *
 *
 * Formally, a parentheses string is valid if and only if:
 *
 *
 * It is the empty string, contains only lowercase characters, or
 *
 * It can be written as AB (A concatenated with B), where A and B are valid strings, or
 *
 * It can be written as (A), where A is a valid string.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "lee(t(c)o)de)"
 * Output: "lee(t(c)o)de"
 * Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
 *
 * Example 2:
 *
 * Input: s = "a)b(c)d"
 * Output: "ab(c)d"
 *
 * Example 3:
 *
 * Input: s = "))(("
 * Output: ""
 * Explanation: An empty string is also valid.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s[i] is either '(' , ')', or lowercase English letter.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Each prefix of a balanced parentheses has a number of open parentheses greater or equal than closed parentheses, similar idea with each suffix.
 * Hint 2: Check the array from left to right, remove characters that do not meet the property mentioned above, same idea in backward way.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/">LeetCode #1249</a>
 */
public class MinimumRemoveToMakeValidParentheses {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Remove to Make Valid Parentheses");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumRemoveToMakeValidParentheses ===");
        MinimumRemoveToMakeValidParentheses sol = new MinimumRemoveToMakeValidParentheses();
        System.out.println(sol.solve(null));
    }
}
