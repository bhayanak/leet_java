package org.leetcode.easy;


/**
 * <b>#2176 - Count Equal and Divisible Pairs in an Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) where 0 &lt;= i &lt; j &lt; n, such that nums[i] == nums[j] and (i * j) is divisible by k.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,1,2,2,2,1,3], k = 2
 * Output: 4
 * Explanation:
 * There are 4 pairs that meet all the requirements:
 * - nums[0] == nums[6], and 0 * 6 == 0, which is divisible by 2.
 * - nums[2] == nums[3], and 2 * 3 == 6, which is divisible by 2.
 * - nums[2] == nums[4], and 2 * 4 == 8, which is divisible by 2.
 * - nums[3] == nums[4], and 3 * 4 == 12, which is divisible by 2.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4], k = 1
 * Output: 0
 * Explanation: Since no value in nums is repeated, there are no pairs (i,j) that meet all the requirements.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i], k &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For every possible pair of indices (i, j) where i &lt; j, check if it satisfies the given conditions.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/">LeetCode #2176</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountEqualAndDivisiblePairsInAnArray {

    /**
     * Counts Count pairs.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countPairs(int[] nums, int k) {
        int count=0;
        for (int i=0;i<nums.length-1;i++)
            for (int j=i+1;j<nums.length;j++)
                if (nums[i]==nums[j] && (i*j)%k==0) count++;
        return count;
    }

    public static void main(String[] args) {
        CountEqualAndDivisiblePairsInAnArray sol = new CountEqualAndDivisiblePairsInAnArray();
                System.out.println(sol.countPairs(new int[]{3,1,2,2,2,1,3},2)); // 4
                System.out.println(sol.countPairs(new int[]{1,2,3,4},1)); // 0
    }
}
