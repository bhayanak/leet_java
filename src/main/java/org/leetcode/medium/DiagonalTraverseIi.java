package org.leetcode.medium;


/**
 * <b>#1424 - Diagonal Traverse II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 2D integer array nums, return all elements of nums in diagonal order as shown in the below images.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [1,4,2,7,5,3,8,6,9]
 *
 * Example 2:
 *
 * Input: nums = [[1,2,3,4,5],[6,7],[8],[9,10,11],[12,13,14,15,16]]
 * Output: [1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i].length &lt;= 105
 *
 * 1 &lt;= sum(nums[i].length) &lt;= 105
 *
 * 1 &lt;= nums[i][j] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Notice that numbers with equal sums of row and column indexes belong to the same diagonal.
 * Hint 2: Store them in tuples (sum, row, val), sort them, and then regroup the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/diagonal-traverse-ii/">LeetCode #1424</a>
 */
public class DiagonalTraverseIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Diagonal Traverse II");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== DiagonalTraverseIi ===");
        DiagonalTraverseIi sol = new DiagonalTraverseIi();
        System.out.println(sol.solve(null));
    }
}
