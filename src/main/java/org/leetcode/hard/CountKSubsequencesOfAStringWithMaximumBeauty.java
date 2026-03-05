package org.leetcode.hard;


/**
 * <b>#2842 - Count K-Subsequences of a String With Maximum Beauty</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, Math, String, Greedy, Sorting, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and an integer k.
 *
 *
 * A k-subsequence is a subsequence of s, having length k, and all its characters are unique, i.e., every character occurs once.
 *
 *
 * Let f(c) denote the number of times the character c occurs in s.
 *
 *
 * The beauty of a k-subsequence is the sum of f(c) for every character c in the k-subsequence.
 *
 *
 * For example, consider s = "abbbdd" and k = 2:
 *
 *
 * f('a') = 1, f('b') = 3, f('d') = 2
 *
 * Some k-subsequences of s are:
 *
 *
 *
 * "abbbdd" -&gt; "ab" having a beauty of f('a') + f('b') = 4
 *
 * "abbbdd" -&gt; "ad" having a beauty of f('a') + f('d') = 3
 *
 * "abbbdd" -&gt; "bd" having a beauty of f('b') + f('d') = 5
 *
 *
 *
 * Return an integer denoting the number of k-subsequences whose beauty is the maximum among all k-subsequences. Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 * A subsequence of a string is a new string formed from the original string by deleting some (possibly none) of the characters without disturbing the relative positions of the remaining characters.
 *
 *
 * Notes
 *
 *
 * f(c) is the number of times a character c occurs in s, not a k-subsequence.
 *
 * Two k-subsequences are considered different if one is formed by an index that is not present in the other. So, two k-subsequences may form the same string.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "bcca", k = 2
 * Output: 4
 * Explanation: From s we have f('a') = 1, f('b') = 1, and f('c') = 2.
 * The k-subsequences of s are: 
 * bcca having a beauty of f('b') + f('c') = 3 
 * bcca having a beauty of f('b') + f('c') = 3 
 * bcca having a beauty of f('b') + f('a') = 2 
 * bcca having a beauty of f('c') + f('a') = 3
 * bcca having a beauty of f('c') + f('a') = 3 
 * There are 4 k-subsequences that have the maximum beauty, 3. 
 * Hence, the answer is 4. 
 *
 * Example 2:
 *
 * Input: s = "abbcd", k = 4
 * Output: 2
 * Explanation: From s we have f('a') = 1, f('b') = 2, f('c') = 1, and f('d') = 1. 
 * The k-subsequences of s are: 
 * abbcd having a beauty of f('a') + f('b') + f('c') + f('d') = 5
 * abbcd having a beauty of f('a') + f('b') + f('c') + f('d') = 5 
 * There are 2 k-subsequences that have the maximum beauty, 5. 
 * Hence, the answer is 2. 
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 2 * 105
 *
 * 1 &lt;= k &lt;= s.length
 *
 * s consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since every character appears once in a k-subsequence, we can solve the following problem first: Find the total number of ways to select <code>k</code> characters such that the sum of their frequencies is maximum.
 * Hint 2: An obvious case to eliminate is if <code>k</code> is greater than the number of distinct characters in <code>s</code>, then the answer is <code>0</code>.
 * Hint 3: We are now interested in the top frequencies among the characters. Using a map data structure, let <code>cnt[x]</code> denote the number of characters that have a frequency of <code>x</code>.
 * Hint 4: Starting from the maximum value <code>x</code> in <code>cnt</code>. Let <code>i = min(k, cnt[x])</code> we add to our result <code> <sup>cnt[x]</sup>C<sub>i</sub> * x<sup>i</sup></code> representing the number of ways to select <code>i</code> characters from all characters with frequency <code>x</code>, multiplied by the number of ways to choose each individual character. Subtract <code>i</code> from <code>k</code> and continue downwards to the next maximum value.
 * Hint 5: Powers, combinations, and additions should be done modulo <code>10<sup>9</sup> + 7</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Math, String, Greedy, Sorting, Combinatorics).
 *
 * @see <a href="https://leetcode.com/problems/count-k-subsequences-of-a-string-with-maximum-beauty/">LeetCode #2842</a>
 */
public class CountKSubsequencesOfAStringWithMaximumBeauty {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count K-Subsequences of a String With Maximum Beauty");
    }

    public static void main(String[] args) {
        System.out.println("=== CountKSubsequencesOfAStringWithMaximumBeauty ===");
        CountKSubsequencesOfAStringWithMaximumBeauty sol = new CountKSubsequencesOfAStringWithMaximumBeauty();
        System.out.println(sol.solve(null));
    }
}
