package org.leetcode.medium;


/**
 * <b>#3634 - Minimum Removals to Balance Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Sliding Window, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer k.
 *
 *
 * An array is considered balanced if the value of its maximum element is at most k times the minimum element.
 *
 *
 * You may remove any number of elements from nums​​​​​​​ without making it empty.
 *
 *
 * Return the minimum number of elements to remove so that the remaining array is balanced.
 *
 *
 * Note: An array of size 1 is considered balanced as its maximum and minimum are equal, and the condition always holds true.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1,5], k = 2
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Remove nums[2] = 5 to get nums = [2, 1].
 *
 * Now max = 2, min = 1 and max &lt;= min * k as 2 &lt;= 1 * 2. Thus, the answer is 1.
 *
 * Example 2:
 *
 * Input: nums = [1,6,2,9], k = 3
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Remove nums[0] = 1 and nums[3] = 9 to get nums = [6, 2].
 *
 * Now max = 6, min = 2 and max &lt;= min * k as 6 &lt;= 2 * 3. Thus, the answer is 2.
 *
 * Example 3:
 *
 * Input: nums = [4,6], k = 2
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * Since nums is already balanced as 6 &lt;= 4 * 2, no elements need to be removed.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort <code>nums</code> and use two pointers <code>i</code> and <code>j</code> so that the window's minimum is <code>nums[i]</code> and maximum is <code>nums[j]</code>.
 * Hint 2: Expand <code>j</code> while <code>nums[j] &lt;= k * nums[i]</code> to maximize the balanced window; answer = <code>n - (j - i + 1)</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Sliding Window, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-removals-to-balance-array/">LeetCode #3634</a>
 */
public class MinimumRemovalsToBalanceArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Removals to Balance Array");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumRemovalsToBalanceArray ===");
        MinimumRemovalsToBalanceArray sol = new MinimumRemovalsToBalanceArray();
        System.out.println(sol.solve(null));
    }
}
