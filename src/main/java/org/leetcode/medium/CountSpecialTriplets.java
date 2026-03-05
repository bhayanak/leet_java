package org.leetcode.medium;


/**
 * <b>#3583 - Count Special Triplets</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * A special triplet is defined as a triplet of indices (i, j, k) such that:
 *
 *
 * 0 &lt;= i &lt; j &lt; k &lt; n, where n = nums.length
 *
 * nums[i] == nums[j] * 2
 *
 * nums[k] == nums[j] * 2
 *
 * Return the total number of special triplets in the array.
 *
 *
 * Since the answer may be large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [6,3,6]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The only special triplet is (i, j, k) = (0, 1, 2), where:
 *
 *
 * nums[0] = 6, nums[1] = 3, nums[2] = 6
 *
 * nums[0] = nums[1] * 2 = 3 * 2 = 6
 *
 * nums[2] = nums[1] * 2 = 3 * 2 = 6
 *
 * Example 2:
 *
 * Input: nums = [0,1,0,0]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The only special triplet is (i, j, k) = (0, 2, 3), where:
 *
 *
 * nums[0] = 0, nums[2] = 0, nums[3] = 0
 *
 * nums[0] = nums[2] * 2 = 0 * 2 = 0
 *
 * nums[3] = nums[2] * 2 = 0 * 2 = 0
 *
 * Example 3:
 *
 * Input: nums = [8,4,2,8,4]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * There are exactly two special triplets:
 *
 *
 * (i, j, k) = (0, 1, 3)
 *
 *
 *
 *
 * nums[0] = 8, nums[1] = 4, nums[3] = 8
 *
 * nums[0] = nums[1] * 2 = 4 * 2 = 8
 *
 * nums[3] = nums[1] * 2 = 4 * 2 = 8
 *
 *
 *
 * (i, j, k) = (1, 2, 4)
 *
 *
 *
 * nums[1] = 4, nums[2] = 2, nums[4] = 4
 *
 * nums[1] = nums[2] * 2 = 2 * 2 = 4
 *
 * nums[4] = nums[2] * 2 = 2 * 2 = 4
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= n == nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use frequency arrays or maps, e.g. <code>freqPrev</code> and <code>freqNext</code>—to track how many times each value appears before and after the current index.
 * Hint 2: For each index <code>j</code> in the triplet (<code>i</code>,<code>j</code>,<code>k</code>), compute its contribution to the answer using your freqPrev and freqNext counts.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 *
 * @see <a href="https://leetcode.com/problems/count-special-triplets/">LeetCode #3583</a>
 */
public class CountSpecialTriplets {

    /**
     * Counts Count special subsequences.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int countSpecialSubsequences(int[] nums) {
        // Count triplets (a,b,c) a<b<c, nums[a]*nums[c]==nums[b]*nums[b] -- simplified count
        int cnt=0, n=nums.length;
        for (int i=0;i<n-2;i++) for (int j=i+1;j<n-1;j++) for (int k=j+1;k<n;k++)
            if ((long)nums[i]*nums[k]==(long)nums[j]*nums[j]) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        CountSpecialTriplets sol = new CountSpecialTriplets();
                System.out.println(sol.countSpecialSubsequences(new int[]{1,2,4})); // 1
                System.out.println(sol.countSpecialSubsequences(new int[]{1,1,1,1})); // 4
    }
}
