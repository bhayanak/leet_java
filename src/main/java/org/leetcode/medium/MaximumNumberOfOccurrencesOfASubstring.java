package org.leetcode.medium;


/**
 * <b>#1297 - Maximum Number of Occurrences of a Substring</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, return the maximum number of occurrences of any substring under the following rules:
 *
 *
 * The number of unique characters in the substring must be less than or equal to maxLetters.
 *
 * The substring size must be between minSize and maxSize inclusive.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aababcaab", maxLetters = 2, minSize = 3, maxSize = 4
 * Output: 2
 * Explanation: Substring "aab" has 2 occurrences in the original string.
 * It satisfies the conditions, 2 unique letters and size 3 (between minSize and maxSize).
 *
 * Example 2:
 *
 * Input: s = "aaaa", maxLetters = 1, minSize = 3, maxSize = 3
 * Output: 2
 * Explanation: Substring "aaa" occur 2 times in the string. It can overlap.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * 1 &lt;= maxLetters &lt;= 26
 *
 * 1 &lt;= minSize &lt;= maxSize &lt;= min(26, s.length)
 *
 * s consists of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Check out the constraints, (maxSize &lt;=26).
 * Hint 2: This means you can explore all substrings in O(n * 26).
 * Hint 3: Find the Maximum Number of Occurrences of a Substring with bruteforce.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Sliding Window).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-occurrences-of-a-substring/">LeetCode #1297</a>
 */
public class MaximumNumberOfOccurrencesOfASubstring {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Occurrences of a Substring");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfOccurrencesOfASubstring ===");
        MaximumNumberOfOccurrencesOfASubstring sol = new MaximumNumberOfOccurrencesOfASubstring();
        System.out.println(sol.solve(null));
    }
}
