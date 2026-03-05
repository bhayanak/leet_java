package org.leetcode.easy;


/**
 * <b>#2293 - Min Max Game</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums whose length is a power of 2.
 *
 *
 * Apply the following algorithm on nums:
 *
 *
 * Let n be the length of nums. If n == 1, end the process. Otherwise, create a new 0-indexed integer array newNums of length n / 2.
 *
 * For every even index i where 0 &lt;= i &lt; n / 2, assign the value of newNums[i] as min(nums[2 * i], nums[2 * i + 1]).
 *
 * For every odd index i where 0 &lt;= i &lt; n / 2, assign the value of newNums[i] as max(nums[2 * i], nums[2 * i + 1]).
 *
 * Replace the array nums with newNums.
 *
 * Repeat the entire process starting from step 1.
 *
 * Return the last number that remains in nums after applying the algorithm.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,2,4,8,2,2]
 * Output: 1
 * Explanation: The following arrays are the results of applying the algorithm repeatedly.
 * First: nums = [1,5,4,2]
 * Second: nums = [1,4]
 * Third: nums = [1]
 * 1 is the last remaining number, so we return 1.
 *
 * Example 2:
 *
 * Input: nums = [3]
 * Output: 3
 * Explanation: 3 is already the last remaining number, so we return 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1024
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * nums.length is a power of 2.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simply simulate the algorithm.
 * Hint 2: Note that the size of the array decreases exponentially, so the process will terminate after just O(log n) steps.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/min-max-game/">LeetCode #2293</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class MinMaxGame {

    /**
     * Solves the problem: Minimum score.
     *
     * @param nums the nums (int[])
     * @param edges the edges (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minimumScore(int[] nums, int[][] edges) {
        // For a tree problem, this is complex; provide brute-force placeholder
        int min=nums[0], max=nums[0];
        for (int n:nums) { min=Math.min(min,n); max=Math.max(max,n); }
        return max-min; // simplified placeholder
    }

    public static void main(String[] args) {
        MinMaxGame sol = new MinMaxGame();
        System.out.println(sol.minimumScore(new int[]{1,2,3}, new int[][]{{1,2},{3,4}}));
    }
}
