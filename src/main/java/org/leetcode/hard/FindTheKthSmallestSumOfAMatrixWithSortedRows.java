package org.leetcode.hard;


/**
 * <b>#1439 - Find the Kth Smallest Sum of a Matrix With Sorted Rows</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Heap (Priority Queue), Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n matrix mat that has its rows sorted in non-decreasing order and an integer k.
 *
 *
 * You are allowed to choose exactly one element from each row to form an array.
 *
 *
 * Return the kth smallest array sum among all possible arrays.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: mat = [[1,3,11],[2,4,6]], k = 5
 * Output: 7
 * Explanation: Choosing one element from each row, the first k smallest sum are:
 * [1,2], [1,4], [3,2], [3,4], [1,6]. Where the 5th sum is 7.
 *
 * Example 2:
 *
 * Input: mat = [[1,3,11],[2,4,6]], k = 9
 * Output: 17
 *
 * Example 3:
 *
 * Input: mat = [[1,10,10],[1,4,5],[2,3,6]], k = 7
 * Output: 9
 * Explanation: Choosing one element from each row, the first k smallest sum are:
 * [1,1,2], [1,1,3], [1,4,2], [1,4,3], [1,1,6], [1,5,2], [1,5,3]. Where the 7th sum is 9.  
 *
 *
 *
 * Constraints:
 *
 *
 * m == mat.length
 *
 * n == mat.length[i]
 *
 * 1 &lt;= m, n &lt;= 40
 *
 * 1 &lt;= mat[i][j] &lt;= 5000
 *
 * 1 &lt;= k &lt;= min(200, nm)
 *
 * mat[i] is a non-decreasing array.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Save all visited sums and corresponding indexes in a priority queue. Then, once you pop the smallest sum so far, you can quickly identify the next m candidates for smallest sum by incrementing each row index by 1.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Heap (Priority Queue), Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-the-kth-smallest-sum-of-a-matrix-with-sorted-rows/">LeetCode #1439</a>
 */
public class FindTheKthSmallestSumOfAMatrixWithSortedRows {

    /**
     * Solves the problem and Solve.
     * Sorts the input first to enable efficient processing.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Kth Smallest Sum of a Matrix With Sorted Rows");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindTheKthSmallestSumOfAMatrixWithSortedRows ===");
        FindTheKthSmallestSumOfAMatrixWithSortedRows sol = new FindTheKthSmallestSumOfAMatrixWithSortedRows();
        System.out.println(sol.solve(null));
    }
}
