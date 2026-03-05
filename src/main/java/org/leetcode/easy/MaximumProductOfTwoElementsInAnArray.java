package org.leetcode.easy;


/**
 * <b>#1464 - Maximum Product of Two Elements in an Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,4,5,2]
 * Output: 12 
 * Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
 *
 * Example 2:
 *
 * Input: nums = [1,5,4,5]
 * Output: 16
 * Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
 *
 * Example 3:
 *
 * Input: nums = [3,7]
 * Output: 12
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 500
 *
 * 1 &lt;= nums[i] &lt;= 10^3
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use brute force: two loops to select i and j, then select the maximum value of (nums[i]-1)*(nums[j]-1).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/">LeetCode #1464</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumProductOfTwoElementsInAnArray {

    /**
     * Computes the maximum Max product.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maxProduct(int[] nums) {
        int m1=0, m2=0;
        for (int n : nums) {
            if (n>m1) { m2=m1; m1=n; } else if (n>m2) m2=n;
        }
        return (m1-1)*(m2-1);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        MaximumProductOfTwoElementsInAnArray sol = new MaximumProductOfTwoElementsInAnArray();
                System.out.println(sol.maxProduct(new int[]{3,4,5,2})); // 12
                System.out.println(sol.maxProduct(new int[]{1,5,4,5})); // 16
                System.out.println(sol.maxProduct(new int[]{3,7}));     // 12
    }
}
