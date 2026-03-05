package org.leetcode.hard;


/**
 * <b>#2552 - Count Increasing Quadruplets</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Binary Indexed Tree, Enumeration, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 0-indexed integer array nums of size n containing all numbers from 1 to n, return the number of increasing quadruplets.
 *
 *
 * A quadruplet (i, j, k, l) is increasing if:
 *
 *
 * 0 &lt;= i &lt; j &lt; k &lt; l &lt; n, and
 *
 * nums[i] &lt; nums[k] &lt; nums[j] &lt; nums[l].
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,2,4,5]
 * Output: 2
 * Explanation: 
 * - When i = 0, j = 1, k = 2, and l = 3, nums[i] &lt; nums[k] &lt; nums[j] &lt; nums[l].
 * - When i = 0, j = 1, k = 2, and l = 4, nums[i] &lt; nums[k] &lt; nums[j] &lt; nums[l]. 
 * There are no other quadruplets, so we return 2.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: 0
 * Explanation: There exists only one quadruplet with i = 0, j = 1, k = 2, l = 3, but since nums[j] &lt; nums[k], we return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 4 &lt;= nums.length &lt;= 4000
 *
 * 1 &lt;= nums[i] &lt;= nums.length
 *
 * All the integers of nums are unique. nums is a permutation.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you loop over all possible (j, k) and find the answer?
 * Hint 2: We can pre-compute all possible (i, j) and (k, l) and store them in 2 matrices.
 * Hint 3: The answer will the sum of prefix[j][k] * suffix[k][j].
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Binary Indexed Tree, Enumeration, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/count-increasing-quadruplets/">LeetCode #2552</a>
 */
public class CountIncreasingQuadruplets {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Increasing Quadruplets");
    }

    public static void main(String[] args) {
        System.out.println("=== CountIncreasingQuadruplets ===");
        CountIncreasingQuadruplets sol = new CountIncreasingQuadruplets();
        System.out.println(sol.solve(null));
    }
}
