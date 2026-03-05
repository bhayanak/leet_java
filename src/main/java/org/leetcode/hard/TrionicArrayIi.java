package org.leetcode.hard;


/**
 * <b>#3640 - Trionic Array II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n.
 *
 *
 * A trionic subarray is a contiguous subarray nums[l...r] (with 0 &lt;= l &lt; r &lt; n) for which there exist indices l &lt; p &lt; q &lt; r such that:
 *
 *
 * nums[l...p] is strictly increasing,
 *
 * nums[p...q] is strictly decreasing,
 *
 * nums[q...r] is strictly increasing.
 *
 * Return the maximum sum of any trionic subarray in nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,-2,-1,-3,0,2,-1]
 *
 *
 * Output: -4
 *
 *
 * Explanation:
 *
 *
 * Pick l = 1, p = 2, q = 3, r = 5:
 *
 *
 * nums[l...p] = nums[1...2] = [-2, -1] is strictly increasing (-2 &lt; -1).
 *
 * nums[p...q] = nums[2...3] = [-1, -3] is strictly decreasing (-1 &gt; -3)
 *
 * nums[q...r] = nums[3...5] = [-3, 0, 2] is strictly increasing (-3 &lt; 0 &lt; 2).
 *
 * Sum = (-2) + (-1) + (-3) + 0 + 2 = -4.
 *
 * Example 2:
 *
 * Input: nums = [1,4,2,7]
 *
 *
 * Output: 14
 *
 *
 * Explanation:
 *
 *
 * Pick l = 0, p = 1, q = 2, r = 3:
 *
 *
 * nums[l...p] = nums[0...1] = [1, 4] is strictly increasing (1 &lt; 4).
 *
 * nums[p...q] = nums[1...2] = [4, 2] is strictly decreasing (4 &gt; 2).
 *
 * nums[q...r] = nums[2...3] = [2, 7] is strictly increasing (2 &lt; 7).
 *
 * Sum = 1 + 4 + 2 + 7 = 14.
 *
 *
 *
 * Constraints:
 *
 *
 * 4 &lt;= n = nums.length &lt;= 105
 *
 * -109 &lt;= nums[i] &lt;= 109
 *
 * It is guaranteed that at least one trionic subarray exists.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming
 * Hint 2: Let four arrays <code>dp0...dp3</code> where <code>dpk[i]</code> is the max sum of a subarray ending at <code>i</code> after finishing <code>k</code> of the four phases (start -&gt; inc -&gt; dec -&gt; inc)
 * Hint 3: Process each <code>i&gt;0</code>
 * Hint 4: If <code>nums[i] &gt; nums[i‑1]</code>, set <code>dp1[i]=max(dp1[i‑1]+nums[i], dp0[i‑1]+nums[i])</code>, <code>dp3[i]=max(dp3[i‑1]+nums[i], dp2[i‑1]+nums[i])</code>
 * Hint 5: If <code>nums[i] &lt; nums[i‑1]</code>, set <code>dp2[i]=max(dp2[i‑1]+nums[i], dp1[i‑1]+nums[i])</code>
 * Hint 6: Always carry over <code>dp0[i]=dp0[i‑1]+nums[i]</code> when <code>nums[i]&gt;nums[i‑1]</code>
 * Hint 7: Return the maximum value in <code>dp3</code>
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/trionic-array-ii/">LeetCode #3640</a>
 */
public class TrionicArrayIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Trionic Array II");
    }

    public static void main(String[] args) {
        System.out.println("=== TrionicArrayIi ===");
        TrionicArrayIi sol = new TrionicArrayIi();
        System.out.println(sol.solve(null));
    }
}
