package org.leetcode.easy;


/**
 * <b>#2769 - Find the Maximum Achievable Number</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integers, num and t. A number x is achievable if it can become equal to num after applying the following operation at most t times:
 *
 *
 * Increase or decrease x by 1, and simultaneously increase or decrease num by 1.
 *
 * Return the maximum possible value of x.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = 4, t = 1
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * Apply the following operation once to make the maximum achievable number equal to num:
 *
 *
 * Decrease the maximum achievable number by 1, and increase num by 1.
 *
 * Example 2:
 *
 * Input: num = 3, t = 2
 *
 *
 * Output: 7
 *
 *
 * Explanation:
 *
 *
 * Apply the following operation twice to make the maximum achievable number equal to num:
 *
 *
 * Decrease the maximum achievable number by 1, and increase num by 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num, t &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let x be the answer, it’s always optimal to decrease x in each operation and increase nums.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 *
 * @see <a href="https://leetcode.com/problems/find-the-maximum-achievable-number/">LeetCode #2769</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class FindTheMaximumAchievableNumber {

    /**
     * Computes the maximum Max increase keeping skyline.
     * Sorts the input first to enable efficient processing.
     *
     * @param minOperations the minOperations (int)
     * @param numOps the numOps (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int maxIncreaseKeepingSkyline(int minOperations, int numOps) {
        // Simplified: return basic computation
        return minOperations + numOps;
    }
    /**
     * Solves the problem: Maximum beauty val.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int maximumBeautyVal(int[] nums, int k) {
        java.util.Arrays.sort(nums);
        int max=0, left=0;
        for (int right=0;right<nums.length;right++) {
            while (nums[right]-nums[left]>2*k) left++;
            max=Math.max(max,right-left+1);
        }
        return max;
    }

    public static void main(String[] args) {
        FindTheMaximumAchievableNumber sol = new FindTheMaximumAchievableNumber();
        System.out.println(sol.maxIncreaseKeepingSkyline(0, 0));
    }
}
