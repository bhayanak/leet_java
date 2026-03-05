package org.leetcode.easy;


/**
 * <b>#1979 - Find Greatest Common Divisor of Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
 *
 *
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,5,6,9,10]
 * Output: 2
 * Explanation:
 * The smallest number in nums is 2.
 * The largest number in nums is 10.
 * The greatest common divisor of 2 and 10 is 2.
 *
 * Example 2:
 *
 * Input: nums = [7,5,6,8,3]
 * Output: 1
 * Explanation:
 * The smallest number in nums is 3.
 * The largest number in nums is 8.
 * The greatest common divisor of 3 and 8 is 1.
 *
 * Example 3:
 *
 * Input: nums = [3,3]
 * Output: 3
 * Explanation:
 * The smallest number in nums is 3.
 * The largest number in nums is 3.
 * The greatest common divisor of 3 and 3 is 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the minimum and maximum in one iteration. Let them be mn and mx.
 * Hint 2: Try all the numbers in the range [1, mn] and check the largest number which divides both of them.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Number Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-greatest-common-divisor-of-array/">LeetCode #1979</a>
  *
  * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
  */
public class FindGreatestCommonDivisorOfArray {

    /**
     * Finds Find g c d.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
      */
    public int findGCD(int[] nums) {
        int min=nums[0], max=nums[0];
        for (int n:nums) { min=Math.min(min,n); max=Math.max(max,n); }
        return gcd(min,max);
    }
    private int gcd(int a,int b) { return b==0?a:gcd(b,a%b); }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        FindGreatestCommonDivisorOfArray sol = new FindGreatestCommonDivisorOfArray();
                System.out.println(sol.findGCD(new int[]{2,5,6,9,10})); // 2
                System.out.println(sol.findGCD(new int[]{7,5,6,8,3}));  // 1
                System.out.println(sol.findGCD(new int[]{3,3}));         // 3
    }
}
