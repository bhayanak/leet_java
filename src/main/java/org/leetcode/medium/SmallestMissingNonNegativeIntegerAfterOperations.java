package org.leetcode.medium;


/**
 * <b>#2598 - Smallest Missing Non-negative Integer After Operations</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums and an integer value.
 *
 *
 * In one operation, you can add or subtract value from any element of nums.
 *
 *
 * For example, if nums = [1,2,3] and value = 2, you can choose to subtract value from nums[0] to make nums = [-1,2,3].
 *
 * The MEX (minimum excluded) of an array is the smallest missing non-negative integer in it.
 *
 *
 * For example, the MEX of [-1,2,3] is 0 while the MEX of [1,0,3] is 2.
 *
 * Return the maximum MEX of nums after applying the mentioned operation any number of times.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,-10,7,13,6,8], value = 5
 * Output: 4
 * Explanation: One can achieve this result by applying the following operations:
 * - Add value to nums[1] twice to make nums = [1,0,7,13,6,8]
 * - Subtract value from nums[2] once to make nums = [1,0,2,13,6,8]
 * - Subtract value from nums[3] twice to make nums = [1,0,2,3,6,8]
 * The MEX of nums is 4. It can be shown that 4 is the maximum MEX we can achieve.
 *
 * Example 2:
 *
 * Input: nums = [1,-10,7,13,6,8], value = 7
 * Output: 2
 * Explanation: One can achieve this result by applying the following operation:
 * - subtract value from nums[2] once to make nums = [1,-10,0,13,6,8]
 * The MEX of nums is 2. It can be shown that 2 is the maximum MEX we can achieve.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length, value &lt;= 105
 *
 * -109 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think about using modular arithmetic.
 * Hint 2: if x = nums[i] (mod value), then we can make nums[i] equal to x  after some number of operations
 * Hint 3: How does finding the frequency of (nums[i] mod value) help?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/smallest-missing-non-negative-integer-after-operations/">LeetCode #2598</a>
 */
public class SmallestMissingNonNegativeIntegerAfterOperations {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Smallest Missing Non-negative Integer After Operations");
    }

    public static void main(String[] args) {
        System.out.println("=== SmallestMissingNonNegativeIntegerAfterOperations ===");
        SmallestMissingNonNegativeIntegerAfterOperations sol = new SmallestMissingNonNegativeIntegerAfterOperations();
        System.out.println(sol.solve(null));
    }
}
