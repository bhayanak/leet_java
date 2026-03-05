package org.leetcode.medium;


/**
 * <b>#921 - Minimum Add to Make Parentheses Valid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Stack, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A parentheses string is valid if and only if:
 *
 *
 * It is the empty string,
 *
 * It can be written as AB (A concatenated with B), where A and B are valid strings, or
 *
 * It can be written as (A), where A is a valid string.
 *
 * You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.
 *
 *
 * For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
 *
 * Return the minimum number of moves required to make s valid.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "())"
 * Output: 1
 *
 * Example 2:
 *
 * Input: s = "((("
 * Output: 3
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 1000
 *
 * s[i] is either '(' or ')'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/">LeetCode #921</a>
 */
public class MinimumAddToMakeParenthesesValid {

    /**
     * Computes the minimum Min add to make valid.
     *
     * @param s the s (String)
     * @return the computed int result
     */
    public int minAddToMakeValid(String s) {
        int open = 0, close = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') open++;
            else if (open > 0) open--; // matched
            else close++; // unmatched ')'
        }
        return open + close;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MinimumAddToMakeParenthesesValid.java &amp;&amp; java org.leetcode.medium.MinimumAddToMakeParenthesesValid</pre>
     */
    public static void main(String[] args) {
        MinimumAddToMakeParenthesesValid sol = new MinimumAddToMakeParenthesesValid();
                System.out.println(sol.minAddToMakeValid("())"));   // 1
                System.out.println(sol.minAddToMakeValid("(((")); // 3
                System.out.println(sol.minAddToMakeValid("()"));    // 0
    }
}
