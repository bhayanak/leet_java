package org.leetcode.easy;


/**
 * <b>#1827 - Minimum Operations to Make the Array Increasing</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums (0-indexed). In one operation, you can choose an element of the array and increment it by 1.
 *
 *
 *
 *
 * For example, if nums = [1,2,3], you can choose to increment nums[1] to make nums = [1,3,3].
 *
 *
 *
 * Return the minimum number of operations needed to make nums strictly increasing.
 *
 *
 * An array nums is strictly increasing if nums[i] &lt; nums[i+1] for all 0 &lt;= i &lt; nums.length - 1. An array of length 1 is trivially strictly increasing.
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: nums = [1,1,1]
 * Output: 3
 * Explanation: You can do the following operations:
 * 1) Increment nums[2], so nums becomes [1,1,2].
 * 2) Increment nums[1], so nums becomes [1,2,2].
 * 3) Increment nums[2], so nums becomes [1,2,3].
 *
 *
 *
 *
 * Example 2:
 *
 *
 *
 * Input: nums = [1,5,2,4,1]
 * Output: 14
 *
 *
 *
 *
 * Example 3:
 *
 *
 *
 * Input: nums = [8]
 * Output: 0
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
 * 1 &lt;= nums.length &lt;= 5000
 *
 * 1 &lt;= nums[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: nums[i+1] must be at least equal to nums[i] + 1.
 * Hint 2: Think greedily. You don't have to increase nums[i+1] beyond nums[i]+1.
 * Hint 3: Iterate on i and set nums[i] = max(nums[i-1]+1, nums[i]) .
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/">LeetCode #1827</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class MinimumOperationsToMakeTheArrayIncreasing {

    /**
     * Computes the minimum Min operations.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minOperations(int[] nums) {
        int ops=0;
        for (int i=1;i<nums.length;i++) {
            if (nums[i]<=nums[i-1]) { ops+=nums[i-1]-nums[i]+1; nums[i]=nums[i-1]+1; }
        }
        return ops;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        MinimumOperationsToMakeTheArrayIncreasing sol = new MinimumOperationsToMakeTheArrayIncreasing();
                System.out.println(sol.minOperations(new int[]{1,1,1}));     // 3
                System.out.println(sol.minOperations(new int[]{1,5,2,4,1})); // 14
                System.out.println(sol.minOperations(new int[]{8}));         // 0
    }
}
