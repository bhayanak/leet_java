package org.leetcode.medium;


/**
 * <b>#1764 - Form Array by Concatenating Subarrays of Another Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Greedy, String Matching</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array groups of length n. You are also given an integer array nums.
 *
 *
 * You are asked if you can choose n disjoint subarrays from the array nums such that the ith subarray is equal to groups[i] (0-indexed), and if i &gt; 0, the (i-1)th subarray appears before the ith subarray in nums (i.e. the subarrays must be in the same order as groups).
 *
 *
 * Return true if you can do this task, and false otherwise.
 *
 *
 * Note that the subarrays are disjoint if and only if there is no index k such that nums[k] belongs to more than one subarray. A subarray is a contiguous sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: groups = [[1,-1,-1],[3,-2,0]], nums = [1,-1,0,1,-1,-1,3,-2,0]
 * Output: true
 * Explanation: You can choose the 0th subarray as [1,-1,0,1,-1,-1,3,-2,0] and the 1st one as [1,-1,0,1,-1,-1,3,-2,0].
 * These subarrays are disjoint as they share no common nums[k] element.
 *
 * Example 2:
 *
 * Input: groups = [[10,-2],[1,2,3,4]], nums = [1,2,3,4,10,-2]
 * Output: false
 * Explanation: Note that choosing the subarrays [1,2,3,4,10,-2] and [1,2,3,4,10,-2] is incorrect because they are not in the same order as in groups.
 * [10,-2] must come before [1,2,3,4].
 *
 * Example 3:
 *
 * Input: groups = [[1,2,3],[3,4]], nums = [7,7,1,2,3,4,7,7]
 * Output: false
 * Explanation: Note that choosing the subarrays [7,7,1,2,3,4,7,7] and [7,7,1,2,3,4,7,7] is invalid because they are not disjoint.
 * They share a common elements nums[4] (0-indexed).
 *
 *
 *
 * Constraints:
 *
 *
 * groups.length == n
 *
 * 1 &lt;= n &lt;= 103
 *
 * 1 &lt;= groups[i].length, sum(groups[i].length) &lt;= 103
 *
 * 1 &lt;= nums.length &lt;= 103
 *
 * -107 &lt;= groups[i][j], nums[k] &lt;= 107
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: When we use a subarray, the room for the next subarrays will be the suffix after the used subarray.
 * Hint 2: If we can match a group with multiple subarrays, we should choose the first one, as this will just leave the largest room for the next subarrays.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Greedy, String Matching).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/form-array-by-concatenating-subarrays-of-another-array/">LeetCode #1764</a>
 */
public class FormArrayByConcatenatingSubarraysOfAnotherArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Form Array by Concatenating Subarrays of Another Array");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FormArrayByConcatenatingSubarraysOfAnotherArray ===");
        FormArrayByConcatenatingSubarraysOfAnotherArray sol = new FormArrayByConcatenatingSubarraysOfAnotherArray();
        System.out.println(sol.solve(null));
    }
}
