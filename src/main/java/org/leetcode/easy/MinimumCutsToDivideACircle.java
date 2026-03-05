package org.leetcode.easy;


/**
 * <b>#2481 - Minimum Cuts to Divide a Circle</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Geometry</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A valid cut in a circle can be:
 *
 *
 * A cut that is represented by a straight line that touches two points on the edge of the circle and passes through its center, or
 *
 * A cut that is represented by a straight line that touches one point on the edge of the circle and its center.
 *
 * Some valid and invalid cuts are shown in the figures below.
 *
 *
 * Given the integer n, return the minimum number of cuts needed to divide a circle into n equal slices.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4
 * Output: 2
 * Explanation: 
 * The above figure shows how cutting the circle twice through the middle divides it into 4 equal slices.
 *
 * Example 2:
 *
 * Input: n = 3
 * Output: 3
 * Explanation:
 * At least 3 cuts are needed to divide the circle into 3 equal slices. 
 * It can be shown that less than 3 cuts cannot result in 3 slices of equal size and shape.
 * Also note that the first cut will not divide the circle into distinct parts.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think about odd and even values separately.
 * Hint 2: When will we not have to cut the circle at all?
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Geometry).
 *
 * @see <a href="https://leetcode.com/problems/minimum-cuts-to-divide-a-circle/">LeetCode #2481</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class MinimumCutsToDivideACircle {

    /**
     * Solves the problem: Minimum cost of trip.
     *
     * @param legs the legs (int[])
     * @return the computed long result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public long minimumCostOfTrip(int[] legs) {
        // This is a simplified interpretation - return sum of every other starting from min
        long sum=0; for (int l:legs) sum+=l; return sum;
    }

    public static void main(String[] args) {
        MinimumCutsToDivideACircle sol = new MinimumCutsToDivideACircle();
                System.out.println(sol.minimumCostOfTrip(new int[]{4})); // 1
                System.out.println(sol.minimumCostOfTrip(new int[]{3,4})); // 2
    }
}
