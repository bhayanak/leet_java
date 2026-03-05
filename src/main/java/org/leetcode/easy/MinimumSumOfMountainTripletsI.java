package org.leetcode.easy;


/**
 * <b>#2908 - Minimum Sum of Mountain Triplets I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array nums of integers.
 *
 *
 * A triplet of indices (i, j, k) is a mountain if:
 *
 *
 * i &lt; j &lt; k
 *
 * nums[i] &lt; nums[j] and nums[k] &lt; nums[j]
 *
 * Return the minimum possible sum of a mountain triplet of nums. If no such triplet exists, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [8,6,1,5,3]
 * Output: 9
 * Explanation: Triplet (2, 3, 4) is a mountain triplet of sum 9 since: 
 * - 2 &lt; 3 &lt; 4
 * - nums[2] &lt; nums[3] and nums[4] &lt; nums[3]
 * And the sum of this triplet is nums[2] + nums[3] + nums[4] = 9. It can be shown that there are no mountain triplets with a sum of less than 9.
 *
 * Example 2:
 *
 * Input: nums = [5,4,8,7,10,2]
 * Output: 13
 * Explanation: Triplet (1, 3, 5) is a mountain triplet of sum 13 since: 
 * - 1 &lt; 3 &lt; 5
 * - nums[1] &lt; nums[3] and nums[5] &lt; nums[3]
 * And the sum of this triplet is nums[1] + nums[3] + nums[5] = 13. It can be shown that there are no mountain triplets with a sum of less than 13.
 *
 * Example 3:
 *
 * Input: nums = [6,5,4,3,4,5]
 * Output: -1
 * Explanation: It can be shown that there are no mountain triplets in nums.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 50
 *
 * 1 &lt;= nums[i] &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Bruteforce over all possible triplets.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/minimum-sum-of-mountain-triplets-i/">LeetCode #2908</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class MinimumSumOfMountainTripletsI {

    /**
     * Solves the problem: Minimum sum.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minimumSum(int[] nums) {
        int min=Integer.MAX_VALUE;
        for (int i=1;i<nums.length-1;i++) {
            int left=nums[0]; for (int j=1;j<i;j++) left=Math.min(left,nums[j]);
            int right=nums[i+1]; for (int j=i+2;j<nums.length;j++) right=Math.min(right,nums[j]);
            if (nums[i]>left&&nums[i]>right) min=Math.min(min,left+nums[i]+right);
        }
        return min==Integer.MAX_VALUE?-1:min;
    }

    public static void main(String[] args) {
        MinimumSumOfMountainTripletsI sol = new MinimumSumOfMountainTripletsI();
        System.out.println(sol.minimumSum(new int[]{1,2,3}));
    }
}
