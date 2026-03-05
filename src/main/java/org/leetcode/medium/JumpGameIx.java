package org.leetcode.medium;


/**
 * <b>#3660 - Jump Game IX</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * From any index i, you can jump to another index j under the following rules:
 *
 *
 * Jump to index j where j &gt; i is allowed only if nums[j] &lt; nums[i].
 *
 * Jump to index j where j &lt; i is allowed only if nums[j] &gt; nums[i].
 *
 * For each index i, find the maximum value in nums that can be reached by following any sequence of valid jumps starting at i.
 *
 *
 * Return an array ans where ans[i] is the maximum value reachable starting from index i.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1,3]
 *
 *
 * Output: [2,2,3]
 *
 *
 * Explanation:
 *
 *
 * For i = 0: No jump increases the value.
 *
 * For i = 1: Jump to j = 0 as nums[j] = 2 is greater than nums[i].
 *
 * For i = 2: Since nums[2] = 3 is the maximum value in nums, no jump increases the value.
 *
 * Thus, ans = [2, 2, 3].
 *
 * Example 2:
 *
 * Input: nums = [2,3,1]
 *
 *
 * Output: [3,3,3]
 *
 *
 * Explanation:
 *
 *
 * For i = 0: Jump forward to j = 2 as nums[j] = 1 is less than nums[i] = 2, then from i = 2 jump to j = 1 as nums[j] = 3 is greater than nums[2].
 *
 * For i = 1: Since nums[1] = 3 is the maximum value in nums, no jump increases the value.
 *
 * For i = 2: Jump to j = 1 as nums[j] = 3 is greater than nums[2] = 1.
 *
 * Thus, ans = [3, 3, 3].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109​​​​​​​
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think of the array as a directed graph where edges represent valid jumps.
 * Hint 2: From index <code>i</code>, forward jumps go only to smaller values; backward jumps go only to larger values.
 * Hint 3: The maximum reachable value from <code>i</code> is the maximum value in the connected component reachable under these jump rules.
 * Hint 4: You can find connected ranges by looking at prefix maximums and suffix minimums, a cut happens where all values to the left are &lt;= all values to the right.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/jump-game-ix/">LeetCode #3660</a>
 */
public class JumpGameIx {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Jump Game IX");
    }

    public static void main(String[] args) {
        System.out.println("=== JumpGameIx ===");
        JumpGameIx sol = new JumpGameIx();
        System.out.println(sol.solve(null));
    }
}
