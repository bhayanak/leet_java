package org.leetcode.hard;


/**
 * <b>#1526 - Minimum Number of Increments on Subarrays to Form a Target Array</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Stack, Greedy, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array target. You have an integer array initial of the same size as target with all elements initially zeros.
 *
 *
 * In one operation you can choose any subarray from initial and increment each value by one.
 *
 *
 * Return the minimum number of operations to form a target array from initial.
 *
 *
 * The test cases are generated so that the answer fits in a 32-bit integer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: target = [1,2,3,2,1]
 * Output: 3
 * Explanation: We need at least 3 operations to form the target array from the initial array.
 * [0,0,0,0,0] increment 1 from index 0 to 4 (inclusive).
 * [1,1,1,1,1] increment 1 from index 1 to 3 (inclusive).
 * [1,2,2,2,1] increment 1 at index 2.
 * [1,2,3,2,1] target array is formed.
 *
 * Example 2:
 *
 * Input: target = [3,1,1,2]
 * Output: 4
 * Explanation: [0,0,0,0] -&gt; [1,1,1,1] -&gt; [1,1,1,2] -&gt; [2,1,1,2] -&gt; [3,1,1,2]
 *
 * Example 3:
 *
 * Input: target = [3,1,5,4,2]
 * Output: 7
 * Explanation: [0,0,0,0,0] -&gt; [1,1,1,1,1] -&gt; [2,1,1,1,1] -&gt; [3,1,1,1,1] -&gt; [3,1,2,2,2] -&gt; [3,1,3,3,2] -&gt; [3,1,4,4,2] -&gt; [3,1,5,4,2].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= target.length &lt;= 105
 *
 * 1 &lt;= target[i] &lt;= 105
 *
 * ​​​​​​​The input is generated such that the answer fits inside a 32 bit integer.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For a given range of values in target, an optimal strategy is to increment the entire range by the minimum value. The minimum in a range could be obtained with Range minimum query or Segment trees algorithm.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Stack, Greedy, Monotonic Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array/">LeetCode #1526</a>
 */
public class MinimumNumberOfIncrementsOnSubarraysToFormATargetArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Increments on Subarrays to Form a Target Array");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfIncrementsOnSubarraysToFormATargetArray ===");
        MinimumNumberOfIncrementsOnSubarraysToFormATargetArray sol = new MinimumNumberOfIncrementsOnSubarraysToFormATargetArray();
        System.out.println(sol.solve(null));
    }
}
