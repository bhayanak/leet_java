package org.leetcode.medium;


/**
 * <b>#1283 - Find the Smallest Divisor Given a Threshold</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.
 *
 *
 * Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).
 *
 *
 * The test cases are generated so that there will be an answer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,5,9], threshold = 6
 * Output: 5
 * Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
 * If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 
 *
 * Example 2:
 *
 * Input: nums = [44,22,33,11,1], threshold = 5
 * Output: 44
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 5 * 104
 *
 * 1 &lt;= nums[i] &lt;= 106
 *
 * nums.length &lt;= threshold &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Examine every possible number for solution. Choose the largest of them.
 * Hint 2: Use binary search to reduce the time complexity.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/">LeetCode #1283</a>
 */
public class FindTheSmallestDivisorGivenAThreshold {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Smallest Divisor Given a Threshold");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindTheSmallestDivisorGivenAThreshold ===");
        FindTheSmallestDivisorGivenAThreshold sol = new FindTheSmallestDivisorGivenAThreshold();
        System.out.println(sol.solve(null));
    }
}
