package org.leetcode.medium;


/**
 * <b>#2044 - Count Number of Maximum Bitwise-OR Subsets</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Backtracking, Bit Manipulation, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, find the maximum possible bitwise OR of a subset of nums and return the number of different non-empty subsets with the maximum bitwise OR.
 *
 *
 * An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b. Two subsets are considered different if the indices of the elements chosen are different.
 *
 *
 * The bitwise OR of an array a is equal to a[0] OR a[1] OR ... OR a[a.length - 1] (0-indexed).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,1]
 * Output: 2
 * Explanation: The maximum possible bitwise OR of a subset is 3. There are 2 subsets with a bitwise OR of 3:
 * - [3]
 * - [3,1]
 *
 * Example 2:
 *
 * Input: nums = [2,2,2]
 * Output: 7
 * Explanation: All non-empty subsets of [2,2,2] have a bitwise OR of 2. There are 23 - 1 = 7 total subsets.
 *
 * Example 3:
 *
 * Input: nums = [3,2,1,5]
 * Output: 6
 * Explanation: The maximum possible bitwise OR of a subset is 7. There are 6 subsets with a bitwise OR of 7:
 * - [3,5]
 * - [3,1,5]
 * - [3,2,5]
 * - [3,2,1,5]
 * - [2,5]
 * - [2,1,5]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 16
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we enumerate all possible subsets?
 * Hint 2: The maximum bitwise-OR is the bitwise-OR of the whole array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Backtracking, Bit Manipulation, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/count-number-of-maximum-bitwise-or-subsets/">LeetCode #2044</a>
 */
public class CountNumberOfMaximumBitwiseOrSubsets {

    /**
     * Counts Count max or subsets.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int countMaxOrSubsets(int[] nums) {
        int maxOr=0; for (int n:nums) maxOr|=n;
        int count=0;
        for (int mask=1;mask<(1<<nums.length);mask++) {
            int or=0;
            for (int i=0;i<nums.length;i++) if ((mask>>i&1)==1) or|=nums[i];
            if (or==maxOr) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountNumberOfMaximumBitwiseOrSubsets sol = new CountNumberOfMaximumBitwiseOrSubsets();
                System.out.println(sol.countMaxOrSubsets(new int[]{3,1}));    // 2
                System.out.println(sol.countMaxOrSubsets(new int[]{2,2,2}));  // 7
                System.out.println(sol.countMaxOrSubsets(new int[]{3,2,1,5})); // 6
    }
}
