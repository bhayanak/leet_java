package org.leetcode.hard;


/**
 * <b>#2321 - Maximum Score Of Spliced Array</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two 0-indexed integer arrays nums1 and nums2, both of length n.
 *
 *
 * You can choose two integers left and right where 0 &lt;= left &lt;= right &lt; n and swap the subarray nums1[left...right] with the subarray nums2[left...right].
 *
 *
 * For example, if nums1 = [1,2,3,4,5] and nums2 = [11,12,13,14,15] and you choose left = 1 and right = 2, nums1 becomes [1,12,13,4,5] and nums2 becomes [11,2,3,14,15].
 *
 * You may choose to apply the mentioned operation once or not do anything.
 *
 *
 * The score of the arrays is the maximum of sum(nums1) and sum(nums2), where sum(arr) is the sum of all the elements in the array arr.
 *
 *
 * Return the maximum possible score.
 *
 *
 * A subarray is a contiguous sequence of elements within an array. arr[left...right] denotes the subarray that contains the elements of nums between indices left and right (inclusive).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [60,60,60], nums2 = [10,90,10]
 * Output: 210
 * Explanation: Choosing left = 1 and right = 1, we have nums1 = [60,90,60] and nums2 = [10,60,10].
 * The score is max(sum(nums1), sum(nums2)) = max(210, 80) = 210.
 *
 * Example 2:
 *
 * Input: nums1 = [20,40,20,70,30], nums2 = [50,20,50,40,20]
 * Output: 220
 * Explanation: Choosing left = 3, right = 4, we have nums1 = [20,40,20,40,20] and nums2 = [50,20,50,70,30].
 * The score is max(sum(nums1), sum(nums2)) = max(140, 220) = 220.
 *
 * Example 3:
 *
 * Input: nums1 = [7,11,13], nums2 = [1,1,1]
 * Output: 31
 * Explanation: We choose not to swap any subarray.
 * The score is max(sum(nums1), sum(nums2)) = max(31, 3) = 31.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums1.length == nums2.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= nums1[i], nums2[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think on Dynamic Programming.
 * Hint 2: First assume you will be taking the array a and choose some subarray from b
 * Hint 3: Suppose the DP is DP(pos, state). pos is the current position you are in. state is one of {0,1,2}, where 0 means taking the array a, 1 means we are taking the subarray b, and 2 means we are again taking the array a. We need to handle the transitions carefully.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/maximum-score-of-spliced-array/">LeetCode #2321</a>
 */
public class MaximumScoreOfSplicedArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Score Of Spliced Array");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumScoreOfSplicedArray ===");
        MaximumScoreOfSplicedArray sol = new MaximumScoreOfSplicedArray();
        System.out.println(sol.solve(null));
    }
}
