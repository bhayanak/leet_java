package org.leetcode.medium;


/**
 * <b>#3499 - Maximize Active Section with Trade I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary string s of length n, where:
 *
 *
 * '1' represents an active section.
 *
 * '0' represents an inactive section.
 *
 * You can perform at most one trade to maximize the number of active sections in s. In a trade, you:
 *
 *
 * Convert a contiguous block of '1's that is surrounded by '0's to all '0's.
 *
 * Afterward, convert a contiguous block of '0's that is surrounded by '1's to all '1's.
 *
 * Return the maximum number of active sections in s after making the optimal trade.
 *
 *
 * Note: Treat s as if it is augmented with a '1' at both ends, forming t = '1' + s + '1'. The augmented '1's do not contribute to the final count.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "01"
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Because there is no block of '1's surrounded by '0's, no valid trade is possible. The maximum number of active sections is 1.
 *
 * Example 2:
 *
 * Input: s = "0100"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * String "0100" → Augmented to "101001".
 *
 * Choose "0100", convert "101001" → "100001" → "111111".
 *
 * The final string without augmentation is "1111". The maximum number of active sections is 4.
 *
 * Example 3:
 *
 * Input: s = "1000100"
 *
 *
 * Output: 7
 *
 *
 * Explanation:
 *
 *
 * String "1000100" → Augmented to "110001001".
 *
 * Choose "000100", convert "110001001" → "110000001" → "111111111".
 *
 * The final string without augmentation is "1111111". The maximum number of active sections is 7.
 *
 * Example 4:
 *
 * Input: s = "01010"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * String "01010" → Augmented to "1010101".
 *
 * Choose "010", convert "1010101" → "1000101" → "1111101".
 *
 * The final string without augmentation is "11110". The maximum number of active sections is 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == s.length &lt;= 105
 *
 * s[i] is either '0' or '1'
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Split the string into several zero-one segments.
 * Hint 2: For each one-segment, if it has two neighbors (i.e., it is surrounded by two zero-segments), the total sum of their lengths is one of the candidates for <code>delta</code>.
 * Hint 3: Find the maximum <code>delta</code> and add it to the total number of ones in the string.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/maximize-active-section-with-trade-i/">LeetCode #3499</a>
 */
public class MaximizeActiveSectionWithTradeI {

    /**
     * Computes the maximum Max operations2.
     *
     * @param nums the nums (int[])
     * @return the computed long result
     */
    public long maxOperations2(int[] nums) {
        // Count adjacent equal pairs
        long cnt=0;
        for (int i=0;i<nums.length-1;i++) if (nums[i]==nums[i+1]) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        MaximizeActiveSectionWithTradeI sol = new MaximizeActiveSectionWithTradeI();
        System.out.println(sol.maxOperations2(new int[]{1,2,3}));
    }
}
