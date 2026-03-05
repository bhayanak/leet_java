package org.leetcode.hard;


/**
 * <b>#1388 - Pizza With 3n Slices</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Greedy, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a pizza with 3n slices of varying size, you and your friends will take slices of pizza as follows:
 *
 *
 * You will pick any pizza slice.
 *
 * Your friend Alice will pick the next slice in the anti-clockwise direction of your pick.
 *
 * Your friend Bob will pick the next slice in the clockwise direction of your pick.
 *
 * Repeat until there are no more slices of pizzas.
 *
 * Given an integer array slices that represent the sizes of the pizza slices in a clockwise direction, return the maximum possible sum of slice sizes that you can pick.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: slices = [1,2,3,4,5,6]
 * Output: 10
 * Explanation: Pick pizza slice of size 4, Alice and Bob will pick slices with size 3 and 5 respectively. Then Pick slices with size 6, finally Alice and Bob will pick slice of size 2 and 1 respectively. Total = 4 + 6.
 *
 * Example 2:
 *
 * Input: slices = [8,9,8,6,1,1]
 * Output: 16
 * Explanation: Pick pizza slice of size 8 in each turn. If you pick slice with size 9 your partners will pick slices of size 8.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 * n == slices.length
 *
 * 1 &lt;= slices.length &lt;= 500
 *
 * 1 &lt;= slices[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: By studying the pattern of the operations, we can find out that the problem is equivalent to: Given an integer array with size 3N, select N integers with maximum sum and any selected integers are not next to each other in the array.
 * Hint 2: The first one in the array is considered next to the last one in the array. Use Dynamic Programming to solve it.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Greedy, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/pizza-with-3n-slices/">LeetCode #1388</a>
 */
public class PizzaWith3nSlices {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Pizza With 3n Slices");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== PizzaWith3nSlices ===");
        PizzaWith3nSlices sol = new PizzaWith3nSlices();
        System.out.println(sol.solve(null));
    }
}
