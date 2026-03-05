package org.leetcode.medium;


/**
 * <b>#1898 - Maximum Number of Removable Characters</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, String, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings s and p where p is a subsequence of s. You are also given a distinct 0-indexed integer array removable containing a subset of indices of s (s is also 0-indexed).
 *
 *
 * You want to choose an integer k (0 &lt;= k &lt;= removable.length) such that, after removing k characters from s using the first k indices in removable, p is still a subsequence of s. More formally, you will mark the character at s[removable[i]] for each 0 &lt;= i &lt; k, then remove all marked characters and check if p is still a subsequence.
 *
 *
 * Return the maximum k you can choose such that p is still a subsequence of s after the removals.
 *
 *
 * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcacb", p = "ab", removable = [3,1,0]
 * Output: 2
 * Explanation: After removing the characters at indices 3 and 1, "abcacb" becomes "accb".
 * "ab" is a subsequence of "accb".
 * If we remove the characters at indices 3, 1, and 0, "abcacb" becomes "ccb", and "ab" is no longer a subsequence.
 * Hence, the maximum k is 2.
 *
 * Example 2:
 *
 * Input: s = "abcbddddd", p = "abcd", removable = [3,2,1,4,5,6]
 * Output: 1
 * Explanation: After removing the character at index 3, "abcbddddd" becomes "abcddddd".
 * "abcd" is a subsequence of "abcddddd".
 *
 * Example 3:
 *
 * Input: s = "abcab", p = "abc", removable = [0,1,2,3,4]
 * Output: 0
 * Explanation: If you remove the first index in the array removable, "abc" is no longer a subsequence.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= p.length &lt;= s.length &lt;= 105
 *
 * 0 &lt;= removable.length &lt; s.length
 *
 * 0 &lt;= removable[i] &lt; s.length
 *
 * p is a subsequence of s.
 *
 * s and p both consist of lowercase English letters.
 *
 * The elements in removable are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: First, we need to think about solving an easier problem, If we remove a set of indices from the string does P exist in S as a subsequence
 * Hint 2: We can binary search the K and check by solving the above problem.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, String, Binary Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-removable-characters/">LeetCode #1898</a>
 */
public class MaximumNumberOfRemovableCharacters {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Removable Characters");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfRemovableCharacters ===");
        MaximumNumberOfRemovableCharacters sol = new MaximumNumberOfRemovableCharacters();
        System.out.println(sol.solve(null));
    }
}
