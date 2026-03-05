package org.leetcode.medium;


/**
 * <b>#2905 - Find Indices With Index and Value Difference II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums having length n, an integer indexDifference, and an integer valueDifference.
 *
 *
 * Your task is to find two indices i and j, both in the range [0, n - 1], that satisfy the following conditions:
 *
 *
 * abs(i - j) &gt;= indexDifference, and
 *
 * abs(nums[i] - nums[j]) &gt;= valueDifference
 *
 * Return an integer array answer, where answer = [i, j] if there are two such indices, and answer = [-1, -1] otherwise. If there are multiple choices for the two indices, return any of them.
 *
 *
 * Note: i and j may be equal.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,1,4,1], indexDifference = 2, valueDifference = 4
 * Output: [0,3]
 * Explanation: In this example, i = 0 and j = 3 can be selected.
 * abs(0 - 3) &gt;= 2 and abs(nums[0] - nums[3]) &gt;= 4.
 * Hence, a valid answer is [0,3].
 * [3,0] is also a valid answer.
 *
 * Example 2:
 *
 * Input: nums = [2,1], indexDifference = 0, valueDifference = 0
 * Output: [0,0]
 * Explanation: In this example, i = 0 and j = 0 can be selected.
 * abs(0 - 0) &gt;= 0 and abs(nums[0] - nums[0]) &gt;= 0.
 * Hence, a valid answer is [0,0].
 * Other valid answers are [0,1], [1,0], and [1,1].
 *
 * Example 3:
 *
 * Input: nums = [1,2,3], indexDifference = 2, valueDifference = 4
 * Output: [-1,-1]
 * Explanation: In this example, it can be shown that it is impossible to find two indices that satisfy both conditions.
 * Hence, [-1,-1] is returned.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 109
 *
 * 0 &lt;= indexDifference &lt;= 105
 *
 * 0 &lt;= valueDifference &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each index <code>i &gt;= indexDifference</code>, keep the indices <code>j<sub>1</sub></code> and <code>j<sub>2</sub></code> in the range <code>[0, i - indexDifference]</code> such that <code>nums[j<sub>1</sub>]</code> and <code>nums[j<sub>2</sub>]</code> are the minimum and maximum values in the index range.
 * Hint 2: Check if <code>abs(nums[i] - nums[j<sub>1</sub>]) &gt;= valueDifference</code> or <code>abs(nums[i] - nums[j<sub>2</sub>]) &gt;= valueDifference</code>.
 * Hint 3: <code>j<sub>1</sub></code> and <code>j<sub>2</sub></code> can be updated dynamically, or they can be pre-computed since they are just prefix minimum and maximum.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers).
 *
 * @see <a href="https://leetcode.com/problems/find-indices-with-index-and-value-difference-ii/">LeetCode #2905</a>
 */
public class FindIndicesWithIndexAndValueDifferenceIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Indices With Index and Value Difference II");
    }

    public static void main(String[] args) {
        System.out.println("=== FindIndicesWithIndexAndValueDifferenceIi ===");
        FindIndicesWithIndexAndValueDifferenceIi sol = new FindIndicesWithIndexAndValueDifferenceIi();
        System.out.println(sol.solve(null));
    }
}
