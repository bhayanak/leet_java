package org.leetcode.easy;


/**
 * <b>#1413 - Minimum Value to Get Positive Step by Step Sum</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers nums, you start with an initial positive value startValue.
 *
 *
 * In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).
 *
 *
 * Return the minimum positive value of startValue such that the step by step sum is never less than 1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-3,2,-3,4,2]
 * Output: 5
 * Explanation: If you choose startValue = 4, in the third iteration your step by step sum is less than 1.
 * step by step sum
 * startValue = 4 | startValue = 5 | nums
 *   (4 -3 ) = 1  | (5 -3 ) = 2    |  -3
 *   (1 +2 ) = 3  | (2 +2 ) = 4    |   2
 *   (3 -3 ) = 0  | (4 -3 ) = 1    |  -3
 *   (0 +4 ) = 4  | (1 +4 ) = 5    |   4
 *   (4 +2 ) = 6  | (5 +2 ) = 7    |   2
 *
 * Example 2:
 *
 * Input: nums = [1,2]
 * Output: 1
 * Explanation: Minimum start value should be positive. 
 *
 * Example 3:
 *
 * Input: nums = [1,-2,-3]
 * Output: 5
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * -100 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the minimum prefix sum.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/">LeetCode #1413</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class MinimumValueToGetPositiveStepByStepSum {

    /**
     * Computes the minimum Min start value.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minStartValue(int[] nums) {
        int minSum=0, sum=0;
        for (int n : nums) { sum+=n; minSum=Math.min(minSum,sum); }
        return Math.max(1, 1-minSum);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        MinimumValueToGetPositiveStepByStepSum sol = new MinimumValueToGetPositiveStepByStepSum();
                System.out.println(sol.minStartValue(new int[]{-3,2,-3,4,2})); // 5
                System.out.println(sol.minStartValue(new int[]{1,2}));          // 1
                System.out.println(sol.minStartValue(new int[]{1,-2,-3}));      // 5
    }
}
