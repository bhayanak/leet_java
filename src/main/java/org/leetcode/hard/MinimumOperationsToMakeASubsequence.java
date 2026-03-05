package org.leetcode.hard;


/**
 * <b>#1713 - Minimum Operations to Make a Subsequence</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Binary Search, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array target that consists of distinct integers and another integer array arr that can have duplicates.
 *
 *
 * In one operation, you can insert any integer at any position in arr. For example, if arr = [1,4,1,2], you can add 3 in the middle and make it [1,4,3,1,2]. Note that you can insert the integer at the very beginning or end of the array.
 *
 *
 * Return the minimum number of operations needed to make target a subsequence of arr.
 *
 *
 * A subsequence of an array is a new array generated from the original array by deleting some elements (possibly none) without changing the remaining elements' relative order. For example, [2,7,4] is a subsequence of [4,2,3,7,2,1,4] (the underlined elements), while [2,4,2] is not.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: target = [5,1,3], arr = [9,4,2,3,4]
 * Output: 2
 * Explanation: You can add 5 and 1 in such a way that makes arr = [5,9,4,1,2,3,4], then target will be a subsequence of arr.
 *
 * Example 2:
 *
 * Input: target = [6,4,8,1,3,2], arr = [4,7,6,2,3,8,6,1]
 * Output: 3
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= target.length, arr.length &lt;= 105
 *
 * 1 &lt;= target[i], arr[i] &lt;= 109
 *
 * target contains no duplicates.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The problem can be reduced to computing Longest Common Subsequence between both arrays.
 * Hint 2: Since one of the arrays has distinct elements, we can consider that these elements describe an arrangement of numbers, and we can replace each element in the other array with the index it appeared at in the first array.
 * Hint 3: Then the problem is converted to finding Longest Increasing Subsequence in the second array, which can be done in O(n log n).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Binary Search, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-make-a-subsequence/">LeetCode #1713</a>
 */
public class MinimumOperationsToMakeASubsequence {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Make a Subsequence");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToMakeASubsequence ===");
        MinimumOperationsToMakeASubsequence sol = new MinimumOperationsToMakeASubsequence();
        System.out.println(sol.solve(null));
    }
}
