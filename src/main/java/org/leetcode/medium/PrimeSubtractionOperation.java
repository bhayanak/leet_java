package org.leetcode.medium;


/**
 * <b>#2601 - Prime Subtraction Operation</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Binary Search, Greedy, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums of length n.
 *
 *
 * You can perform the following operation as many times as you want:
 *
 *
 * Pick an index i that you haven’t picked before, and pick a prime p strictly less than nums[i], then subtract p from nums[i].
 *
 * Return true if you can make nums a strictly increasing array using the above operation and false otherwise.
 *
 *
 * A strictly increasing array is an array whose each element is strictly greater than its preceding element.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,9,6,10]
 * Output: true
 * Explanation: In the first operation: Pick i = 0 and p = 3, and then subtract 3 from nums[0], so that nums becomes [1,9,6,10].
 * In the second operation: i = 1, p = 7, subtract 7 from nums[1], so nums becomes equal to [1,2,6,10].
 * After the second operation, nums is sorted in strictly increasing order, so the answer is true.
 *
 * Example 2:
 *
 * Input: nums = [6,8,11,12]
 * Output: true
 * Explanation: Initially nums is sorted in strictly increasing order, so we don't need to make any operations.
 *
 * Example 3:
 *
 * Input: nums = [5,8,3]
 * Output: false
 * Explanation: It can be proven that there is no way to perform operations to make nums sorted in strictly increasing order, so the answer is false.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 1000
 *
 * nums.length == n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think about if we have many primes to subtract from nums[i]. Which prime is more optimal?
 * Hint 2: The most optimal prime to subtract from nums[i] is the one that makes nums[i] the smallest as possible and greater than nums[i-1].
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Binary Search, Greedy, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/prime-subtraction-operation/">LeetCode #2601</a>
 */
public class PrimeSubtractionOperation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Prime Subtraction Operation");
    }

    public static void main(String[] args) {
        System.out.println("=== PrimeSubtractionOperation ===");
        PrimeSubtractionOperation sol = new PrimeSubtractionOperation();
        System.out.println(sol.solve(null));
    }
}
