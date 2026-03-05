package org.leetcode.medium;


/**
 * <b>#1814 - Count Nice Pairs in an Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums that consists of non-negative integers. Let us define rev(x) as the reverse of the non-negative integer x. For example, rev(123) = 321, and rev(120) = 21. A pair of indices (i, j) is nice if it satisfies all of the following conditions:
 *
 *
 * 0 &lt;= i &lt; j &lt; nums.length
 *
 * nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])
 *
 * Return the number of nice pairs of indices. Since that number can be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [42,11,1,97]
 * Output: 2
 * Explanation: The two pairs are:
 *  - (0,3) : 42 + rev(97) = 42 + 79 = 121, 97 + rev(42) = 97 + 24 = 121.
 *  - (1,2) : 11 + rev(1) = 11 + 1 = 12, 1 + rev(11) = 1 + 11 = 12.
 *
 * Example 2:
 *
 * Input: nums = [13,10,35,24,76]
 * Output: 4
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
 * Hint 1: The condition can be rearranged to (nums[i] - rev(nums[i])) == (nums[j] - rev(nums[j])).
 * Hint 2: Transform each nums[i] into (nums[i] - rev(nums[i])). Then, count the number of (i, j) pairs that have equal values.
 * Hint 3: Keep a map storing the frequencies of values that you have seen so far. For each i, check if nums[i] is in the map. If it is, then add that count to the overall count. Then, increment the frequency of nums[i].
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-nice-pairs-in-an-array/">LeetCode #1814</a>
 */
public class CountNicePairsInAnArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Nice Pairs in an Array");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountNicePairsInAnArray ===");
        CountNicePairsInAnArray sol = new CountNicePairsInAnArray();
        System.out.println(sol.solve(null));
    }
}
