package org.leetcode.medium;


/**
 * <b>#2420 - Find All Good Indices</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums of size n and a positive integer k.
 *
 *
 * We call an index i in the range k &lt;= i &lt; n - k good if the following conditions are satisfied:
 *
 *
 * The k elements that are just before the index i are in non-increasing order.
 *
 * The k elements that are just after the index i are in non-decreasing order.
 *
 * Return an array of all good indices sorted in increasing order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1,1,1,3,4,1], k = 2
 * Output: [2,3]
 * Explanation: There are two good indices in the array:
 * - Index 2. The subarray [2,1] is in non-increasing order, and the subarray [1,3] is in non-decreasing order.
 * - Index 3. The subarray [1,1] is in non-increasing order, and the subarray [3,4] is in non-decreasing order.
 * Note that the index 4 is not good because [4,1] is not non-decreasing.
 *
 * Example 2:
 *
 * Input: nums = [2,1,1,2], k = 2
 * Output: []
 * Explanation: There are no good indices in this array.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums.length
 *
 * 3 &lt;= n &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 106
 *
 * 1 &lt;= k &lt;= n / 2
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate over all indices i. How do you quickly check the two conditions?
 * Hint 2: Precompute for each index whether the conditions are satisfied on the left and the right of the index. You can do that with two iterations, from left to right and right to left.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/find-all-good-indices/">LeetCode #2420</a>
 */
public class FindAllGoodIndices {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find All Good Indices");
    }

    public static void main(String[] args) {
        System.out.println("=== FindAllGoodIndices ===");
        FindAllGoodIndices sol = new FindAllGoodIndices();
        System.out.println(sol.solve(null));
    }
}
