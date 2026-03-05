package org.leetcode.medium;


/**
 * <b>#3316 - Find Maximum Removals From Source String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Two Pointers, String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string source of size n, a string pattern that is a subsequence of source, and a sorted integer array targetIndices that contains distinct numbers in the range [0, n - 1].
 *
 *
 * We define an operation as removing a character at an index idx from source such that:
 *
 *
 * idx is an element of targetIndices.
 *
 * pattern remains a subsequence of source after removing the character.
 *
 * Performing an operation does not change the indices of the other characters in source. For example, if you remove 'c' from "acb", the character at index 2 would still be 'b'.
 *
 *
 * Return the maximum number of operations that can be performed.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: source = "abbaa", pattern = "aba", targetIndices = [0,1,2]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * We can't remove source[0] but we can do either of these two operations:
 *
 *
 * Remove source[1], so that source becomes "a_baa".
 *
 * Remove source[2], so that source becomes "ab_aa".
 *
 * Example 2:
 *
 * Input: source = "bcda", pattern = "d", targetIndices = [0,3]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * We can remove source[0] and source[3] in two operations.
 *
 * Example 3:
 *
 * Input: source = "dda", pattern = "dda", targetIndices = [0,1,2]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * We can't remove any character from source.
 *
 * Example 4:
 *
 * Input: source = "yeyeykyded", pattern = "yeyyd", targetIndices = [0,2,3,4]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * We can remove source[2] and source[3] in two operations.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == source.length &lt;= 3 * 103
 *
 * 1 &lt;= pattern.length &lt;= n
 *
 * 1 &lt;= targetIndices.length &lt;= n
 *
 * targetIndices is sorted in ascending order.
 *
 * The input is generated such that targetIndices contains distinct elements in the range [0, n - 1].
 *
 * source and pattern consist only of lowercase English letters.
 *
 * The input is generated such that pattern appears as a subsequence in source.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: At each index in <code>targetIndices</code>, make the choice to remove or not remove the character.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Two Pointers, String, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/find-maximum-removals-from-source-string/">LeetCode #3316</a>
 */
public class FindMaximumRemovalsFromSourceString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Maximum Removals From Source String");
    }

    public static void main(String[] args) {
        System.out.println("=== FindMaximumRemovalsFromSourceString ===");
        FindMaximumRemovalsFromSourceString sol = new FindMaximumRemovalsFromSourceString();
        System.out.println(sol.solve(null));
    }
}
