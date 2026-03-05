package org.leetcode.medium;


/**
 * <b>#3755 - Find Maximum Balanced XOR Subarray Length</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Bit Manipulation, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, return the length of the longest subarray that has a bitwise XOR of zero and contains an equal number of even and odd numbers. If no such subarray exists, return 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,1,3,2,0]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The subarray [1, 3, 2, 0] has bitwise XOR 1 XOR 3 XOR 2 XOR 0 = 0 and contains 2 even and 2 odd numbers.
 *
 * Example 2:
 *
 * Input: nums = [3,2,8,5,4,14,9,15]
 *
 *
 * Output: 8
 *
 *
 * Explanation:
 *
 *
 * The whole array has bitwise XOR 0 and contains 4 even and 4 odd numbers.
 *
 * Example 3:
 *
 * Input: nums = [0]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * No non-empty subarray satisfies both conditions.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: In one pass maintain prefix <code>pxor</code> and prefix <code>diff</code> = (#evens − #odds) and record in a hash‑map the earliest index where each state (<code>pxor,diff</code>) occurs.
 * Hint 2: At each index, if the current state (<code>pxor,diff</code>) is already in the map, update the max length as the current index minus the recorded index.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Bit Manipulation, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/find-maximum-balanced-xor-subarray-length/">LeetCode #3755</a>
 */
public class FindMaximumBalancedXorSubarrayLength {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Maximum Balanced XOR Subarray Length");
    }

    public static void main(String[] args) {
        System.out.println("=== FindMaximumBalancedXorSubarrayLength ===");
        FindMaximumBalancedXorSubarrayLength sol = new FindMaximumBalancedXorSubarrayLength();
        System.out.println(sol.solve(null));
    }
}
