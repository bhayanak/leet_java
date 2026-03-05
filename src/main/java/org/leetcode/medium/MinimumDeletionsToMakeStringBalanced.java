package org.leetcode.medium;


/**
 * <b>#1653 - Minimum Deletions to Make String Balanced</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Dynamic Programming, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting only of characters 'a' and 'b'​​​​.
 *
 *
 * You can delete any number of characters in s to make s balanced. s is balanced if there is no pair of indices (i,j) such that i &lt; j and s[i] = 'b' and s[j]= 'a'.
 *
 *
 * Return the minimum number of deletions needed to make s balanced.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aababbab"
 * Output: 2
 * Explanation: You can either:
 * Delete the characters at 0-indexed positions 2 and 6 ("aababbab" -&gt; "aaabbb"), or
 * Delete the characters at 0-indexed positions 3 and 6 ("aababbab" -&gt; "aabbbb").
 *
 * Example 2:
 *
 * Input: s = "bbaaaaabb"
 * Output: 2
 * Explanation: The only solution is to delete the first two characters.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s[i] is 'a' or 'b'​​.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You need to find for every index the number of Bs before it and the number of A's after it
 * Hint 2: You can speed up the finding of A's and B's in suffix and prefix using preprocessing
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/">LeetCode #1653</a>
 */
public class MinimumDeletionsToMakeStringBalanced {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Deletions to Make String Balanced");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumDeletionsToMakeStringBalanced ===");
        MinimumDeletionsToMakeStringBalanced sol = new MinimumDeletionsToMakeStringBalanced();
        System.out.println(sol.solve(null));
    }
}
