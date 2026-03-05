package org.leetcode.medium;


/**
 * <b>#3163 - String Compression III</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string word, compress it using the following algorithm:
 *
 *
 * Begin with an empty string comp. While word is not empty, use the following operation:
 *
 *
 *
 *
 * Remove a maximum length prefix of word made of a single character c repeating at most 9 times.
 *
 * Append the length of the prefix followed by c to comp.
 *
 *
 *
 * Return the string comp.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "abcde"
 *
 *
 * Output: "1a1b1c1d1e"
 *
 *
 * Explanation:
 *
 *
 * Initially, comp = "". Apply the operation 5 times, choosing "a", "b", "c", "d", and "e" as the prefix in each operation.
 *
 *
 * For each prefix, append "1" followed by the character to comp.
 *
 * Example 2:
 *
 * Input: word = "aaaaaaaaaaaaaabb"
 *
 *
 * Output: "9a5a2b"
 *
 *
 * Explanation:
 *
 *
 * Initially, comp = "". Apply the operation 3 times, choosing "aaaaaaaaa", "aaaaa", and "bb" as the prefix in each operation.
 *
 *
 * For prefix "aaaaaaaaa", append "9" followed by "a" to comp.
 *
 * For prefix "aaaaa", append "5" followed by "a" to comp.
 *
 * For prefix "bb", append "2" followed by "b" to comp.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word.length &lt;= 2 * 105
 *
 * word consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Each time, just cut the same character in prefix up to at max 9 times. It’s always better to cut a bigger prefix.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 *
 * @see <a href="https://leetcode.com/problems/string-compression-iii/">LeetCode #3163</a>
 */
public class StringCompressionIii {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: String Compression III");
    }

    public static void main(String[] args) {
        System.out.println("=== StringCompressionIii ===");
        StringCompressionIii sol = new StringCompressionIii();
        System.out.println(sol.solve(null));
    }
}
