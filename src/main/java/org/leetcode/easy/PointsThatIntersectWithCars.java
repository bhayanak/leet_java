package org.leetcode.easy;


/**
 * <b>#2848 - Points That Intersect With Cars</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed 2D integer array nums representing the coordinates of the cars parking on a number line. For any index i, nums[i] = [starti, endi] where starti is the starting point of the ith car and endi is the ending point of the ith car.
 *
 *
 * Return the number of integer points on the line that are covered with any part of a car.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [[3,6],[1,5],[4,7]]
 * Output: 7
 * Explanation: All the points from 1 to 7 intersect at least one car, therefore the answer would be 7.
 *
 * Example 2:
 *
 * Input: nums = [[1,3],[5,8]]
 * Output: 7
 * Explanation: Points intersecting at least one car are 1, 2, 3, 5, 6, 7, 8. There are a total of 7 points, therefore the answer would be 7.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * nums[i].length == 2
 *
 * 1 &lt;= starti &lt;= endi &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the array according to first element and then starting from the <code>0<sup>th</sup></code> index remove the overlapping parts and return the count of non-overlapping points.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/points-that-intersect-with-cars/">LeetCode #2848</a>
  *
  * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
  */
public class PointsThatIntersectWithCars {

    /**
     * Solves the problem: Number of points.
     *
     * @param nums the nums (java.util.List&lt;java.util.List&lt;Integer&gt;&gt;)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public int numberOfPoints(java.util.List<java.util.List<Integer>> nums) {
        boolean[] covered=new boolean[102];
        for (java.util.List<Integer> seg:nums) for (int i=seg.get(0);i<=seg.get(1);i++) covered[i]=true;
        int cnt=0; for (boolean b:covered) if (b) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        PointsThatIntersectWithCars sol = new PointsThatIntersectWithCars();
        System.out.println(sol.numberOfPoints(null));
    }
}
