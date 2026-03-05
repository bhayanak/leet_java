package org.leetcode.medium;

/**
 * <b>#238 - Product of Array Except Self</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * 
 * 
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * 
 * 
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 2 &lt;= nums.length &lt;= 105
 * 	
 * -30 &lt;= nums[i] &lt;= 30
 * 	
 * The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
 * 
 *  
 * 
 * Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think how you can efficiently utilize prefix and suffix products to calculate the product of all elements except self for each index. Can you pre-compute the prefix and suffix products in linear time to avoid redundant calculations?
 * Hint 2: Can you minimize additional space usage by reusing memory or modifying the input array to store intermediate results?
 *
 * <h2>Approach</h2>
 * Two passes: first pass fills prefix products left-to-right.
 * Second pass multiplies from right while carrying a running suffix product.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1) output array only
 *
 * @see <a href="https://leetcode.com/problems/product-of-array-except-self/">LeetCode #238</a>
 */
public class ProductOfArrayExceptSelf {

    /**
     * Solves the problem: Product except self.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
     */
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] out = new int[n];
        out[0]=1;
        for (int i=1;i<n;i++) out[i]=out[i-1]*nums[i-1]; // prefix
        int suf=1;
        for (int i=n-1;i>=0;i--){out[i]*=suf;suf*=nums[i];} // suffix
        return out;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        ProductOfArrayExceptSelf sol = new ProductOfArrayExceptSelf();
        System.out.println(java.util.Arrays.toString(sol.productExceptSelf(new int[]{1,2,3,4}))); // [24,12,8,6]
        System.out.println(java.util.Arrays.toString(sol.productExceptSelf(new int[]{-1,1,0,-3,3}))); // [0,0,9,0,0]
    }
}
