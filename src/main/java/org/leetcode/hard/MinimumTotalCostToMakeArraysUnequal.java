package org.leetcode.hard;


/**
 * <b>#2499 - Minimum Total Cost to Make Arrays Unequal</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two 0-indexed integer arrays nums1 and nums2, of equal length n.
 *
 *
 * In one operation, you can swap the values of any two indices of nums1. The cost of this operation is the sum of the indices.
 *
 *
 * Find the minimum total cost of performing the given operation any number of times such that nums1[i] != nums2[i] for all 0 &lt;= i &lt;= n - 1 after performing all the operations.
 *
 *
 * Return the minimum total cost such that nums1 and nums2 satisfy the above condition. In case it is not possible, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,3,4,5], nums2 = [1,2,3,4,5]
 * Output: 10
 * Explanation: 
 * One of the ways we can perform the operations is:
 * - Swap values at indices 0 and 3, incurring cost = 0 + 3 = 3. Now, nums1 = [4,2,3,1,5]
 * - Swap values at indices 1 and 2, incurring cost = 1 + 2 = 3. Now, nums1 = [4,3,2,1,5].
 * - Swap values at indices 0 and 4, incurring cost = 0 + 4 = 4. Now, nums1 =[5,3,2,1,4].
 * We can see that for each index i, nums1[i] != nums2[i]. The cost required here is 10.
 * Note that there are other ways to swap values, but it can be proven that it is not possible to obtain a cost less than 10.
 *
 * Example 2:
 *
 * Input: nums1 = [2,2,2,1,3], nums2 = [1,2,2,3,3]
 * Output: 10
 * Explanation: 
 * One of the ways we can perform the operations is:
 * - Swap values at indices 2 and 3, incurring cost = 2 + 3 = 5. Now, nums1 = [2,2,1,2,3].
 * - Swap values at indices 1 and 4, incurring cost = 1 + 4 = 5. Now, nums1 = [2,3,1,2,2].
 * The total cost needed here is 10, which is the minimum possible.
 *
 * Example 3:
 *
 * Input: nums1 = [1,2,2], nums2 = [1,2,2]
 * Output: -1
 * Explanation: 
 * It can be shown that it is not possible to satisfy the given conditions irrespective of the number of operations we perform.
 * Hence, we return -1.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums1.length == nums2.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= nums1[i], nums2[i] &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How can we check which indices of <code>nums1</code> will be considered for swapping? How to minimize the number of such operations?
 * Hint 2: It can be seen that greedily swapping values of indices where <code>nums1[i] == nums2[i]</code> is the most optimal choice. How many values cannot be swapped this way?
 * Hint 3: Find which indices we will swap these remaining values with, and if there are enough such indices.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Counting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-total-cost-to-make-arrays-unequal/">LeetCode #2499</a>
 */
public class MinimumTotalCostToMakeArraysUnequal {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Total Cost to Make Arrays Unequal");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumTotalCostToMakeArraysUnequal ===");
        MinimumTotalCostToMakeArraysUnequal sol = new MinimumTotalCostToMakeArraysUnequal();
        System.out.println(sol.solve(null));
    }
}
