package org.leetcode.medium;


/**
 * <b>#2279 - Maximum Bags With Full Capacity of Rocks</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have n bags numbered from 0 to n - 1. You are given two 0-indexed integer arrays capacity and rocks. The ith bag can hold a maximum of capacity[i] rocks and currently contains rocks[i] rocks. You are also given an integer additionalRocks, the number of additional rocks you can place in any of the bags.
 *
 *
 * Return the maximum number of bags that could have full capacity after placing the additional rocks in some bags.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: capacity = [2,3,4,5], rocks = [1,2,4,4], additionalRocks = 2
 * Output: 3
 * Explanation:
 * Place 1 rock in bag 0 and 1 rock in bag 1.
 * The number of rocks in each bag are now [2,3,4,4].
 * Bags 0, 1, and 2 have full capacity.
 * There are 3 bags at full capacity, so we return 3.
 * It can be shown that it is not possible to have more than 3 bags at full capacity.
 * Note that there may be other ways of placing the rocks that result in an answer of 3.
 *
 * Example 2:
 *
 * Input: capacity = [10,2,2], rocks = [2,2,0], additionalRocks = 100
 * Output: 3
 * Explanation:
 * Place 8 rocks in bag 0 and 2 rocks in bag 2.
 * The number of rocks in each bag are now [10,2,2].
 * Bags 0, 1, and 2 have full capacity.
 * There are 3 bags at full capacity, so we return 3.
 * It can be shown that it is not possible to have more than 3 bags at full capacity.
 * Note that we did not use all of the additional rocks.
 *
 *
 *
 * Constraints:
 *
 *
 * n == capacity.length == rocks.length
 *
 * 1 &lt;= n &lt;= 5 * 104
 *
 * 1 &lt;= capacity[i] &lt;= 109
 *
 * 0 &lt;= rocks[i] &lt;= capacity[i]
 *
 * 1 &lt;= additionalRocks &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Which bag should you fill completely first?
 * Hint 2: Can you think of a greedy solution?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/">LeetCode #2279</a>
 */
public class MaximumBagsWithFullCapacityOfRocks {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Bags With Full Capacity of Rocks");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumBagsWithFullCapacityOfRocks ===");
        MaximumBagsWithFullCapacityOfRocks sol = new MaximumBagsWithFullCapacityOfRocks();
        System.out.println(sol.solve(null));
    }
}
