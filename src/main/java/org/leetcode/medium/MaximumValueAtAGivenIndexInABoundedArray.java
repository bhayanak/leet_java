package org.leetcode.medium;


/**
 * <b>#1802 - Maximum Value at a Given Index in a Bounded Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Binary Search, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given three positive integers: n, index, and maxSum. You want to construct an array nums (0-indexed) that satisfies the following conditions:
 *
 *
 * nums.length == n
 *
 * nums[i] is a positive integer where 0 &lt;= i &lt; n.
 *
 * abs(nums[i] - nums[i+1]) &lt;= 1 where 0 &lt;= i &lt; n-1.
 *
 * The sum of all the elements of nums does not exceed maxSum.
 *
 * nums[index] is maximized.
 *
 * Return nums[index] of the constructed array.
 *
 *
 * Note that abs(x) equals x if x &gt;= 0, and -x otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, index = 2,  maxSum = 6
 * Output: 2
 * Explanation: nums = [1,2,2,1] is one array that satisfies all the conditions.
 * There are no arrays that satisfy all the conditions and have nums[2] == 3, so 2 is the maximum nums[2].
 *
 * Example 2:
 *
 * Input: n = 6, index = 1,  maxSum = 10
 * Output: 3
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= maxSum &lt;= 109
 *
 * 0 &lt;= index &lt; n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What if the problem was instead determining if you could generate a valid array with nums[index] == target?
 * Hint 2: To generate the array, set nums[index] to target, nums[index-i] to target-i, and nums[index+i] to target-i. Then, this will give the minimum possible sum, so check if the sum is less than or equal to maxSum.
 * Hint 3: n is too large to actually generate the array, so you can use the formula 1 + 2 + ... + n = n * (n+1) / 2 to quickly find the sum of nums[0...index] and nums[index...n-1].
 * Hint 4: Binary search for the target. If it is possible, then move the lower bound up. Otherwise, move the upper bound down.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Binary Search, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/">LeetCode #1802</a>
 */
public class MaximumValueAtAGivenIndexInABoundedArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Value at a Given Index in a Bounded Array");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumValueAtAGivenIndexInABoundedArray ===");
        MaximumValueAtAGivenIndexInABoundedArray sol = new MaximumValueAtAGivenIndexInABoundedArray();
        System.out.println(sol.solve(null));
    }
}
