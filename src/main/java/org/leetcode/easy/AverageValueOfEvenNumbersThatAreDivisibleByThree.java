package org.leetcode.easy;


/**
 * <b>#2455 - Average Value of Even Numbers That Are Divisible by Three</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.
 *
 *
 * Note that the average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,6,10,12,15]
 * Output: 9
 * Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9.
 *
 * Example 2:
 *
 * Input: nums = [1,2,4,7,10]
 * Output: 0
 * Explanation: There is no single number that satisfies the requirement, so return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What is the property of a number if it is divisible by both 2 and 3 at the same time?
 * Hint 2: It is equivalent to finding all the numbers that are divisible by 6.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 *
 * @see <a href="https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/">LeetCode #2455</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class AverageValueOfEvenNumbersThatAreDivisibleByThree {

    /**
     * Solves the problem: Average value.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int averageValue(int[] nums) {
        int sum=0, cnt=0;
        for (int n:nums) if (n%6==0) { sum+=n; cnt++; }
        return cnt==0?0:sum/cnt;
    }

    public static void main(String[] args) {
        AverageValueOfEvenNumbersThatAreDivisibleByThree sol = new AverageValueOfEvenNumbersThatAreDivisibleByThree();
                System.out.println(sol.averageValue(new int[]{1,3,6,10,12,15})); // 9
                System.out.println(sol.averageValue(new int[]{1,2,4,7,10})); // 0
    }
}
