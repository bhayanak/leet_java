package org.leetcode.medium;


/**
 * <b>#3703 - Remove K-Balanced Substrings</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Stack, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting of '(' and ')', and an integer k.
 *
 *
 * A string is k-balanced if it is exactly k consecutive '(' followed by k consecutive ')', i.e., '(' * k + ')' * k.
 *
 *
 * For example, if k = 3, k-balanced is "((()))".
 *
 *
 * You must repeatedly remove all non-overlapping k-balanced substrings from s, and then join the remaining parts. Continue this process until no k-balanced substring exists.
 *
 *
 * Return the final string after all possible removals.
 *
 *
 *
 *
 * ​​​​​​​Example 1:
 *
 * Input: s = "(())", k = 1
 *
 *
 * Output: ""
 *
 *
 * Explanation:
 *
 *
 * k-balanced substring is "()"
 *
 *
 *
 *
 *
 * 			Step
 * 			Current s
 * 			k-balanced
 * 			Result s
 *
 *
 *
 *
 *
 *
 * 			1
 * 			(())
 * 			(())
 * 			()
 *
 *
 *
 *
 * 			2
 * 			()
 * 			()
 * 			Empty
 *
 *
 *
 *
 * Thus, the final string is "".
 *
 * Example 2:
 *
 * Input: s = "(()(", k = 1
 *
 *
 * Output: "(("
 *
 *
 * Explanation:
 *
 *
 * k-balanced substring is "()"
 *
 *
 *
 *
 *
 * 			Step
 * 			Current s
 * 			k-balanced
 * 			Result s
 *
 *
 *
 *
 *
 *
 * 			1
 * 			(()(
 * 			(()(
 * 			((
 *
 *
 *
 *
 * 			2
 * 			((
 * 			-
 * 			((
 *
 *
 *
 *
 * Thus, the final string is "((".
 *
 * Example 3:
 *
 * Input: s = "((()))()()()", k = 3
 *
 *
 * Output: "()()()"
 *
 *
 * Explanation:
 *
 *
 * k-balanced substring is "((()))"
 *
 *
 *
 *
 *
 * 			Step
 * 			Current s
 * 			k-balanced
 * 			Result s
 *
 *
 *
 *
 *
 *
 * 			1
 * 			((()))()()()
 * 			((()))()()()
 * 			()()()
 *
 *
 *
 *
 * 			2
 * 			()()()
 * 			-
 * 			()()()
 *
 *
 *
 *
 * Thus, the final string is "()()()".
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= s.length &lt;= 105
 *
 * s consists only of '(' and ')'.
 *
 * 1 &lt;= k &lt;= s.length / 2
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a stack
 * Hint 2: Try run-length encoding; operations only happen at boundaries of '(' and ')' runs
 * Hint 3: When adjacent runs are '(' then ')', you can cancel in blocks of k
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/remove-k-balanced-substrings/">LeetCode #3703</a>
 */
public class RemoveKBalancedSubstrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Remove K-Balanced Substrings");
    }

    public static void main(String[] args) {
        System.out.println("=== RemoveKBalancedSubstrings ===");
        RemoveKBalancedSubstrings sol = new RemoveKBalancedSubstrings();
        System.out.println(sol.solve(null));
    }
}
