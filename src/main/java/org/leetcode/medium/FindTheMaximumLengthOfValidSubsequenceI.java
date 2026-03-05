package org.leetcode.medium;


/**
 * <b>#3201 - Find the Maximum Length of Valid Subsequence I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 * A subsequence sub of nums with length x is called valid if it satisfies:
 *
 *
 * (sub[0] + sub[1]) % 2 == (sub[1] + sub[2]) % 2 == ... == (sub[x - 2] + sub[x - 1]) % 2.
 *
 * Return the length of the longest valid subsequence of nums.
 *
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The longest valid subsequence is [1, 2, 3, 4].
 *
 * Example 2:
 *
 * Input: nums = [1,2,1,1,2,1,2]
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * The longest valid subsequence is [1, 2, 1, 2, 1, 2].
 *
 * Example 3:
 *
 * Input: nums = [1,3]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The longest valid subsequence is [1, 3].
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 2 * 105
 *
 * 1 &lt;= nums[i] &lt;= 107
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The possible sequence either contains all even elements, all odd elements, alternate even odd, or alternate odd even elements.
 * Hint 2: Considering only the parity of elements, there are only 4 possibilities and we can try all of them.
 * Hint 3: When selecting an element with any parity, try to select the earliest one.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-i/">LeetCode #3201</a>
 */
public class FindTheMaximumLengthOfValidSubsequenceI {

    /**
     * Solves the problem: Maximum length.
     * Uses dynamic programming to build solutions bottom-up.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int result
     */
    public int maximumLength(int[] nums, int k) {
        // Subsequence where abs diff of adjacent <= k
        int n=nums.length, max=1;
        int[] dp=new int[n]; java.util.Arrays.fill(dp,1);
        for (int i=1;i<n;i++) for (int j=0;j<i;j++)
            if (Math.abs(nums[i]-nums[j])<=k) { dp[i]=Math.max(dp[i],dp[j]+1); max=Math.max(max,dp[i]); }
        return max;
    }

    public static void main(String[] args) {
        FindTheMaximumLengthOfValidSubsequenceI sol = new FindTheMaximumLengthOfValidSubsequenceI();
        System.out.println(sol.maximumLength(new int[]{1,2,3}, 0));
    }
}
