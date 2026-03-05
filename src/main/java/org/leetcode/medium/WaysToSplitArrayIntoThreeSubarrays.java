package org.leetcode.medium;


/**
 * <b>#1712 - Ways to Split Array Into Three Subarrays</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A split of an integer array is good if:
 *
 *
 * The array is split into three non-empty contiguous subarrays - named left, mid, right respectively from left to right.
 *
 * The sum of the elements in left is less than or equal to the sum of the elements in mid, and the sum of the elements in mid is less than or equal to the sum of the elements in right.
 *
 * Given nums, an array of non-negative integers, return the number of good ways to split nums. As the number may be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1]
 * Output: 1
 * Explanation: The only good way to split nums is [1] [1] [1].
 *
 * Example 2:
 *
 * Input: nums = [1,2,2,2,5,0]
 * Output: 3
 * Explanation: There are three good ways of splitting nums:
 * [1] [2] [2,2,5,0]
 * [1] [2,2] [2,5,0]
 * [1,2] [2,2] [5,0]
 *
 * Example 3:
 *
 * Input: nums = [3,2,1]
 * Output: 0
 * Explanation: There is no good way to split nums.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create a prefix array to efficiently find the sum of subarrays.
 * Hint 2: As we are dividing the array into three subarrays, there are two "walls". Iterate over the right wall positions and find where the left wall could be for each right wall position.
 * Hint 3: Use binary search to find the left-most position and right-most position the left wall could be.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/ways-to-split-array-into-three-subarrays/">LeetCode #1712</a>
 */
public class WaysToSplitArrayIntoThreeSubarrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Ways to Split Array Into Three Subarrays");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== WaysToSplitArrayIntoThreeSubarrays ===");
        WaysToSplitArrayIntoThreeSubarrays sol = new WaysToSplitArrayIntoThreeSubarrays();
        System.out.println(sol.solve(null));
    }
}
