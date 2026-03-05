package org.leetcode.medium;


/**
 * <b>#3080 - Mark Elements on Array by Performing Queries</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting, Heap (Priority Queue), Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array nums of size n consisting of positive integers.
 *
 *
 * You are also given a 2D array queries of size m where queries[i] = [indexi, ki].
 *
 *
 * Initially all elements of the array are unmarked.
 *
 *
 * You need to apply m queries on the array in order, where on the ith query you do the following:
 *
 *
 * Mark the element at index indexi if it is not already marked.
 *
 * Then mark ki unmarked elements in the array with the smallest values. If multiple such elements exist, mark the ones with the smallest indices. And if less than ki unmarked elements exist, then mark all of them.
 *
 * Return an array answer of size m where answer[i] is the sum of unmarked elements in the array after the ith query.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,2,1,2,3,1], queries = [[1,2],[3,3],[4,2]]
 *
 *
 * Output: [8,3,0]
 *
 *
 * Explanation:
 *
 *
 * We do the following queries on the array:
 *
 *
 * Mark the element at index 1, and 2 of the smallest unmarked elements with the smallest indices if they exist, the marked elements now are nums = [1,2,2,1,2,3,1]. The sum of unmarked elements is 2 + 2 + 3 + 1 = 8.
 *
 * Mark the element at index 3, since it is already marked we skip it. Then we mark 3 of the smallest unmarked elements with the smallest indices, the marked elements now are nums = [1,2,2,1,2,3,1]. The sum of unmarked elements is 3.
 *
 * Mark the element at index 4, since it is already marked we skip it. Then we mark 2 of the smallest unmarked elements with the smallest indices if they exist, the marked elements now are nums = [1,2,2,1,2,3,1]. The sum of unmarked elements is 0.
 *
 * Example 2:
 *
 * Input: nums = [1,4,2,3], queries = [[0,1]]
 *
 *
 * Output: [7]
 *
 *
 * Explanation:  We do one query which is mark the element at index 0 and mark the smallest element among unmarked elements. The marked elements will be nums = [1,4,2,3], and the sum of unmarked elements is 4 + 3 = 7.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums.length
 *
 * m == queries.length
 *
 * 1 &lt;= m &lt;= n &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 *
 * queries[i].length == 2
 *
 * 0 &lt;= indexi, ki &lt;= n - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use another array to keep track of marked indices.
 * Hint 2: Sort the array <code>nums</code> to be able to find the smallest unmarked elements quickly in each query.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sorting, Heap (Priority Queue), Simulation).
 *
 * @see <a href="https://leetcode.com/problems/mark-elements-on-array-by-performing-queries/">LeetCode #3080</a>
 */
public class MarkElementsOnArrayByPerformingQueries {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Mark Elements on Array by Performing Queries");
    }

    public static void main(String[] args) {
        System.out.println("=== MarkElementsOnArrayByPerformingQueries ===");
        MarkElementsOnArrayByPerformingQueries sol = new MarkElementsOnArrayByPerformingQueries();
        System.out.println(sol.solve(null));
    }
}
