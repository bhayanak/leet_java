package org.leetcode.medium;


/**
 * <b>#3727 - Maximum Alternating Sum of Squares</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. You may rearrange the elements in any order.
 *
 *
 * The alternating score of an array arr is defined as:
 *
 *
 * score = arr[0]2 - arr[1]2 + arr[2]2 - arr[3]2 + ...
 *
 * Return an integer denoting the maximum possible alternating score of nums after rearranging its elements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * A possible rearrangement for nums is [2,1,3], which gives the maximum alternating score among all possible rearrangements.
 *
 *
 * The alternating score is calculated as:
 *
 *
 * score = 22 - 12 + 32 = 4 - 1 + 9 = 12
 *
 * Example 2:
 *
 * Input: nums = [1,-1,2,-2,3,-3]
 *
 *
 * Output: 16
 *
 *
 * Explanation:
 *
 *
 * A possible rearrangement for nums is [-3,-1,-2,1,3,2], which gives the maximum alternating score among all possible rearrangements.
 *
 *
 * The alternating score is calculated as:
 *
 *
 * score = (-3)2 - (-1)2 + (-2)2 - (1)2 + (3)2 - (2)2 = 9 - 1 + 4 - 1 + 9 - 4 = 16
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -4 * 104 &lt;= nums[i] &lt;= 4 * 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The score uses squares of values. The original signs of <code>nums</code> don't affect the squared terms.
 * Hint 2: In the alternating sum, even indices contribute positively and odd indices negatively.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximum-alternating-sum-of-squares/">LeetCode #3727</a>
 */
public class MaximumAlternatingSumOfSquares {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Alternating Sum of Squares");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumAlternatingSumOfSquares ===");
        MaximumAlternatingSumOfSquares sol = new MaximumAlternatingSumOfSquares();
        System.out.println(sol.solve(null));
    }
}
