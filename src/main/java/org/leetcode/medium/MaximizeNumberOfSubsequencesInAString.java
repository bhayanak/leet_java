package org.leetcode.medium;


/**
 * <b>#2207 - Maximize Number of Subsequences in a String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Greedy, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string text and another 0-indexed string pattern of length 2, both of which consist of only lowercase English letters.
 *
 *
 * You can add either pattern[0] or pattern[1] anywhere in text exactly once. Note that the character can be added even at the beginning or at the end of text.
 *
 *
 * Return the maximum number of times pattern can occur as a subsequence of the modified text.
 *
 *
 * A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: text = "abdcdbc", pattern = "ac"
 * Output: 4
 * Explanation:
 * If we add pattern[0] = 'a' in between text[1] and text[2], we get "abadcdbc". Now, the number of times "ac" occurs as a subsequence is 4.
 * Some other strings which have 4 subsequences "ac" after adding a character to text are "aabdcdbc" and "abdacdbc".
 * However, strings such as "abdcadbc", "abdccdbc", and "abdcdbcc", although obtainable, have only 3 subsequences "ac" and are thus suboptimal.
 * It can be shown that it is not possible to get more than 4 subsequences "ac" by adding only one character.
 *
 * Example 2:
 *
 * Input: text = "aabb", pattern = "ab"
 * Output: 6
 * Explanation:
 * Some of the strings which can be obtained from text and have 6 subsequences "ab" are "aaabb", "aaabb", and "aabbb".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= text.length &lt;= 105
 *
 * pattern.length == 2
 *
 * text and pattern consist only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the optimal position to add pattern[0] so that the number of subsequences is maximized. Similarly, find the optimal position to add pattern[1].
 * Hint 2: For each of the above cases, count the number of times the pattern occurs as a subsequence in text. The larger count is the required answer.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/maximize-number-of-subsequences-in-a-string/">LeetCode #2207</a>
 */
public class MaximizeNumberOfSubsequencesInAString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize Number of Subsequences in a String");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeNumberOfSubsequencesInAString ===");
        MaximizeNumberOfSubsequencesInAString sol = new MaximizeNumberOfSubsequencesInAString();
        System.out.println(sol.solve(null));
    }
}
