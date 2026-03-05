package org.leetcode.medium;


/**
 * <b>#1574 - Shortest Subarray to be Removed to Make Array Sorted</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Stack, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array arr, remove a subarray (can be empty) from arr such that the remaining elements in arr are non-decreasing.
 *
 *
 * Return the length of the shortest subarray to remove.
 *
 *
 * A subarray is a contiguous subsequence of the array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,2,3,10,4,2,3,5]
 * Output: 3
 * Explanation: The shortest subarray we can remove is [10,4,2] of length 3. The remaining elements after that will be [1,2,3,3,5] which are sorted.
 * Another correct solution is to remove the subarray [3,10,4].
 *
 * Example 2:
 *
 * Input: arr = [5,4,3,2,1]
 * Output: 4
 * Explanation: Since the array is strictly decreasing, we can only keep a single element. Therefore we need to remove a subarray of length 4, either [5,4,3,2] or [4,3,2,1].
 *
 * Example 3:
 *
 * Input: arr = [1,2,3]
 * Output: 0
 * Explanation: The array is already non-decreasing. We do not need to remove any elements.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 105
 *
 * 0 &lt;= arr[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The key is to find the longest non-decreasing subarray starting with the first element or ending with the last element, respectively.
 * Hint 2: After removing some subarray, the result is the concatenation of a sorted prefix and a sorted suffix, where the last element of the prefix is smaller than the first element of the suffix.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search, Stack, Monotonic Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/shortest-subarray-to-be-removed-to-make-array-sorted/">LeetCode #1574</a>
 */
public class ShortestSubarrayToBeRemovedToMakeArraySorted {

    /**
     * Solves the problem and Solve.
     * Sorts the input first to enable efficient processing.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shortest Subarray to be Removed to Make Array Sorted");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ShortestSubarrayToBeRemovedToMakeArraySorted ===");
        ShortestSubarrayToBeRemovedToMakeArraySorted sol = new ShortestSubarrayToBeRemovedToMakeArraySorted();
        System.out.println(sol.solve(null));
    }
}
