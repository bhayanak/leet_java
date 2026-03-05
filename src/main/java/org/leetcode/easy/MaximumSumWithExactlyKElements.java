package org.leetcode.easy;


/**
 * <b>#2656 - Maximum Sum With Exactly K Elements </b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums and an integer k. Your task is to perform the following operation exactly k times in order to maximize your score:
 *
 *
 * Select an element m from nums.
 *
 * Remove the selected element m from the array.
 *
 * Add a new element with a value of m + 1 to the array.
 *
 * Increase your score by m.
 *
 * Return the maximum score you can achieve after performing the operation exactly k times.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5], k = 3
 * Output: 18
 * Explanation: We need to choose exactly 3 elements from nums to maximize the sum.
 * For the first iteration, we choose 5. Then sum is 5 and nums = [1,2,3,4,6]
 * For the second iteration, we choose 6. Then sum is 5 + 6 and nums = [1,2,3,4,7]
 * For the third iteration, we choose 7. Then sum is 5 + 6 + 7 = 18 and nums = [1,2,3,4,8]
 * So, we will return 18.
 * It can be proven, that 18 is the maximum answer that we can achieve.
 *
 * Example 2:
 *
 * Input: nums = [5,5,5], k = 2
 * Output: 11
 * Explanation: We need to choose exactly 2 elements from nums to maximize the sum.
 * For the first iteration, we choose 5. Then sum is 5 and nums = [5,5,6]
 * For the second iteration, we choose 6. Then sum is 5 + 6 = 11 and nums = [5,5,7]
 * So, we will return 11.
 * It can be proven, that 11 is the maximum answer that we can achieve.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 100
 *
 * 1 &lt;= k &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/">LeetCode #2656</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumSumWithExactlyKElements {

    /**
     * Solves the problem: Maximize sum.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maximizeSum(int[] nums, int k) {
        int max=nums[0]; for (int n:nums) max=Math.max(max,n);
        return max*k + k*(k-1)/2;
    }

    public static void main(String[] args) {
        MaximumSumWithExactlyKElements sol = new MaximumSumWithExactlyKElements();
        System.out.println(sol.maximizeSum(new int[]{1,2,3}, 0));
    }
}
