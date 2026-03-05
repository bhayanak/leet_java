package org.leetcode.medium;


/**
 * <b>#2653 - Sliding Subarray Beauty</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums containing n integers, find the beauty of each subarray of size k.
 *
 *
 * The beauty of a subarray is the xth smallest integer in the subarray if it is negative, or 0 if there are fewer than x negative integers.
 *
 *
 * Return an integer array containing n - k + 1 integers, which denote the beauty of the subarrays in order from the first index in the array.
 *
 *
 *
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,-1,-3,-2,3], k = 3, x = 2
 * Output: [-1,-2,-2]
 * Explanation: There are 3 subarrays with size k = 3. 
 * The first subarray is [1, -1, -3] and the 2nd smallest negative integer is -1. 
 * The second subarray is [-1, -3, -2] and the 2nd smallest negative integer is -2. 
 * The third subarray is [-3, -2, 3] and the 2nd smallest negative integer is -2.
 *
 * Example 2:
 *
 * Input: nums = [-1,-2,-3,-4,-5], k = 2, x = 2
 * Output: [-1,-2,-3,-4]
 * Explanation: There are 4 subarrays with size k = 2.
 * For [-1, -2], the 2nd smallest negative integer is -1.
 * For [-2, -3], the 2nd smallest negative integer is -2.
 * For [-3, -4], the 2nd smallest negative integer is -3.
 * For [-4, -5], the 2nd smallest negative integer is -4. 
 *
 * Example 3:
 *
 * Input: nums = [-3,1,2,-3,0,-3], k = 2, x = 1
 * Output: [-3,0,-3,-3,-3]
 * Explanation: There are 5 subarrays with size k = 2.
 * For [-3, 1], the 1st smallest negative integer is -3.
 * For [1, 2], there is no negative integer so the beauty is 0.
 * For [2, -3], the 1st smallest negative integer is -3.
 * For [-3, 0], the 1st smallest negative integer is -3.
 * For [0, -3], the 1st smallest negative integer is -3.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums.length 
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= k &lt;= n
 *
 * 1 &lt;= x &lt;= k 
 *
 * -50 &lt;= nums[i] &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to maintain the frequency of negative numbers in the current window of size k.
 * Hint 2: The x^th smallest negative integer can be gotten by iterating through the frequencies of the numbers in order.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/sliding-subarray-beauty/">LeetCode #2653</a>
 */
public class SlidingSubarrayBeauty {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sliding Subarray Beauty");
    }

    public static void main(String[] args) {
        System.out.println("=== SlidingSubarrayBeauty ===");
        SlidingSubarrayBeauty sol = new SlidingSubarrayBeauty();
        System.out.println(sol.solve(null));
    }
}
