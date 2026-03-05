package org.leetcode.medium;


/**
 * <b>#1541 - Minimum Insertions to Balance a Parentheses String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Stack, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a parentheses string s containing only the characters '(' and ')'. A parentheses string is balanced if:
 *
 *
 * Any left parenthesis '(' must have a corresponding two consecutive right parenthesis '))'.
 *
 * Left parenthesis '(' must go before the corresponding two consecutive right parenthesis '))'.
 *
 * In other words, we treat '(' as an opening parenthesis and '))' as a closing parenthesis.
 *
 *
 * For example, "())", "())(())))" and "(())())))" are balanced, ")()", "()))" and "(()))" are not balanced.
 *
 * You can insert the characters '(' and ')' at any position of the string to balance it if needed.
 *
 *
 * Return the minimum number of insertions needed to make s balanced.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "(()))"
 * Output: 1
 * Explanation: The second '(' has two matching '))', but the first '(' has only ')' matching. We need to add one more ')' at the end of the string to be "(())))" which is balanced.
 *
 * Example 2:
 *
 * Input: s = "())"
 * Output: 0
 * Explanation: The string is already balanced.
 *
 * Example 3:
 *
 * Input: s = "))())("
 * Output: 3
 * Explanation: Add '(' to match the first '))', Add '))' to match the last '('.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of '(' and ')' only.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a stack to keep opening brackets. If you face single closing ')' add 1 to the answer and consider it as '))'.
 * Hint 2: If you have '))' with empty stack, add 1 to the answer, If after finishing you have x opening remaining in the stack, add 2x to the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/">LeetCode #1541</a>
 */
public class MinimumInsertionsToBalanceAParenthesesString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Insertions to Balance a Parentheses String");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumInsertionsToBalanceAParenthesesString ===");
        MinimumInsertionsToBalanceAParenthesesString sol = new MinimumInsertionsToBalanceAParenthesesString();
        System.out.println(sol.solve(null));
    }
}
