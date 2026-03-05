package org.leetcode.easy;


/**
 * <b>#3162 - Find the Number of Good Pairs I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given 2 integer arrays nums1 and nums2 of lengths n and m respectively. You are also given a positive integer k.
 *
 *
 * A pair (i, j) is called good if nums1[i] is divisible by nums2[j] * k (0 &lt;= i &lt;= n - 1, 0 &lt;= j &lt;= m - 1).
 *
 *
 * Return the total number of good pairs.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,3,4], nums2 = [1,3,4], k = 1
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 * The 5 good pairs are (0, 0), (1, 0), (1, 1), (2, 0), and (2, 2).
 *
 *
 * Example 2:
 *
 * Input: nums1 = [1,2,4,12], nums2 = [2,4], k = 3
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The 2 good pairs are (3, 0) and (3, 1).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n, m &lt;= 50
 *
 * 1 &lt;= nums1[i], nums2[j] &lt;= 50
 *
 * 1 &lt;= k &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The constraints are small. Check all pairs.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 *
 * @see <a href="https://leetcode.com/problems/find-the-number-of-good-pairs-i/">LeetCode #3162</a>
  *
  * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
  */
public class FindTheNumberOfGoodPairsI {

    /**
     * Solves the problem: Number of pairs.
     * Uses dynamic programming to build solutions bottom-up.
     *
     * @param nums1 the nums1 (int[])
     * @param nums2 the nums2 (int[])
     * @param k the k (int)
     * @return the computed long result
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        long cnt=0;
        for (int a:nums1) for (int b:nums2) if (a%(b*k)==0) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        FindTheNumberOfGoodPairsI sol = new FindTheNumberOfGoodPairsI();
                System.out.println(sol.numberOfPairs(new int[]{1,3,4},new int[]{1,3,4},1)); // 5
                System.out.println(sol.numberOfPairs(new int[]{1,2,4,12},new int[]{2,4},2)); // 2
    }
}
