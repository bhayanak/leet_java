package org.leetcode.medium;


/**
 * <b>#1156 - Swap For Longest Repeated Character Substring</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string text. You can swap two of the characters in the text.
 *
 *
 * Return the length of the longest substring with repeated characters.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: text = "ababa"
 * Output: 3
 * Explanation: We can swap the first 'b' with the last 'a', or the last 'b' with the first 'a'. Then, the longest repeated character substring is "aaa" with length 3.
 *
 * Example 2:
 *
 * Input: text = "aaabaaa"
 * Output: 6
 * Explanation: Swap 'b' with the last 'a' (or the first 'a'), and we get longest repeated character substring "aaaaaa" with length 6.
 *
 * Example 3:
 *
 * Input: text = "aaaaa"
 * Output: 5
 * Explanation: No need to swap, longest repeated character substring is "aaaaa" with length is 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= text.length &lt;= 2 * 104
 *
 * text consist of lowercase English characters only.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: There are two cases:  a block of characters, or two blocks of characters between one different character. 
 By keeping a run-length encoded version of the string, we can easily check these cases.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Sliding Window).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/swap-for-longest-repeated-character-substring/">LeetCode #1156</a>
 */
public class SwapForLongestRepeatedCharacterSubstring {

    /**
     * TODO: Implement "Swap For Longest Repeated Character Substring".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Swap For Longest Repeated Character Substring");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SwapForLongestRepeatedCharacterSubstring.java &amp;&amp; java org.leetcode.medium.SwapForLongestRepeatedCharacterSubstring</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SwapForLongestRepeatedCharacterSubstring ===");
        SwapForLongestRepeatedCharacterSubstring sol = new SwapForLongestRepeatedCharacterSubstring();
        System.out.println(sol.solve(null));
    }
}
