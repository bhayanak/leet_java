package org.leetcode.hard;


/**
 * <b>#1830 - Minimum Number of Operations to Make String Sorted</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, Math, String, Combinatorics, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s (0-indexed)​​​​​​. You are asked to perform the following operation on s​​​​​​ until you get a sorted string:
 *
 *
 * Find the largest index i such that 1 &lt;= i &lt; s.length and s[i] &lt; s[i - 1].
 *
 * Find the largest index j such that i &lt;= j &lt; s.length and s[k] &lt; s[i - 1] for all the possible values of k in the range [i, j] inclusive.
 *
 * Swap the two characters at indices i - 1​​​​ and j​​​​​.
 *
 * Reverse the suffix starting at index i​​​​​​.
 *
 * Return the number of operations needed to make the string sorted. Since the answer can be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "cba"
 * Output: 5
 * Explanation: The simulation goes as follows:
 * Operation 1: i=2, j=2. Swap s[1] and s[2] to get s="cab", then reverse the suffix starting at 2. Now, s="cab".
 * Operation 2: i=1, j=2. Swap s[0] and s[2] to get s="bac", then reverse the suffix starting at 1. Now, s="bca".
 * Operation 3: i=2, j=2. Swap s[1] and s[2] to get s="bac", then reverse the suffix starting at 2. Now, s="bac".
 * Operation 4: i=1, j=1. Swap s[0] and s[1] to get s="abc", then reverse the suffix starting at 1. Now, s="acb".
 * Operation 5: i=2, j=2. Swap s[1] and s[2] to get s="abc", then reverse the suffix starting at 2. Now, s="abc".
 *
 * Example 2:
 *
 * Input: s = "aabaa"
 * Output: 2
 * Explanation: The simulation goes as follows:
 * Operation 1: i=3, j=4. Swap s[2] and s[4] to get s="aaaab", then reverse the substring starting at 3. Now, s="aaaba".
 * Operation 2: i=4, j=4. Swap s[3] and s[4] to get s="aaaab", then reverse the substring starting at 4. Now, s="aaaab".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 3000
 *
 * s​​​​​​ consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Note that the operations given describe getting the previous permutation of s
 * Hint 2: To solve this problem you need to solve every suffix separately
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Math, String, Combinatorics, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-operations-to-make-string-sorted/">LeetCode #1830</a>
 */
public class MinimumNumberOfOperationsToMakeStringSorted {

    /**
     * Solves the problem and Solve.
     * Sorts the input first to enable efficient processing.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Operations to Make String Sorted");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfOperationsToMakeStringSorted ===");
        MinimumNumberOfOperationsToMakeStringSorted sol = new MinimumNumberOfOperationsToMakeStringSorted();
        System.out.println(sol.solve(null));
    }
}
