package org.leetcode.hard;


/**
 * <b>#1250 - Check If It Is a Good Array</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums of positive integers. Your task is to select some subset of nums, multiply each element by an integer and add all these numbers. The array is said to be good if you can obtain a sum of 1 from the array by any possible subset and multiplicand.
 *
 *
 * Return True if the array is good otherwise return False.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [12,5,7,23]
 * Output: true
 * Explanation: Pick numbers 5 and 7.
 * 5*3 + 7*(-2) = 1
 *
 * Example 2:
 *
 * Input: nums = [29,6,10]
 * Output: true
 * Explanation: Pick numbers 29, 6 and 10.
 * 29*1 + 6*(-3) + 10*(-1) = 1
 *
 * Example 3:
 *
 * Input: nums = [3,6]
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 10^5
 *
 * 1 &lt;= nums[i] &lt;= 10^9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Eq.  ax+by=1 has solution x, y if gcd(a,b) = 1.
 * Hint 2: Can you generalize the formula?.  Check Bézout's lemma.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Number Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-it-is-a-good-array/">LeetCode #1250</a>
 */
public class CheckIfItIsAGoodArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check If It Is a Good Array");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CheckIfItIsAGoodArray ===");
        CheckIfItIsAGoodArray sol = new CheckIfItIsAGoodArray();
        System.out.println(sol.solve(null));
    }
}
