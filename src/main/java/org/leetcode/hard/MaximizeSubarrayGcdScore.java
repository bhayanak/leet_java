package org.leetcode.hard;


/**
 * <b>#3574 - Maximize Subarray GCD Score</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Enumeration, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of positive integers nums and an integer k.
 *
 *
 * You may perform at most k operations. In each operation, you can choose one element in the array and double its value. Each element can be doubled at most once.
 *
 *
 * The score of a contiguous subarray is defined as the product of its length and the greatest common divisor (GCD) of all its elements.
 *
 *
 * Your task is to return the maximum score that can be achieved by selecting a contiguous subarray from the modified array.
 *
 *
 * Note:
 *
 *
 * The greatest common divisor (GCD) of an array is the largest integer that evenly divides all the array elements.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,4], k = 1
 *
 *
 * Output: 8
 *
 *
 * Explanation:
 *
 *
 * Double nums[0] to 4 using one operation. The modified array becomes [4, 4].
 *
 * The GCD of the subarray [4, 4] is 4, and the length is 2.
 *
 * Thus, the maximum possible score is 2 × 4 = 8.
 *
 * Example 2:
 *
 * Input: nums = [3,5,7], k = 2
 *
 *
 * Output: 14
 *
 *
 * Explanation:
 *
 *
 * Double nums[2] to 14 using one operation. The modified array becomes [3, 5, 14].
 *
 * The GCD of the subarray [14] is 14, and the length is 1.
 *
 * Thus, the maximum possible score is 1 × 14 = 14.
 *
 * Example 3:
 *
 * Input: nums = [5,5,5], k = 1
 *
 *
 * Output: 15
 *
 *
 * Explanation:
 *
 *
 * The subarray [5, 5, 5] has a GCD of 5, and its length is 3.
 *
 * Since doubling any element doesn't improve the score, the maximum score is 3 × 5 = 15.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 1500
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try iterating over the subarrays
 * Hint 2: Handle the 2s in the factors of elements separately
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Enumeration, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/maximize-subarray-gcd-score/">LeetCode #3574</a>
 */
public class MaximizeSubarrayGcdScore {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize Subarray GCD Score");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeSubarrayGcdScore ===");
        MaximizeSubarrayGcdScore sol = new MaximizeSubarrayGcdScore();
        System.out.println(sol.solve(null));
    }
}
