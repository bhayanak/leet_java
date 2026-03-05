package org.leetcode.medium;


/**
 * <b>#2501 - Longest Square Streak in an Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Binary Search, Dynamic Programming, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. A subsequence of nums is called a square streak if:
 *
 *
 * The length of the subsequence is at least 2, and
 *
 * after sorting the subsequence, each element (except the first element) is the square of the previous number.
 *
 * Return the length of the longest square streak in nums, or return -1 if there is no square streak.
 *
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,3,6,16,8,2]
 * Output: 3
 * Explanation: Choose the subsequence [4,16,2]. After sorting it, it becomes [2,4,16].
 * - 4 = 2 * 2.
 * - 16 = 4 * 4.
 * Therefore, [4,16,2] is a square streak.
 * It can be shown that every subsequence of length 4 is not a square streak.
 *
 * Example 2:
 *
 * Input: nums = [2,3,5,6,7]
 * Output: -1
 * Explanation: There is no square streak in nums so return -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * 2 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: With the constraints, the length of the longest square streak possible is 5.
 * Hint 2: Store the elements of nums in a set to quickly check if it exists.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Binary Search, Dynamic Programming, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/longest-square-streak-in-an-array/">LeetCode #2501</a>
 */
public class LongestSquareStreakInAnArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Square Streak in an Array");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestSquareStreakInAnArray ===");
        LongestSquareStreakInAnArray sol = new LongestSquareStreakInAnArray();
        System.out.println(sol.solve(null));
    }
}
