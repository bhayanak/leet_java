package org.leetcode.medium;


/**
 * <b>#1328 - Break a Palindrome</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a palindromic string of lowercase English letters palindrome, replace exactly one character with any lowercase English letter so that the resulting string is not a palindrome and that it is the lexicographically smallest one possible.
 *
 *
 * Return the resulting string. If there is no way to replace a character to make it not a palindrome, return an empty string.
 *
 *
 * A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, a has a character strictly smaller than the corresponding character in b. For example, "abcc" is lexicographically smaller than "abcd" because the first position they differ is at the fourth character, and 'c' is smaller than 'd'.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: palindrome = "abccba"
 * Output: "aaccba"
 * Explanation: There are many ways to make "abccba" not a palindrome, such as "zbccba", "aaccba", and "abacba".
 * Of all the ways, "aaccba" is the lexicographically smallest.
 *
 * Example 2:
 *
 * Input: palindrome = "a"
 * Output: ""
 * Explanation: There is no way to replace a single character to make "a" not a palindrome, so return an empty string.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= palindrome.length &lt;= 1000
 *
 * palindrome consists of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How to detect if there is impossible to perform the replacement? Only when the length = 1.
 * Hint 2: Change the first non 'a' character to 'a'.
 * Hint 3: What if the string has only 'a'?
 * Hint 4: Change the last character to 'b'.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/break-a-palindrome/">LeetCode #1328</a>
 */
public class BreakAPalindrome {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Break a Palindrome");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== BreakAPalindrome ===");
        BreakAPalindrome sol = new BreakAPalindrome();
        System.out.println(sol.solve(null));
    }
}
