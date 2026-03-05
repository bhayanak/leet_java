package org.leetcode.medium;


/**
 * <b>#3302 - Find the Lexicographically Smallest Valid Sequence</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Two Pointers, String, Dynamic Programming, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings word1 and word2.
 *
 *
 * A string x is called almost equal to y if you can change at most one character in x to make it identical to y.
 *
 *
 * A sequence of indices seq is called valid if:
 *
 *
 * The indices are sorted in ascending order.
 *
 * Concatenating the characters at these indices in word1 in the same order results in a string that is almost equal to word2.
 *
 * Return an array of size word2.length representing the lexicographically smallest valid sequence of indices. If no such sequence of indices exists, return an empty array.
 *
 *
 * Note that the answer must represent the lexicographically smallest array, not the corresponding string formed by those indices.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word1 = "vbcca", word2 = "abc"
 *
 *
 * Output: [0,1,2]
 *
 *
 * Explanation:
 *
 *
 * The lexicographically smallest valid sequence of indices is [0, 1, 2]:
 *
 *
 * Change word1[0] to 'a'.
 *
 * word1[1] is already 'b'.
 *
 * word1[2] is already 'c'.
 *
 * Example 2:
 *
 * Input: word1 = "bacdc", word2 = "abc"
 *
 *
 * Output: [1,2,4]
 *
 *
 * Explanation:
 *
 *
 * The lexicographically smallest valid sequence of indices is [1, 2, 4]:
 *
 *
 * word1[1] is already 'a'.
 *
 * Change word1[2] to 'b'.
 *
 * word1[4] is already 'c'.
 *
 * Example 3:
 *
 * Input: word1 = "aaaaaa", word2 = "aaabc"
 *
 *
 * Output: []
 *
 *
 * Explanation:
 *
 *
 * There is no valid sequence of indices.
 *
 * Example 4:
 *
 * Input: word1 = "abc", word2 = "ab"
 *
 *
 * Output: [0,1]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word2.length &lt; word1.length &lt;= 3 * 105
 *
 * word1 and word2 consist only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>dp[i]</code> be the longest suffix of <code>word2</code> that exists as a subsequence of suffix of the substring of <code>word1</code> starting at index <code>i</code>.
 * Hint 2: If <code>dp[i + 1] &lt; m</code> and <code>word1[i] == word2[m - dp[i + 1] - 1]</code>,<code>dp[i] =  dp[i + 1] + 1</code>. Otherwise, <code>dp[i] =  dp[i + 1]</code>.
 * Hint 3: For each index <code>i</code>, greedily select characters using the <code>dp</code> array to know whether a solution exists.
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Dynamic Programming, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/find-the-lexicographically-smallest-valid-sequence/">LeetCode #3302</a>
 */
public class FindTheLexicographicallySmallestValidSequence {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Lexicographically Smallest Valid Sequence");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheLexicographicallySmallestValidSequence ===");
        FindTheLexicographicallySmallestValidSequence sol = new FindTheLexicographicallySmallestValidSequence();
        System.out.println(sol.solve(null));
    }
}
