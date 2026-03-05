package org.leetcode.hard;


/**
 * <b>#903 - Valid Permutations for DI Sequence</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s of length n where s[i] is either:
 *
 *
 * 'D' means decreasing, or
 *
 * 'I' means increasing.
 *
 * A permutation perm of n + 1 integers of all the integers in the range [0, n] is called a valid permutation if for all valid i:
 *
 *
 * If s[i] == 'D', then perm[i] &gt; perm[i + 1], and
 *
 * If s[i] == 'I', then perm[i] &lt; perm[i + 1].
 *
 * Return the number of valid permutations perm. Since the answer may be large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "DID"
 * Output: 5
 * Explanation: The 5 valid permutations of (0, 1, 2, 3) are:
 * (1, 0, 3, 2)
 * (2, 0, 3, 1)
 * (2, 1, 3, 0)
 * (3, 0, 2, 1)
 * (3, 1, 2, 0)
 *
 * Example 2:
 *
 * Input: s = "D"
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * n == s.length
 *
 * 1 &lt;= n &lt;= 200
 *
 * s[i] is either 'I' or 'D'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/valid-permutations-for-di-sequence/">LeetCode #903</a>
 */
public class ValidPermutationsForDiSequence {

    /**
     * TODO: Implement "Valid Permutations for DI Sequence".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Valid Permutations for DI Sequence");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ValidPermutationsForDiSequence.java &amp;&amp; java org.leetcode.hard.ValidPermutationsForDiSequence</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ValidPermutationsForDiSequence ===");
        ValidPermutationsForDiSequence sol = new ValidPermutationsForDiSequence();
        System.out.println(sol.solve(null));
    }
}
