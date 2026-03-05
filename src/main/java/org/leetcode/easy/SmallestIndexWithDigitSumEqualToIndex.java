package org.leetcode.easy;


/**
 * <b>#3550 - Smallest Index With Digit Sum Equal to Index</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * Return the smallest index i such that the sum of the digits of nums[i] is equal to i.
 *
 *
 * If no such index exists, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,2]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * For nums[2] = 2, the sum of digits is 2, which is equal to index i = 2. Thus, the output is 2.
 *
 * Example 2:
 *
 * Input: nums = [1,10,11]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * For nums[1] = 10, the sum of digits is 1 + 0 = 1, which is equal to index i = 1.
 *
 * For nums[2] = 11, the sum of digits is 1 + 1 = 2, which is equal to index i = 2.
 *
 * Since index 1 is the smallest, the output is 1.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * Since no index satisfies the condition, the output is -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 0 &lt;= nums[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate as described
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 *
 * @see <a href="https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/">LeetCode #3550</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class SmallestIndexWithDigitSumEqualToIndex {

    /**
     * Solves the problem: Smallest index2.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int smallestIndex2(int[] nums) {
        for (int i=0;i<nums.length;i++) {
            int s=0,tmp=nums[i]; while(tmp>0){s+=tmp%10;tmp/=10;}
            if (s==i) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        SmallestIndexWithDigitSumEqualToIndex sol = new SmallestIndexWithDigitSumEqualToIndex();
                System.out.println(sol.smallestIndex2(new int[]{1,3,2})); // 2
                System.out.println(sol.smallestIndex2(new int[]{1,10,11})); // 1
    }
}
