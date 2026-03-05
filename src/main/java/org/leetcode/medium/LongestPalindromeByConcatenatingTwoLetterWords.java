package org.leetcode.medium;


/**
 * <b>#2131 - Longest Palindrome by Concatenating Two Letter Words</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Greedy, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of strings words. Each element of words consists of two lowercase English letters.
 *
 *
 * Create the longest possible palindrome by selecting some elements from words and concatenating them in any order. Each element can be selected at most once.
 *
 *
 * Return the length of the longest palindrome that you can create. If it is impossible to create any palindrome, return 0.
 *
 *
 * A palindrome is a string that reads the same forward and backward.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["lc","cl","gg"]
 * Output: 6
 * Explanation: One longest palindrome is "lc" + "gg" + "cl" = "lcggcl", of length 6.
 * Note that "clgglc" is another longest palindrome that can be created.
 *
 * Example 2:
 *
 * Input: words = ["ab","ty","yt","lc","cl","ab"]
 * Output: 8
 * Explanation: One longest palindrome is "ty" + "lc" + "cl" + "yt" = "tylcclyt", of length 8.
 * Note that "lcyttycl" is another longest palindrome that can be created.
 *
 * Example 3:
 *
 * Input: words = ["cc","ll","xx"]
 * Output: 2
 * Explanation: One longest palindrome is "cc", of length 2.
 * Note that "ll" is another longest palindrome that can be created, and so is "xx".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 105
 *
 * words[i].length == 2
 *
 * words[i] consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: A palindrome must be mirrored over the center. Suppose we have a palindrome. If we prepend the word "ab" on the left, what must we append on the right to keep it a palindrome?
 * Hint 2: We must append "ba" on the right. The number of times we can do this is the minimum of (occurrences of "ab") and (occurrences of "ba").
 * Hint 3: For words that are already palindromes, e.g. "aa", we can prepend and append these in pairs as described in the previous hint. We can also use exactly one in the middle to form an even longer palindrome.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Greedy, Counting).
 *
 * @see <a href="https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/">LeetCode #2131</a>
 */
public class LongestPalindromeByConcatenatingTwoLetterWords {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Palindrome by Concatenating Two Letter Words");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestPalindromeByConcatenatingTwoLetterWords ===");
        LongestPalindromeByConcatenatingTwoLetterWords sol = new LongestPalindromeByConcatenatingTwoLetterWords();
        System.out.println(sol.solve(null));
    }
}
