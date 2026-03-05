package org.leetcode.hard;


/**
 * <b>#1776 - Car Fleet II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Stack, Heap (Priority Queue), Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n cars traveling at different speeds in the same direction along a one-lane road. You are given an array cars of length n, where cars[i] = [positioni, speedi] represents:
 *
 *
 * positioni is the distance between the ith car and the beginning of the road in meters. It is guaranteed that positioni &lt; positioni+1.
 *
 * speedi is the initial speed of the ith car in meters per second.
 *
 * For simplicity, cars can be considered as points moving along the number line. Two cars collide when they occupy the same position. Once a car collides with another car, they unite and form a single car fleet. The cars in the formed fleet will have the same position and the same speed, which is the initial speed of the slowest car in the fleet.
 *
 *
 * Return an array answer, where answer[i] is the time, in seconds, at which the ith car collides with the next car, or -1 if the car does not collide with the next car. Answers within 10-5 of the actual answers are accepted.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: cars = [[1,2],[2,1],[4,3],[7,2]]
 * Output: [1.00000,-1.00000,3.00000,-1.00000]
 * Explanation: After exactly one second, the first car will collide with the second car, and form a car fleet with speed 1 m/s. After exactly 3 seconds, the third car will collide with the fourth car, and form a car fleet with speed 2 m/s.
 *
 * Example 2:
 *
 * Input: cars = [[3,4],[5,4],[6,3],[9,1]]
 * Output: [2.00000,1.00000,1.50000,-1.00000]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= cars.length &lt;= 105
 *
 * 1 &lt;= positioni, speedi &lt;= 106
 *
 * positioni &lt; positioni+1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can simply ignore the merging of any car fleet, simply assume they cross each other. Now the aim is to find the first car to the right, which intersects with the current car before any other.
 * Hint 2: Assume we have already considered all cars to the right already, now the current car is to be considered. Let’s ignore all cars with speeds higher than the current car since the current car cannot intersect with those ones. Now, all cars to the right having speed strictly less than current car are to be considered. Now, for two cars c1 and c2 with positions p1 and p2 (p1 &lt; p2) and speed s1 and s2 (s1 &gt; s2), if c1 and c2 intersect before the current car and c2, then c1 can never be the first car of intersection for any car to the left of current car including current car. So we can remove that car from our consideration.
 * Hint 3: We can see that we can maintain candidate cars in this way using a stack, removing cars with speed greater than or equal to current car, and then removing cars which can never be first point of intersection. The first car after this process (if any) would be first point of intersection.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Stack, Heap (Priority Queue), Monotonic Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/car-fleet-ii/">LeetCode #1776</a>
 */
public class CarFleetIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Car Fleet II");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CarFleetIi ===");
        CarFleetIi sol = new CarFleetIi();
        System.out.println(sol.solve(null));
    }
}
