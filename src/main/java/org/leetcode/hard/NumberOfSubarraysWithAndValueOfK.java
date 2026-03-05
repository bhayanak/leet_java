package org.leetcode.hard;


/**
 * <b>#3209 - Number of Subarrays With AND Value of K</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Bit Manipulation, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers nums and an integer k, return the number of subarrays of nums where the bitwise AND of the elements of the subarray equals k.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1], k = 1
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * All subarrays contain only 1's.
 *
 * Example 2:
 *
 * Input: nums = [1,1,2], k = 1
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Subarrays having an AND value of 1 are: [1,1,2], [1,1,2], [1,1,2].
 *
 * Example 3:
 *
 * Input: nums = [1,2,3], k = 2
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Subarrays having an AND value of 2 are: [1,2,3], [1,2,3].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i], k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let’s say we want to count the number of pairs <code>(l, r)</code> such that <code>nums[l] &amp; nums[l + 1] &amp; … &amp; nums[r] == k</code>.
 * Hint 2: Fix the left index <code>l</code>.
 * Hint 3: Note that if you increase <code>r</code> for a fixed <code>l</code>, then the AND value of the subarray either decreases or remains unchanged.
 * Hint 4: Therefore, consider using binary search.
 * Hint 5: To calculate the AND value of a subarray, use sparse tables.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Bit Manipulation, Segment Tree).
 *
 * @see <a href="https://leetcode.com/problems/number-of-subarrays-with-and-value-of-k/">LeetCode #3209</a>
 */
public class NumberOfSubarraysWithAndValueOfK {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Subarrays With AND Value of K");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfSubarraysWithAndValueOfK ===");
        NumberOfSubarraysWithAndValueOfK sol = new NumberOfSubarraysWithAndValueOfK();
        System.out.println(sol.solve(null));
    }
}
