package org.leetcode.easy;


/**
 * <b>#2239 - Find Closest Number to Zero</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums of size n, return the number with the value closest to 0 in nums. If there are multiple answers, return the number with the largest value.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-4,-2,1,4,8]
 * Output: 1
 * Explanation:
 * The distance from -4 to 0 is |-4| = 4.
 * The distance from -2 to 0 is |-2| = 2.
 * The distance from 1 to 0 is |1| = 1.
 * The distance from 4 to 0 is |4| = 4.
 * The distance from 8 to 0 is |8| = 8.
 * Thus, the closest number to 0 in the array is 1.
 *
 * Example 2:
 *
 * Input: nums = [2,-1,1]
 * Output: 1
 * Explanation: 1 and -1 are both the closest numbers to 0, so 1 being larger is returned.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1000
 *
 * -105 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Keep track of the number closest to 0 as you iterate through the array.
 * Hint 2: Ensure that if multiple numbers are closest to 0, you store the one with the largest value.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/find-closest-number-to-zero/">LeetCode #2239</a>
  *
  * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
  */
public class FindClosestNumberToZero {

    /**
     * Finds Find closest number.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
      */
    public int findClosestNumber(int[] nums) {
        int res=nums[0];
        for (int n:nums) {
            if (Math.abs(n)<Math.abs(res) || (Math.abs(n)==Math.abs(res) && n>res)) res=n;
        }
        return res;
    }

    public static void main(String[] args) {
        FindClosestNumberToZero sol = new FindClosestNumberToZero();
                System.out.println(sol.findClosestNumber(new int[]{-4,-2,1,4,8})); // 1
                System.out.println(sol.findClosestNumber(new int[]{2,-1,1}));       // 1
    }
}
