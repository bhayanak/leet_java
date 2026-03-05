package org.leetcode.medium;


/**
 * <b>#3255 - Find the Power of K-Size Subarrays II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers nums of length n and a positive integer k.
 *
 *
 * The power of an array is defined as:
 *
 *
 * Its maximum element if all of its elements are consecutive and sorted in ascending order.
 *
 * -1 otherwise.
 *
 * You need to find the power of all subarrays of nums of size k.
 *
 *
 * Return an integer array results of size n - k + 1, where results[i] is the power of nums[i..(i + k - 1)].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,3,2,5], k = 3
 *
 *
 * Output: [3,4,-1,-1,-1]
 *
 *
 * Explanation:
 *
 *
 * There are 5 subarrays of nums of size 3:
 *
 *
 * [1, 2, 3] with the maximum element 3.
 *
 * [2, 3, 4] with the maximum element 4.
 *
 * [3, 4, 3] whose elements are not consecutive.
 *
 * [4, 3, 2] whose elements are not sorted.
 *
 * [3, 2, 5] whose elements are not consecutive.
 *
 * Example 2:
 *
 * Input: nums = [2,2,2,2,2], k = 4
 *
 *
 * Output: [-1,-1]
 *
 * Example 3:
 *
 * Input: nums = [3,2,3,2,3,2], k = 2
 *
 *
 * Output: [-1,3,-1,3,-1]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 106
 *
 * 1 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>dp[i]</code> denote the length of the longest subarray ending at index <code>i</code> that has consecutive and sorted elements.
 * Hint 2: Use a TreeMap with a sliding window to check if there are <code>k</code> elements in the subarray ending at index <code>i</code>.
 * Hint 3: If TreeMap has less than <code>k</code> elements and <code>dp[i] &lt; k</code>, the subarray has power equal to -1.
 * Hint 4: Is it possible to achieve <code>O(nums.length)</code> using a Stack?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/find-the-power-of-k-size-subarrays-ii/">LeetCode #3255</a>
 */
public class FindThePowerOfKSizeSubarraysIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Power of K-Size Subarrays II");
    }

    public static void main(String[] args) {
        System.out.println("=== FindThePowerOfKSizeSubarraysIi ===");
        FindThePowerOfKSizeSubarraysIi sol = new FindThePowerOfKSizeSubarraysIi();
        System.out.println(sol.solve(null));
    }
}
