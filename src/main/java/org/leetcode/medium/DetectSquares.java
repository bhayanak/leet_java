package org.leetcode.medium;


/**
 * <b>#2013 - Detect Squares</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Design, Counting, Data Stream</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a stream of points on the X-Y plane. Design an algorithm that:
 *
 *
 * Adds new points from the stream into a data structure. Duplicate points are allowed and should be treated as different points.
 *
 * Given a query point, counts the number of ways to choose three points from the data structure such that the three points and the query point form an axis-aligned square with positive area.
 *
 * An axis-aligned square is a square whose edges are all the same length and are either parallel or perpendicular to the x-axis and y-axis.
 *
 *
 * Implement the DetectSquares class:
 *
 *
 * DetectSquares() Initializes the object with an empty data structure.
 *
 * void add(int[] point) Adds a new point point = [x, y] to the data structure.
 *
 * int count(int[] point) Counts the number of ways to form axis-aligned squares with point point = [x, y] as described above.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["DetectSquares", "add", "add", "add", "count", "count", "add", "count"]
 * [[], [[3, 10]], [[11, 2]], [[3, 2]], [[11, 10]], [[14, 8]], [[11, 2]], [[11, 10]]]
 * Output
 * [null, null, null, null, 1, 0, null, 2]
 *
 * Explanation
 * DetectSquares detectSquares = new DetectSquares();
 * detectSquares.add([3, 10]);
 * detectSquares.add([11, 2]);
 * detectSquares.add([3, 2]);
 * detectSquares.count([11, 10]); // return 1. You can choose:
 *                                //   - The first, second, and third points
 * detectSquares.count([14, 8]);  // return 0. The query point cannot form a square with any points in the data structure.
 * detectSquares.add([11, 2]);    // Adding duplicate points is allowed.
 * detectSquares.count([11, 10]); // return 2. You can choose:
 *                                //   - The first, second, and third points
 *                                //   - The first, third, and fourth points
 *
 *
 *
 * Constraints:
 *
 *
 * point.length == 2
 *
 * 0 &lt;= x, y &lt;= 1000
 *
 * At most 3000 calls in total will be made to add and count.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Maintain the frequency of all the points in a hash map.
 * Hint 2: Traverse the hash map and if any point has the same y-coordinate as the query point, consider this point and the query point to form one of the horizontal lines of the square.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Design, Counting, Data Stream).
 *
 * @see <a href="https://leetcode.com/problems/detect-squares/">LeetCode #2013</a>
 */
public class DetectSquares {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Detect Squares");
    }

    public static void main(String[] args) {
        System.out.println("=== DetectSquares ===");
        DetectSquares sol = new DetectSquares();
        System.out.println(sol.solve(null));
    }
}
