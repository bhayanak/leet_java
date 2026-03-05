package org.leetcode.easy;


/**
 * <b>#3452 - Sum of Good Numbers</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers nums and an integer k, an element nums[i] is considered good if it is strictly greater than the elements at indices i - k and i + k (if those indices exist). If neither of these indices exists, nums[i] is still considered good.
 *
 *
 * Return the sum of all the good elements in the array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,2,1,5,4], k = 2
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * The good numbers are nums[1] = 3, nums[4] = 5, and nums[5] = 4 because they are strictly greater than the numbers at indices i - k and i + k.
 *
 * Example 2:
 *
 * Input: nums = [2,1], k = 1
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The only good number is nums[0] = 2 because it is strictly greater than nums[1].
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 1000
 *
 * 1 &lt;= k &lt;= floor(nums.length / 2)
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each index, check if <code>nums[i]</code> is strictly greater than <code>nums[i - k]</code> and <code>nums[i + k]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/sum-of-good-numbers/">LeetCode #3452</a>
  *
  * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
  */
public class SumOfGoodNumbers {

    /**
     * Computes the sum of Sum of good numbers.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0, n=nums.length;
        for (int i=0;i<n;i++) {
            boolean good=true;
            if (i-k>=0&&nums[i-k]>=nums[i]) good=false;
            if (i+k<n&&nums[i+k]>=nums[i]) good=false;
            if (good) sum+=nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfGoodNumbers sol = new SumOfGoodNumbers();
                System.out.println(sol.sumOfGoodNumbers(new int[]{1,3,2,1,5,4},2)); // 8
                System.out.println(sol.sumOfGoodNumbers(new int[]{2,1},1));          // 2
    }
}
