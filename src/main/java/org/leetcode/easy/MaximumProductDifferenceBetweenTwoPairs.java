package org.leetcode.easy;


/**
 * <b>#1913 - Maximum Product Difference Between Two Pairs</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).
 *
 *
 *
 *
 * For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
 *
 *
 *
 * Given an integer array nums, choose four distinct indices w, x, y, and z such that the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.
 *
 *
 * Return the maximum such product difference.
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: nums = [5,6,2,7,4]
 * Output: 34
 * Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
 * The product difference is (6 * 7) - (2 * 4) = 34.
 *
 *
 *
 *
 * Example 2:
 *
 *
 *
 * Input: nums = [4,2,5,9,7,4,8]
 * Output: 64
 * Explanation: We can choose indices 3 and 6 for the first pair (9, 8) and indices 1 and 5 for the second pair (2, 4).
 * The product difference is (9 * 8) - (2 * 4) = 64.
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * 4 &lt;= nums.length &lt;= 104
 *
 * 1 &lt;= nums[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If you only had to find the maximum product of 2 numbers in an array, which 2 numbers should you choose?
 * Hint 2: We only need to worry about 4 numbers in the array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-product-difference-between-two-pairs/">LeetCode #1913</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class MaximumProductDifferenceBetweenTwoPairs {

    /**
     * Computes the maximum Max product difference.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int maxProductDifference(int[] nums) {
        java.util.Arrays.sort(nums);
        int n=nums.length;
        return nums[n-1]*nums[n-2] - nums[0]*nums[1];
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        MaximumProductDifferenceBetweenTwoPairs sol = new MaximumProductDifferenceBetweenTwoPairs();
                System.out.println(sol.maxProductDifference(new int[]{5,6,2,7,4})); // 34
                System.out.println(sol.maxProductDifference(new int[]{4,2,5,9,7,4,8})); // 64
    }
}
