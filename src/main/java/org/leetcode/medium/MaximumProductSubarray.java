package org.leetcode.medium;

/**
 * <b>#152 - Maximum Product Subarray</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, find a subarray that has the largest product, and return the product.
 * 
 * 
 * The test cases are generated so that the answer will fit in a 32-bit integer.
 * 
 * 
 * Note that the product of an array with a single element is the value of that element.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 * 
 * Example 2:
 * 
 * Input: nums = [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 2 * 104
 * 	
 * -10 &lt;= nums[i] &lt;= 10
 * 	
 * The product of any subarray of nums is guaranteed to fit in a 32-bit integer.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Track both the maximum and minimum product ending at each position.
 * A negative number can flip max↔min, so we always track both.
 * At each step: max = max(nums[i], prevMax*nums[i], prevMin*nums[i]).
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/maximum-product-subarray/">LeetCode #152</a>
 */
public class MaximumProductSubarray {

    /**
     * Finds the contiguous subarray with the largest product.
     * @param nums integer array (may contain negatives and zeros)
     * @return maximum product
     */
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) { int tmp = max; max = min; min = tmp; } // swap on negative
            max    = Math.max(nums[i], max * nums[i]);
            min    = Math.min(nums[i], min * nums[i]);
            result = Math.max(result, max);
        }
        return result;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac MaximumProductSubarray.java &amp;&amp; java org.leetcode.medium.MaximumProductSubarray
     *
     * @param args not used
     */
    public static void main(String[] args) {
        MaximumProductSubarray sol = new MaximumProductSubarray();
        System.out.println(sol.maxProduct(new int[]{2,3,-2,4}));  // 6
        System.out.println(sol.maxProduct(new int[]{-2,0,-1}));   // 0
    }
}
