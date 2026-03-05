package org.leetcode.medium;


/**
 * <b>#1190 - Reverse Substrings Between Each Pair of Parentheses</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s that consists of lower case English letters and brackets.
 *
 *
 * Reverse the strings in each pair of matching parentheses, starting from the innermost one.
 *
 *
 * Your result should not contain any brackets.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "(abcd)"
 * Output: "dcba"
 *
 * Example 2:
 *
 * Input: s = "(u(love)i)"
 * Output: "iloveu"
 * Explanation: The substring "love" is reversed first, then the whole string is reversed.
 *
 * Example 3:
 *
 * Input: s = "(ed(et(oc))el)"
 * Output: "leetcode"
 * Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 2000
 *
 * s only contains lower case English characters and parentheses.
 *
 * It is guaranteed that all parentheses are balanced.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find all brackets in the string.
 * Hint 2: Does the order of the reverse matter ?
 * Hint 3: The order does not matter.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/">LeetCode #1190</a>
 */
public class ReverseSubstringsBetweenEachPairOfParentheses {

    /**
     * TODO: Implement "Reverse Substrings Between Each Pair of Parentheses".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Reverse Substrings Between Each Pair of Parentheses");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ReverseSubstringsBetweenEachPairOfParentheses.java &amp;&amp; java org.leetcode.medium.ReverseSubstringsBetweenEachPairOfParentheses</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ReverseSubstringsBetweenEachPairOfParentheses ===");
        ReverseSubstringsBetweenEachPairOfParentheses sol = new ReverseSubstringsBetweenEachPairOfParentheses();
        System.out.println(sol.solve(null));
    }
}
