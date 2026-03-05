package org.leetcode.hard;


/**
 * <b>#1499 - Max Value of Equation</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Queue, Sliding Window, Heap (Priority Queue), Monotonic Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array points containing the coordinates of points on a 2D plane, sorted by the x-values, where points[i] = [xi, yi] such that xi &lt; xj for all 1 &lt;= i &lt; j &lt;= points.length. You are also given an integer k.
 *
 *
 * Return the maximum value of the equation yi + yj + |xi - xj| where |xi - xj| &lt;= k and 1 &lt;= i &lt; j &lt;= points.length.
 *
 *
 * It is guaranteed that there exists at least one pair of points that satisfy the constraint |xi - xj| &lt;= k.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: points = [[1,3],[2,0],[5,10],[6,-10]], k = 1
 * Output: 4
 * Explanation: The first two points satisfy the condition |xi - xj| &lt;= 1 and if we calculate the equation we get 3 + 0 + |1 - 2| = 4. Third and fourth points also satisfy the condition and give a value of 10 + -10 + |5 - 6| = 1.
 * No other pairs satisfy the condition, so we return the max of 4 and 1.
 *
 * Example 2:
 *
 * Input: points = [[0,0],[3,0],[9,2]], k = 3
 * Output: 3
 * Explanation: Only the first two points have an absolute difference of 3 or less in the x-values, and give the value of 0 + 0 + |0 - 3| = 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= points.length &lt;= 105
 *
 * points[i].length == 2
 *
 * -108 &lt;= xi, yi &lt;= 108
 *
 * 0 &lt;= k &lt;= 2 * 108
 *
 * xi &lt; xj for all 1 &lt;= i &lt; j &lt;= points.length
 *
 * xi form a strictly increasing sequence.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a priority queue to store for each point i, the tuple [yi-xi, xi]
 * Hint 2: Loop through the array and pop elements from the heap if the condition xj - xi &gt; k, where j is the current index and i is the point on top the queue.
 * Hint 3: After popping elements from the queue. If the queue is not empty, calculate the equation with the current point and the point on top of the queue and maximize the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Queue, Sliding Window, Heap (Priority Queue), Monotonic Queue).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/max-value-of-equation/">LeetCode #1499</a>
 */
public class MaxValueOfEquation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Max Value of Equation");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaxValueOfEquation ===");
        MaxValueOfEquation sol = new MaxValueOfEquation();
        System.out.println(sol.solve(null));
    }
}
