package org.leetcode.medium;


/**
 * <b>#1915 - Number of Wonderful Substrings</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Bit Manipulation, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A wonderful string is a string where at most one letter appears an odd number of times.
 *
 *
 *
 *
 * For example, "ccjjc" and "abab" are wonderful, but "ab" is not.
 *
 *
 *
 * Given a string word that consists of the first ten lowercase English letters ('a' through 'j'), return the number of wonderful non-empty substrings in word. If the same substring appears multiple times in word, then count each occurrence separately.
 *
 *
 * A substring is a contiguous sequence of characters in a string.
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: word = "aba"
 * Output: 4
 * Explanation: The four wonderful substrings are underlined below:
 * - "aba" -&gt; "a"
 * - "aba" -&gt; "b"
 * - "aba" -&gt; "a"
 * - "aba" -&gt; "aba"
 *
 *
 *
 *
 * Example 2:
 *
 *
 *
 * Input: word = "aabb"
 * Output: 9
 * Explanation: The nine wonderful substrings are underlined below:
 * - "aabb" -&gt; "a"
 * - "aabb" -&gt; "aa"
 * - "aabb" -&gt; "aab"
 * - "aabb" -&gt; "aabb"
 * - "aabb" -&gt; "a"
 * - "aabb" -&gt; "abb"
 * - "aabb" -&gt; "b"
 * - "aabb" -&gt; "bb"
 * - "aabb" -&gt; "b"
 *
 *
 *
 *
 * Example 3:
 *
 *
 *
 * Input: word = "he"
 * Output: 2
 * Explanation: The two wonderful substrings are underlined below:
 * - "he" -&gt; "h"
 * - "he" -&gt; "e"
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * 1 &lt;= word.length &lt;= 105
 *
 * word consists of lowercase English letters from 'a' to 'j'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each prefix of the string, check which characters are of even frequency and which are not and represent it by a bitmask.
 * Hint 2: Find the other prefixes whose masks differs from the current prefix mask by at most one bit.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Bit Manipulation, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-wonderful-substrings/">LeetCode #1915</a>
 */
public class NumberOfWonderfulSubstrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Wonderful Substrings");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfWonderfulSubstrings ===");
        NumberOfWonderfulSubstrings sol = new NumberOfWonderfulSubstrings();
        System.out.println(sol.solve(null));
    }
}
