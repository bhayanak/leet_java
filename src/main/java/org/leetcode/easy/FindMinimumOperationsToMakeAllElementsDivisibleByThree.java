package org.leetcode.easy;


/**
 * <b>#3190 - Find Minimum Operations to Make All Elements Divisible by Three</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.
 *
 *
 * Return the minimum number of operations to make all elements of nums divisible by 3.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * All array elements can be made divisible by 3 using 3 operations:
 *
 *
 * Subtract 1 from 1.
 *
 * Add 1 to 2.
 *
 * Subtract 1 from 4.
 *
 * Example 2:
 *
 * Input: nums = [3,6,9]
 *
 *
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 50
 *
 * 1 &lt;= nums[i] &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If <code>x % 3 != 0</code> we can always increment or decrement <code>x</code> such that we only need 1 operation.
 * Hint 2: Add <code>min(nums[i] % 3, 3 - (nums[i] % 3))</code> to the count of operations.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 *
 * @see <a href="https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/">LeetCode #3190</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {

    /**
     * Solves the problem: Minimum operations.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minimumOperations(int[] nums) {
        int ops=0;
        for (int n:nums) ops+=Math.min(n%3, 3-n%3);
        return ops;
    }

    public static void main(String[] args) {
        FindMinimumOperationsToMakeAllElementsDivisibleByThree sol = new FindMinimumOperationsToMakeAllElementsDivisibleByThree();
        System.out.println(sol.minimumOperations(new int[]{1,2,3}));
    }
}
