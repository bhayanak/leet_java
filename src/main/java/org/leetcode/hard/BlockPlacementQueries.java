package org.leetcode.hard;


/**
 * <b>#3161 - Block Placement Queries</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Binary Indexed Tree, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There exists an infinite number line, with its origin at 0 and extending towards the positive x-axis.
 *
 *
 * You are given a 2D array queries, which contains two types of queries:
 *
 *
 * For a query of type 1, queries[i] = [1, x]. Build an obstacle at distance x from the origin. It is guaranteed that there is no obstacle at distance x when the query is asked.
 *
 * For a query of type 2, queries[i] = [2, x, sz]. Check if it is possible to place a block of size sz anywhere in the range [0, x] on the line, such that the block entirely lies in the range [0, x]. A block cannot be placed if it intersects with any obstacle, but it may touch it. Note that you do not actually place the block. Queries are separate.
 *
 * Return a boolean array results, where results[i] is true if you can place the block specified in the ith query of type 2, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: queries = [[1,2],[2,3,3],[2,3,1],[2,2,2]]
 *
 *
 * Output: [false,true,true]
 *
 *
 * Explanation:
 *
 * For query 0, place an obstacle at x = 2. A block of size at most 2 can be placed before x = 3.
 *
 * Example 2:
 *
 * Input: queries = [[1,7],[2,7,6],[1,2],[2,7,5],[2,7,6]]
 *
 *
 * Output: [true,true,false]
 *
 *
 * Explanation:
 *
 *
 * Place an obstacle at x = 7 for query 0. A block of size at most 7 can be placed before x = 7.
 *
 * Place an obstacle at x = 2 for query 2. Now, a block of size at most 5 can be placed before x = 7, and a block of size at most 2 before x = 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= queries.length &lt;= 15 * 104
 *
 * 2 &lt;= queries[i].length &lt;= 3
 *
 * 1 &lt;= queries[i][0] &lt;= 2
 *
 * 1 &lt;= x, sz &lt;= min(5 * 104, 3 * queries.length)
 *
 * The input is generated such that for queries of type 1, no obstacle exists at distance x when the query is asked.
 *
 * The input is generated such that there is at least one query of type 2.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>d[x]</code> be the distance of the next obstacle after <code>x</code>.
 * Hint 2: For each query of type 2, we just need to check if <code>max(d[0], d[1], d[2], …d[x - sz]) &gt; sz</code>.
 * Hint 3: Use segment tree to maintain <code>d[x]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Binary Indexed Tree, Segment Tree).
 *
 * @see <a href="https://leetcode.com/problems/block-placement-queries/">LeetCode #3161</a>
 */
public class BlockPlacementQueries {

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
        throw new UnsupportedOperationException("Not yet implemented: Block Placement Queries");
    }

    public static void main(String[] args) {
        System.out.println("=== BlockPlacementQueries ===");
        BlockPlacementQueries sol = new BlockPlacementQueries();
        System.out.println(sol.solve(null));
    }
}
