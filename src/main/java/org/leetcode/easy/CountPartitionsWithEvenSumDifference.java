package org.leetcode.easy;


/**
 * <b>#3432 - Count Partitions with Even Sum Difference</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n.
 *
 *
 * A partition is defined as an index i where 0 &lt;= i &lt; n - 1, splitting the array into two non-empty subarrays such that:
 *
 *
 * Left subarray contains indices [0, i].
 *
 * Right subarray contains indices [i + 1, n - 1].
 *
 * Return the number of partitions where the difference between the sum of the left and right subarrays is even.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,10,3,7,6]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The 4 partitions are:
 *
 *
 * [10], [10, 3, 7, 6] with a sum difference of 10 - 26 = -16, which is even.
 *
 * [10, 10], [3, 7, 6] with a sum difference of 20 - 16 = 4, which is even.
 *
 * [10, 10, 3], [7, 6] with a sum difference of 23 - 13 = 10, which is even.
 *
 * [10, 10, 3, 7], [6] with a sum difference of 30 - 6 = 24, which is even.
 *
 * Example 2:
 *
 * Input: nums = [1,2,2]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * No partition results in an even sum difference.
 *
 * Example 3:
 *
 * Input: nums = [2,4,6,8]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * All partitions result in an even sum difference.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n == nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If the parity of the sum is even, the partition is valid; otherwise, there is no partition.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/count-partitions-with-even-sum-difference/">LeetCode #3432</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountPartitionsWithEvenSumDifference {

    /**
     * Counts Count partitions.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countPartitions(int[] nums) {
        int total=0; for (int n:nums) total+=n;
        if (total%2!=0) return nums.length-1;
        int cnt=0, pre=0;
        for (int i=0;i<nums.length-1;i++) {
            pre+=nums[i];
            if (pre%2!=total%2) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        CountPartitionsWithEvenSumDifference sol = new CountPartitionsWithEvenSumDifference();
        System.out.println(sol.countPartitions(new int[]{1,2,3}));
    }
}
