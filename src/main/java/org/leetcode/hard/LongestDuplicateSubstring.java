package org.leetcode.hard;


/**
 * <b>#1044 - Longest Duplicate Substring</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Binary Search, Sliding Window, Rolling Hash, Suffix Array, Hash Function</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, consider all duplicated substrings: (contiguous) substrings of s that occur 2 or more times. The occurrences may overlap.
 *
 *
 * Return any duplicated substring that has the longest possible length. If s does not have a duplicated substring, the answer is "".
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "banana"
 * Output: "ana"
 *
 *
 * Example 2:
 *
 * Input: s = "abcd"
 * Output: ""
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= s.length &lt;= 3 * 104
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Binary search for the length of the answer.  (If there's an answer of length 10, then there are answers of length 9, 8, 7, ...)
 * Hint 2: To check whether an answer of length K exists, we can use Rabin-Karp 's algorithm.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Binary Search, Sliding Window, Rolling Hash, Suffix Array, Hash Function).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/longest-duplicate-substring/">LeetCode #1044</a>
 */
public class LongestDuplicateSubstring {

    /**
     * TODO: Implement "Longest Duplicate Substring".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Duplicate Substring");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LongestDuplicateSubstring.java &amp;&amp; java org.leetcode.hard.LongestDuplicateSubstring</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LongestDuplicateSubstring ===");
        LongestDuplicateSubstring sol = new LongestDuplicateSubstring();
        System.out.println(sol.solve(null));
    }
}
