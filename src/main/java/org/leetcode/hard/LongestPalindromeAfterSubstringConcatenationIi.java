package org.leetcode.hard;


/**
 * <b>#3504 - Longest Palindrome After Substring Concatenation II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Two Pointers, String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings, s and t.
 *
 *
 * You can create a new string by selecting a substring from s (possibly empty) and a substring from t (possibly empty), then concatenating them in order.
 *
 *
 * Return the length of the longest palindrome that can be formed this way.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "a", t = "a"
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Concatenating "a" from s and "a" from t results in "aa", which is a palindrome of length 2.
 *
 * Example 2:
 *
 * Input: s = "abc", t = "def"
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Since all characters are different, the longest palindrome is any single character, so the answer is 1.
 *
 * Example 3:
 *
 * Input: s = "b", t = "aaaa"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Selecting "aaaa" from t is the longest palindrome, so the answer is 4.
 *
 * Example 4:
 *
 * Input: s = "abcde", t = "ecdba"
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * Concatenating "abc" from s and "ba" from t results in "abcba", which is a palindrome of length 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length, t.length &lt;= 1000
 *
 * s and t consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>dp[i][j]</code> be the length of the longest answer if we try starting it with <code>s[i]</code> and ending it with <code>t[j]</code>.
 * Hint 2: For <code>s</code>, preprocess the length of the longest palindrome starting at index <code>i</code> as <code>p[i]</code>.
 * Hint 3: For <code>t</code>, preprocess the length of the longest palindrome ending at index <code>j</code> as <code>q[j]</code>.
 * Hint 4: If <code>s[i] != t[j]</code>, then <code>dp[i][j] = max(p[i], q[j])</code>.
 * Hint 5: Otherwise, <code>dp[i][j] = max(p[i], q[j], 2 + dp[i + 1][j - 1])</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/longest-palindrome-after-substring-concatenation-ii/">LeetCode #3504</a>
 */
public class LongestPalindromeAfterSubstringConcatenationIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Palindrome After Substring Concatenation II");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestPalindromeAfterSubstringConcatenationIi ===");
        LongestPalindromeAfterSubstringConcatenationIi sol = new LongestPalindromeAfterSubstringConcatenationIi();
        System.out.println(sol.solve(null));
    }
}
