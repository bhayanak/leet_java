package org.leetcode.easy;


/**
 * <b>#2475 - Number of Unequal Triplets in Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array of positive integers nums. Find the number of triplets (i, j, k) that meet the following conditions:
 *
 *
 * 0 &lt;= i &lt; j &lt; k &lt; nums.length
 *
 * nums[i], nums[j], and nums[k] are pairwise distinct.
 *
 *
 *
 * In other words, nums[i] != nums[j], nums[i] != nums[k], and nums[j] != nums[k].
 *
 *
 *
 * Return the number of triplets that meet the conditions.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,4,2,4,3]
 * Output: 3
 * Explanation: The following triplets meet the conditions:
 * - (0, 2, 4) because 4 != 2 != 3
 * - (1, 2, 4) because 4 != 2 != 3
 * - (2, 3, 4) because 2 != 4 != 3
 * Since there are 3 triplets, we return 3.
 * Note that (2, 0, 4) is not a valid triplet because 2 &gt; 0.
 *
 * Example 2:
 *
 * Input: nums = [1,1,1,1,1]
 * Output: 0
 * Explanation: No triplets meet the conditions so we return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The constraints are very small. Can we try every triplet?
 * Hint 2: Yes, we can. Use three loops to iterate through all the possible triplets, ensuring the condition i &lt; j &lt; k holds.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/number-of-unequal-triplets-in-array/">LeetCode #2475</a>
  *
  * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
  */
public class NumberOfUnequalTripletsInArray {

    /**
     * Solves the problem: Unequal triplets.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public int unequalTriplets(int[] nums) {
        int n=nums.length, cnt=0;
        for (int i=0;i<n;i++) for (int j=i+1;j<n;j++) for (int k=j+1;k<n;k++)
            if (nums[i]!=nums[j]&&nums[j]!=nums[k]&&nums[i]!=nums[k]) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        NumberOfUnequalTripletsInArray sol = new NumberOfUnequalTripletsInArray();
        System.out.println(sol.unequalTriplets(new int[]{1,2,3}));
    }
}
