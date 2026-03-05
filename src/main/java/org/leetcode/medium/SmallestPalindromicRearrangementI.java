package org.leetcode.medium;


/**
 * <b>#3517 - Smallest Palindromic Rearrangement I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Sorting, Counting Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a palindromic string s.
 *
 *
 * Return the lexicographically smallest palindromic permutation of s.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "z"
 *
 *
 * Output: "z"
 *
 *
 * Explanation:
 *
 *
 * A string of only one character is already the lexicographically smallest palindrome.
 *
 * Example 2:
 *
 * Input: s = "babab"
 *
 *
 * Output: "abbba"
 *
 *
 * Explanation:
 *
 *
 * Rearranging "babab" → "abbba" gives the smallest lexicographic palindrome.
 *
 * Example 3:
 *
 * Input: s = "daccad"
 *
 *
 * Output: "acddca"
 *
 *
 * Explanation:
 *
 *
 * Rearranging "daccad" → "acddca" gives the smallest lexicographic palindrome.
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
 * s is guaranteed to be palindromic.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider a palindrome as composed of two mirror-image halves.
 * Hint 2: Construct one half (using <code>s</code>), and then the other half is its reverse to obtain the lexicographically smallest permutation.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Sorting, Counting Sort).
 *
 * @see <a href="https://leetcode.com/problems/smallest-palindromic-rearrangement-i/">LeetCode #3517</a>
 */
public class SmallestPalindromicRearrangementI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Smallest Palindromic Rearrangement I");
    }

    public static void main(String[] args) {
        System.out.println("=== SmallestPalindromicRearrangementI ===");
        SmallestPalindromicRearrangementI sol = new SmallestPalindromicRearrangementI();
        System.out.println(sol.solve(null));
    }
}
