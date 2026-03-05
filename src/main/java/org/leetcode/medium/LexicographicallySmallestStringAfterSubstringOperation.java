package org.leetcode.medium;


/**
 * <b>#2734 - Lexicographically Smallest String After Substring Operation</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s consisting of lowercase English letters. Perform the following operation:
 *
 *
 * Select any non-empty substring then replace every letter of the substring with the preceding letter of the English alphabet. For example, 'b' is converted to 'a', and 'a' is converted to 'z'.
 *
 * Return the lexicographically smallest string after performing the operation.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "cbabc"
 *
 *
 * Output: "baabc"
 *
 *
 * Explanation:
 *
 *
 * Perform the operation on the substring starting at index 0, and ending at index 1 inclusive.
 *
 * Example 2:
 *
 * Input: s = "aa"
 *
 *
 * Output: "az"
 *
 *
 * Explanation:
 *
 *
 * Perform the operation on the last letter.
 *
 * Example 3:
 *
 * Input: s = "acbbc"
 *
 *
 * Output: "abaab"
 *
 *
 * Explanation:
 *
 *
 * Perform the operation on the substring starting at index 1, and ending at index 4 inclusive.
 *
 * Example 4:
 *
 * Input: s = "leetcode"
 *
 *
 * Output: "kddsbncd"
 *
 *
 * Explanation:
 *
 *
 * Perform the operation on the entire string.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 3 * 105
 *
 * s consists of lowercase English letters
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: When a character is replaced by the one that comes before it on the alphabet, it makes the string lexicographically smaller, except for ‘a'.
 * Hint 2: Find the leftmost substring that doesn’t contain the character 'a' and change all characters in it.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/lexicographically-smallest-string-after-substring-operation/">LeetCode #2734</a>
 */
public class LexicographicallySmallestStringAfterSubstringOperation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Lexicographically Smallest String After Substring Operation");
    }

    public static void main(String[] args) {
        System.out.println("=== LexicographicallySmallestStringAfterSubstringOperation ===");
        LexicographicallySmallestStringAfterSubstringOperation sol = new LexicographicallySmallestStringAfterSubstringOperation();
        System.out.println(sol.solve(null));
    }
}
