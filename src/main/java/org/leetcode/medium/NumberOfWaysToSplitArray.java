package org.leetcode.medium;


/**
 * <b>#2270 - Number of Ways to Split Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums of length n.
 *
 *
 * nums contains a valid split at index i if the following are true:
 *
 *
 * The sum of the first i + 1 elements is greater than or equal to the sum of the last n - i - 1 elements.
 *
 * There is at least one element to the right of i. That is, 0 &lt;= i &lt; n - 1.
 *
 * Return the number of valid splits in nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,4,-8,7]
 * Output: 2
 * Explanation: 
 * There are three ways of splitting nums into two non-empty parts:
 * - Split nums at index 0. Then, the first part is [10], and its sum is 10. The second part is [4,-8,7], and its sum is 3. Since 10 &gt;= 3, i = 0 is a valid split.
 * - Split nums at index 1. Then, the first part is [10,4], and its sum is 14. The second part is [-8,7], and its sum is -1. Since 14 &gt;= -1, i = 1 is a valid split.
 * - Split nums at index 2. Then, the first part is [10,4,-8], and its sum is 6. The second part is [7], and its sum is 7. Since 6 &lt; 7, i = 2 is not a valid split.
 * Thus, the number of valid splits in nums is 2.
 *
 * Example 2:
 *
 * Input: nums = [2,3,1,0]
 * Output: 2
 * Explanation: 
 * There are two valid splits in nums:
 * - Split nums at index 1. Then, the first part is [2,3], and its sum is 5. The second part is [1,0], and its sum is 1. Since 5 &gt;= 1, i = 1 is a valid split. 
 * - Split nums at index 2. Then, the first part is [2,3,1], and its sum is 6. The second part is [0], and its sum is 0. Since 6 &gt;= 0, i = 2 is a valid split.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * -105 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For any index i, how can we find the sum of the first (i+1) elements from the sum of the first i elements?
 * Hint 2: If the total sum of the array is known, how can we check if the sum of the first (i+1) elements greater than or equal to the remaining elements?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/number-of-ways-to-split-array/">LeetCode #2270</a>
 */
public class NumberOfWaysToSplitArray {

    /**
     * Solves the problem: Ways to split array.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int waysToSplitArray(int[] nums) {
        long total=0; for (int n:nums) total+=n;
        long left=0; int count=0;
        for (int i=0;i<nums.length-1;i++) {
            left+=nums[i]; if (left>=total-left) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfWaysToSplitArray sol = new NumberOfWaysToSplitArray();
                System.out.println(sol.waysToSplitArray(new int[]{10,4,-8,7})); // 2
                System.out.println(sol.waysToSplitArray(new int[]{2,3,1,0}));   // 2
    }
}
