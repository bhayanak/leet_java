package org.leetcode.hard;


/**
 * <b>#1515 - Best Position for a Service Centre</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Geometry, Randomized</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A delivery company wants to build a new service center in a new city. The company knows the positions of all the customers in this city on a 2D-Map and wants to build the new center in a position such that the sum of the euclidean distances to all customers is minimum.
 *
 *
 * Given an array positions where positions[i] = [xi, yi] is the position of the ith customer on the map, return the minimum sum of the euclidean distances to all customers.
 *
 *
 * In other words, you need to choose the position of the service center [xcentre, ycentre] such that the following formula is minimized:
 *
 *
 * Answers within 10-5 of the actual value will be accepted.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: positions = [[0,1],[1,0],[1,2],[2,1]]
 * Output: 4.00000
 * Explanation: As shown, you can see that choosing [xcentre, ycentre] = [1, 1] will make the distance to each customer = 1, the sum of all distances is 4 which is the minimum possible we can achieve.
 *
 * Example 2:
 *
 * Input: positions = [[1,1],[3,3]]
 * Output: 2.82843
 * Explanation: The minimum possible sum of distances = sqrt(2) + sqrt(2) = 2.82843
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= positions.length &lt;= 50
 *
 * positions[i].length == 2
 *
 * 0 &lt;= xi, yi &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The problem can be reworded as, giving a set of points on a 2d-plane, return the geometric median.
 * Hint 2: Loop over each triplet of points (positions[i], positions[j], positions[k]) where i &lt; j &lt; k, get the centre of the circle which goes throw the 3 points, check if all other points lie in this circle.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Geometry, Randomized).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/best-position-for-a-service-centre/">LeetCode #1515</a>
 */
public class BestPositionForAServiceCentre {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Best Position for a Service Centre");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== BestPositionForAServiceCentre ===");
        BestPositionForAServiceCentre sol = new BestPositionForAServiceCentre();
        System.out.println(sol.solve(null));
    }
}
