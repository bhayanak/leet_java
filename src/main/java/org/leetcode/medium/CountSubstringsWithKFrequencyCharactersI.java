package org.leetcode.medium;


/**
 * <b>#3325 - Count Substrings With K-Frequency Characters I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s and an integer k, return the total number of substrings of s where at least one character appears at least k times.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abacb", k = 2
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The valid substrings are:
 *
 *
 * "aba" (character 'a' appears 2 times).
 *
 * "abac" (character 'a' appears 2 times).
 *
 * "abacb" (character 'a' appears 2 times).
 *
 * "bacb" (character 'b' appears 2 times).
 *
 * Example 2:
 *
 * Input: s = "abcde", k = 1
 *
 *
 * Output: 15
 *
 *
 * Explanation:
 *
 *
 * All substrings are valid because every character appears at least once.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 3000
 *
 * 1 &lt;= k &lt;= s.length
 *
 * s consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Fix the <code>left</code> index of the substring.
 * Hint 2: For the fixed <code>left</code> index, find the first <code>right</code> index for which substring <code>s[left..right]</code> satisfies the condition.
 * Hint 3: Every substring that starts at <code>left</code> and ends after <code>right</code> satisfies the condition.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/count-substrings-with-k-frequency-characters-i/">LeetCode #3325</a>
 */
public class CountSubstringsWithKFrequencyCharactersI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Substrings With K-Frequency Characters I");
    }

    public static void main(String[] args) {
        System.out.println("=== CountSubstringsWithKFrequencyCharactersI ===");
        CountSubstringsWithKFrequencyCharactersI sol = new CountSubstringsWithKFrequencyCharactersI();
        System.out.println(sol.solve(null));
    }
}
