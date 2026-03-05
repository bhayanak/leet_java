package org.leetcode.hard;


/**
 * <b>#3625 - Count Number of Trapezoids II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Geometry</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array points where points[i] = [xi, yi] represents the coordinates of the ith point on the Cartesian plane.
 *
 *
 * Return the number of unique trapezoids that can be formed by choosing any four distinct points from points.
 *
 *
 * A trapezoid is a convex quadrilateral with at least one pair of parallel sides. Two lines are parallel if and only if they have the same slope.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: points = [[-3,2],[3,0],[2,3],[3,2],[2,-3]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * There are two distinct ways to pick four points that form a trapezoid:
 *
 *
 * The points [-3,2], [2,3], [3,2], [2,-3] form one trapezoid.
 *
 * The points [2,3], [3,2], [3,0], [2,-3] form another trapezoid.
 *
 * Example 2:
 *
 * Input: points = [[0,0],[1,0],[0,1],[2,1]]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 * There is only one trapezoid which can be formed.
 *
 *
 *
 * Constraints:
 *
 *
 * 4 &lt;= points.length &lt;= 500
 *
 * –1000 &lt;= xi, yi &lt;= 1000
 *
 * All points are pairwise distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Hash every point-pair by its reduced slope <code>(dy,dx)</code> (normalize with GCD and fix signs).
 * Hint 2: In each slope-bucket of size <code>k</code>, there are <code>C(k,2)</code> ways to pick two segments as the trapezoid's parallel bases.
 * Hint 3: Skip any base-pair that shares an endpoint since it would not form a quadrilateral.
 * Hint 4: Subtract one count for each parallelogram. Each parallelogram was counted once for each of its two parallel-side pairs, so after subtracting once, every quadrilateral with at least one pair of parallel sides, including parallelograms, contributes exactly one to the final total.
 * Hint 5: Final answer = total valid base-pairs minus parallelogram overcounts.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Geometry).
 *
 * @see <a href="https://leetcode.com/problems/count-number-of-trapezoids-ii/">LeetCode #3625</a>
 */
public class CountNumberOfTrapezoidsIi {

    /**
     * Counts Count bad pairs.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int countBadPairs(int[] nums) {
        // Bad pairs: j-i != nums[j]-nums[i] => nums[i]-i != nums[j]-j
        java.util.Map<Integer,Long> cnt=new java.util.HashMap<>();
        for (int i=0;i<nums.length;i++) cnt.merge(nums[i]-i,1L,Long::sum);
        long n=nums.length, bad=n*(n-1)/2;
        for (long v:cnt.values()) bad-=v*(v-1)/2;
        return (int)bad;
    }

    public static void main(String[] args) {
        CountNumberOfTrapezoidsIi sol = new CountNumberOfTrapezoidsIi();
        System.out.println(sol.countBadPairs(new int[]{1,2,3}));
    }
}
