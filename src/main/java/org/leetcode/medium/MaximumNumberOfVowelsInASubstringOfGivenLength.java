package org.leetcode.medium;


/**
 * <b>#1456 - Maximum Number of Vowels in a Substring of Given Length</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
 *
 *
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abciiidef", k = 3
 * Output: 3
 * Explanation: The substring "iii" contains 3 vowel letters.
 *
 * Example 2:
 *
 * Input: s = "aeiou", k = 2
 * Output: 2
 * Explanation: Any substring of length 2 contains 2 vowels.
 *
 * Example 3:
 *
 * Input: s = "leetcode", k = 3
 * Output: 2
 * Explanation: "lee", "eet" and "ode" contain 2 vowels.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of lowercase English letters.
 *
 * 1 &lt;= k &lt;= s.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Keep a window of size k and maintain the number of vowels in it.
 * Hint 2: Keep moving the window and update the number of vowels while moving. Answer is max number of vowels of any window.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Sliding Window).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/">LeetCode #1456</a>
 */
public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Vowels in a Substring of Given Length");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfVowelsInASubstringOfGivenLength ===");
        MaximumNumberOfVowelsInASubstringOfGivenLength sol = new MaximumNumberOfVowelsInASubstringOfGivenLength();
        System.out.println(sol.solve(null));
    }
}
