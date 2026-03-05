package org.leetcode.medium;


/**
 * <b>#1558 - Minimum Numbers of Function Calls to Make Target Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. You have an integer array arr of the same length with all values set to 0 initially. You also have the following modify function:
 *
 *
 * You want to use the modify function to convert arr to nums using the minimum number of calls.
 *
 *
 * Return the minimum number of function calls to make nums from arr.
 *
 *
 * The test cases are generated so that the answer fits in a 32-bit signed integer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,5]
 * Output: 5
 * Explanation: Increment by 1 (second element): [0, 0] to get [0, 1] (1 operation).
 * Double all the elements: [0, 1] -&gt; [0, 2] -&gt; [0, 4] (2 operations).
 * Increment by 1 (both elements)  [0, 4] -&gt; [1, 4] -&gt; [1, 5] (2 operations).
 * Total of operations: 1 + 2 + 2 = 5.
 *
 * Example 2:
 *
 * Input: nums = [2,2]
 * Output: 3
 * Explanation: Increment by 1 (both elements) [0, 0] -&gt; [0, 1] -&gt; [1, 1] (2 operations).
 * Double all the elements: [1, 1] -&gt; [2, 2] (1 operation).
 * Total of operations: 2 + 1 = 3.
 *
 * Example 3:
 *
 * Input: nums = [4,2,5]
 * Output: 6
 * Explanation: (initial)[0,0,0] -&gt; [1,0,0] -&gt; [1,0,1] -&gt; [2,0,2] -&gt; [2,1,2] -&gt; [4,2,4] -&gt; [4,2,5](nums).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Work backwards: try to go from nums to arr.
 * Hint 2: You should try to divide by 2 as much as possible, but you can only divide by 2 if everything is even.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Bit Manipulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-numbers-of-function-calls-to-make-target-array/">LeetCode #1558</a>
 */
public class MinimumNumbersOfFunctionCallsToMakeTargetArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Numbers of Function Calls to Make Target Array");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumNumbersOfFunctionCallsToMakeTargetArray ===");
        MinimumNumbersOfFunctionCallsToMakeTargetArray sol = new MinimumNumbersOfFunctionCallsToMakeTargetArray();
        System.out.println(sol.solve(null));
    }
}
