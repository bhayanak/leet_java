package org.leetcode.hard;


/**
 * <b>#1220 - Count Vowels Permutation</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, your task is to count how many strings of length n can be formed under the following rules:
 *
 *
 * Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')
 *
 * Each vowel 'a' may only be followed by an 'e'.
 *
 * Each vowel 'e' may only be followed by an 'a' or an 'i'.
 *
 * Each vowel 'i' may not be followed by another 'i'.
 *
 * Each vowel 'o' may only be followed by an 'i' or a 'u'.
 *
 * Each vowel 'u' may only be followed by an 'a'.
 *
 * Since the answer may be too large, return it modulo 10^9 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1
 * Output: 5
 * Explanation: All possible strings are: "a", "e", "i" , "o" and "u".
 *
 * Example 2:
 *
 * Input: n = 2
 * Output: 10
 * Explanation: All possible strings are: "ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" and "ua".
 *
 * Example 3: 
 *
 * Input: n = 5
 * Output: 68
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 2 * 10^4
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: Let dp[i][j] be the number of strings of length i that ends with the j-th vowel.
 * Hint 3: Deduce the recurrence from the given relations between vowels.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-vowels-permutation/">LeetCode #1220</a>
 */
public class CountVowelsPermutation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Vowels Permutation");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountVowelsPermutation ===");
        CountVowelsPermutation sol = new CountVowelsPermutation();
        System.out.println(sol.solve(null));
    }
}
