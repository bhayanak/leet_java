package org.leetcode.hard;


/**
 * <b>#1147 - Longest Chunked Palindrome Decomposition</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Two Pointers, String, Dynamic Programming, Greedy, Rolling Hash, Hash Function</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string text. You should split it to k substrings (subtext1, subtext2, ..., subtextk) such that:
 *
 *
 * subtexti is a non-empty string.
 *
 * The concatenation of all the substrings is equal to text (i.e., subtext1 + subtext2 + ... + subtextk == text).
 *
 * subtexti == subtextk - i + 1 for all valid values of i (i.e., 1 &lt;= i &lt;= k).
 *
 * Return the largest possible value of k.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: text = "ghiabcdefhelloadamhelloabcdefghi"
 * Output: 7
 * Explanation: We can split the string on "(ghi)(abcdef)(hello)(adam)(hello)(abcdef)(ghi)".
 *
 * Example 2:
 *
 * Input: text = "merchant"
 * Output: 1
 * Explanation: We can split the string on "(merchant)".
 *
 * Example 3:
 *
 * Input: text = "antaprezatepzapreanta"
 * Output: 11
 * Explanation: We can split the string on "(a)(nt)(a)(pre)(za)(tep)(za)(pre)(a)(nt)(a)".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= text.length &lt;= 1000
 *
 * text consists only of lowercase English characters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Using a rolling hash, we can quickly check whether two strings are equal.
 * Hint 2: Use that as the basis of a dp.
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Dynamic Programming, Greedy, Rolling Hash, Hash Function).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/longest-chunked-palindrome-decomposition/">LeetCode #1147</a>
 */
public class LongestChunkedPalindromeDecomposition {

    /**
     * TODO: Implement "Longest Chunked Palindrome Decomposition".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Chunked Palindrome Decomposition");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LongestChunkedPalindromeDecomposition.java &amp;&amp; java org.leetcode.hard.LongestChunkedPalindromeDecomposition</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LongestChunkedPalindromeDecomposition ===");
        LongestChunkedPalindromeDecomposition sol = new LongestChunkedPalindromeDecomposition();
        System.out.println(sol.solve(null));
    }
}
