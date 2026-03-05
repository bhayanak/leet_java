package org.leetcode.medium;


/**
 * <b>#3121 - Count the Number of Special Characters II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string word. A letter c is called special if it appears both in lowercase and uppercase in word, and every lowercase occurrence of c appears before the first uppercase occurrence of c.
 *
 *
 * Return the number of special letters in word.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "aaAbcBC"
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The special characters are 'a', 'b', and 'c'.
 *
 * Example 2:
 *
 * Input: word = "abc"
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * There are no special characters in word.
 *
 * Example 3:
 *
 * Input: word = "AbBCab"
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * There are no special characters in word.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word.length &lt;= 2 * 105
 *
 * word consists of only lowercase and uppercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each character <code>c</code>, store the first occurrence of its uppercase and the last occurrence of its lowercase.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String).
 *
 * @see <a href="https://leetcode.com/problems/count-the-number-of-special-characters-ii/">LeetCode #3121</a>
 */
public class CountTheNumberOfSpecialCharactersIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count the Number of Special Characters II");
    }

    public static void main(String[] args) {
        System.out.println("=== CountTheNumberOfSpecialCharactersIi ===");
        CountTheNumberOfSpecialCharactersIi sol = new CountTheNumberOfSpecialCharactersIi();
        System.out.println(sol.solve(null));
    }
}
