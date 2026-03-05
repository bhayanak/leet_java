package org.leetcode.medium;


/**
 * <b>#3282 - Reach End of Array With Max Score</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n.
 *
 *
 * Your goal is to start at index 0 and reach index n - 1. You can only jump to indices greater than your current index.
 *
 *
 * The score for a jump from index i to index j is calculated as (j - i) * nums[i].
 *
 *
 * Return the maximum possible total score by the time you reach the last index.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,1,5]
 *
 *
 * Output: 7
 *
 *
 * Explanation:
 *
 *
 * First, jump to index 1 and then jump to the last index. The final score is 1 * 1 + 2 * 3 = 7.
 *
 * Example 2:
 *
 * Input: nums = [4,3,1,3,2]
 *
 *
 * Output: 16
 *
 *
 * Explanation:
 *
 *
 * Jump directly to the last index. The final score is 4 * 4 = 16.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It can be proven that from each index <code>i</code>, the optimal solution is to jump to the nearest index <code>j &gt; i</code> such that <code>nums[j] &gt; nums[i]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/reach-end-of-array-with-max-score/">LeetCode #3282</a>
 */
public class ReachEndOfArrayWithMaxScore {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Reach End of Array With Max Score");
    }

    public static void main(String[] args) {
        System.out.println("=== ReachEndOfArrayWithMaxScore ===");
        ReachEndOfArrayWithMaxScore sol = new ReachEndOfArrayWithMaxScore();
        System.out.println(sol.solve(null));
    }
}
