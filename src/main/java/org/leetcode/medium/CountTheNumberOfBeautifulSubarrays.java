package org.leetcode.medium;


/**
 * <b>#2588 - Count the Number of Beautiful Subarrays</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Bit Manipulation, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums. In one operation, you can:
 *
 *
 * Choose two different indices i and j such that 0 &lt;= i, j &lt; nums.length.
 *
 * Choose a non-negative integer k such that the kth bit (0-indexed) in the binary representation of nums[i] and nums[j] is 1.
 *
 * Subtract 2k from nums[i] and nums[j].
 *
 * A subarray is beautiful if it is possible to make all of its elements equal to 0 after applying the above operation any number of times (including zero).
 *
 *
 * Return the number of beautiful subarrays in the array nums.
 *
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 * Note: Subarrays where all elements are initially 0 are considered beautiful, as no operation is needed.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,3,1,2,4]
 * Output: 2
 * Explanation: There are 2 beautiful subarrays in nums: [4,3,1,2,4] and [4,3,1,2,4].
 * - We can make all elements in the subarray [3,1,2] equal to 0 in the following way:
 *   - Choose [3, 1, 2] and k = 1. Subtract 21 from both numbers. The subarray becomes [1, 1, 0].
 *   - Choose [1, 1, 0] and k = 0. Subtract 20 from both numbers. The subarray becomes [0, 0, 0].
 * - We can make all elements in the subarray [4,3,1,2,4] equal to 0 in the following way:
 *   - Choose [4, 3, 1, 2, 4] and k = 2. Subtract 22 from both numbers. The subarray becomes [0, 3, 1, 2, 0].
 *   - Choose [0, 3, 1, 2, 0] and k = 0. Subtract 20 from both numbers. The subarray becomes [0, 2, 0, 2, 0].
 *   - Choose [0, 2, 0, 2, 0] and k = 1. Subtract 21 from both numbers. The subarray becomes [0, 0, 0, 0, 0].
 *
 * Example 2:
 *
 * Input: nums = [1,10,4]
 * Output: 0
 * Explanation: There are no beautiful subarrays in nums.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: A subarray is beautiful if its xor is equal to zero.
 * Hint 2: Compute the prefix xor for every index, then the xor of subarray [left, right] is equal to zero if prefix_xor[left] ^ perfix_xor[right] == 0
 * Hint 3: Iterate from left to right and maintain a hash table to count the number of indices equal to the current prefix xor.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Bit Manipulation, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/count-the-number-of-beautiful-subarrays/">LeetCode #2588</a>
 */
public class CountTheNumberOfBeautifulSubarrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count the Number of Beautiful Subarrays");
    }

    public static void main(String[] args) {
        System.out.println("=== CountTheNumberOfBeautifulSubarrays ===");
        CountTheNumberOfBeautifulSubarrays sol = new CountTheNumberOfBeautifulSubarrays();
        System.out.println(sol.solve(null));
    }
}
