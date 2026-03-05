package org.leetcode.medium;


/**
 * <b>#2811 - Check if it is Possible to Split Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums of length n and an integer m. You need to determine if it is possible to split the array into n arrays of size 1 by performing a series of steps.
 *
 *
 * An array is called good if:
 *
 *
 * The length of the array is one, or
 *
 * The sum of the elements of the array is greater than or equal to m.
 *
 * In each step, you can select an existing array (which may be the result of previous steps) with a length of at least two and split it into two arrays, if both resulting arrays are good.
 *
 *
 * Return true if you can split the given array into n arrays, otherwise return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2, 2, 1], m = 4
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * Split [2, 2, 1] to [2, 2] and [1]. The array [1] has a length of one, and the array [2, 2] has the sum of its elements equal to 4 &gt;= m, so both are good arrays.
 *
 * Split [2, 2] to [2] and [2]. both arrays have the length of one, so both are good arrays.
 *
 * Example 2:
 *
 * Input: nums = [2, 1, 3], m = 5
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 *
 * The first move has to be either of the following:
 *
 *
 * Split [2, 1, 3] to [2, 1] and [3]. The array [2, 1] has neither length of one nor sum of elements greater than or equal to m.
 *
 * Split [2, 1, 3] to [2] and [1, 3]. The array [1, 3] has neither length of one nor sum of elements greater than or equal to m.
 *
 * So as both moves are invalid (they do not divide the array into two good arrays), we are unable to split nums into n arrays of size 1.
 *
 * Example 3:
 *
 * Input: nums = [2, 3, 3, 2, 3], m = 6
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * Split [2, 3, 3, 2, 3] to [2] and [3, 3, 2, 3].
 *
 * Split [3, 3, 2, 3] to [3, 3, 2] and [3].
 *
 * Split [3, 3, 2] to [3, 3] and [2].
 *
 * Split [3, 3] to [3] and [3].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 100
 *
 * 1 &lt;= m &lt;= 200
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It can be proven that if you can split more than one element as a subarray, then you can split exactly one element.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/check-if-it-is-possible-to-split-array/">LeetCode #2811</a>
 */
public class CheckIfItIsPossibleToSplitArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check if it is Possible to Split Array");
    }

    public static void main(String[] args) {
        System.out.println("=== CheckIfItIsPossibleToSplitArray ===");
        CheckIfItIsPossibleToSplitArray sol = new CheckIfItIsPossibleToSplitArray();
        System.out.println(sol.solve(null));
    }
}
