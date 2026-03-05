package org.leetcode.medium;


/**
 * <b>#1390 - Four Divisors</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four divisors. If there is no such integer in the array, return 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [21,4,7]
 * Output: 32
 * Explanation: 
 * 21 has 4 divisors: 1, 3, 7, 21
 * 4 has 3 divisors: 1, 2, 4
 * 7 has 2 divisors: 1, 7
 * The answer is the sum of divisors of 21 only.
 *
 * Example 2:
 *
 * Input: nums = [21,21]
 * Output: 64
 *
 * Example 3:
 *
 * Input: nums = [1,2,3,4,5]
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 104
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the divisors of each element in the array.
 * Hint 2: You only need to loop to the square root of a number to find its divisors.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/four-divisors/">LeetCode #1390</a>
 */
public class FourDivisors {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Four Divisors");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FourDivisors ===");
        FourDivisors sol = new FourDivisors();
        System.out.println(sol.solve(null));
    }
}
