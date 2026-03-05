package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

/**
 * <b>LeetCode #452 – Minimum Number of Arrows to Burst Balloons</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Topics:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are some spherical balloons taped onto a flat wall that represents the XY-plane. The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] denotes a balloon whose horizontal diameter stretches between xstart and xend. You do not know the exact y-coordinates of the balloons.
 *
 * Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis. A balloon with xstart and xend is burst by an arrow shot at x if xstart &lt;= x &lt;= xend. There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.
 *
 * Given the array points, return the minimum number of arrows that must be shot to burst all balloons.
 * </pre>
 *
 * <h2>Examples</h2>
 * <pre>
 * Example 1:
 *   Input: points = [[10,16],[2,8],[1,6],[7,12]]
 *   Output: 2
 *   Explanation: The balloons can be burst by 2 arrows:
 *     - Shoot an arrow at x = 6, bursting the balloons [2,8] and [1,6].
 *     - Shoot an arrow at x = 11, bursting the balloons [10,16] and [7,12].
 *
 * Example 2:
 *   Input: points = [[1,2],[3,4],[5,6],[7,8]]
 *   Output: 4
 *   Explanation: One arrow needs to be shot for each balloon for a total of 4 arrows.
 *
 * Example 3:
 *   Input: points = [[1,2],[2,3],[3,4],[4,5]]
 *   Output: 2
 *   Explanation: The balloons can be burst by 2 arrows:
 *     - Shoot an arrow at x = 2, bursting the balloons [1,2] and [2,3].
 *     - Shoot an arrow at x = 4, bursting the balloons [3,4] and [4,5].
 * </pre>
 *
 * <h2>Constraints</h2>
 * <ul>
 *   <li>1 &lt;= points.length &lt;= 10^5</li>
 *   <li>points[i].length == 2</li>
 *   <li>-2^31 &lt;= xstart &lt; xend &lt;= 2^31 - 1</li>
 * </ul>
 *
 * <h2>Approach</h2>
 * <p>Sort the balloons by their end coordinate. Iterate through the sorted list, shooting an arrow at the end of the current balloon if it is not already burst by a previous arrow. This greedy approach ensures the minimum number of arrows.</p>
 *
 * <h2>Complexity</h2>
 * <ul>
 *   <li>Time: O(n log n), where n is the number of balloons (due to sorting).</li>
 *   <li>Space: O(1) (ignoring input storage).</li>
 * </ul>
 *
 * <p><b>Explanation:</b> Greedy: always shoot at the end of the next uncovered balloon. This covers as many as possible with each arrow.</p>
 * @see <a href="https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/">Problem</a>
 */
public class MinimumNumberOfArrowsToBurstBalloons {

    
    /**
     * Returns the minimum number of arrows required to burst all balloons.
     *
     * @param points 2D array where each element is [xstart, xend] for a balloon
     * @return minimum number of arrows needed
     *
     * <p><b>Explanation:</b> Sorts balloons by end coordinate and uses a greedy approach: shoot an arrow at the end of the next uncovered balloon, covering as many as possible with each arrow. Time O(n log n), Space O(1).</p>
     */
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;
        Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
        int arrows = 1, end = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) { arrows++; end = points[i][1]; }
        }
        return arrows;
    }

    public static void main(String[] args) {
        MinimumNumberOfArrowsToBurstBalloons sol = new MinimumNumberOfArrowsToBurstBalloons();
        System.out.println(sol.findMinArrowShots(new int[][]{{1,2},{3,4}}));
    }
}
