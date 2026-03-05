package org.leetcode.easy;


/**
 * <b>#3000 - Maximum Area of Longest Diagonal Rectangle</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D 0-indexed integer array dimensions.
 *
 *
 * For all indices i, 0 &lt;= i &lt; dimensions.length, dimensions[i][0] represents the length and dimensions[i][1] represents the width of the rectangle i.
 *
 *
 * Return the area of the rectangle having the longest diagonal. If there are multiple rectangles with the longest diagonal, return the area of the rectangle having the maximum area.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: dimensions = [[9,3],[8,6]]
 * Output: 48
 * Explanation: 
 * For index = 0, length = 9 and width = 3. Diagonal length = sqrt(9 * 9 + 3 * 3) = sqrt(90) ≈ 9.487.
 * For index = 1, length = 8 and width = 6. Diagonal length = sqrt(8 * 8 + 6 * 6) = sqrt(100) = 10.
 * So, the rectangle at index 1 has a greater diagonal length therefore we return area = 8 * 6 = 48.
 *
 * Example 2:
 *
 * Input: dimensions = [[3,4],[4,3]]
 * Output: 12
 * Explanation: Length of diagonal is the same for both which is 5, so maximum area = 12.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= dimensions.length &lt;= 100
 *
 * dimensions[i].length == 2
 *
 * 1 &lt;= dimensions[i][0], dimensions[i][1] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Diagonal of rectangle is <code>sqrt(length<sup>2</sup> + width<sup>2</sup>)</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle/">LeetCode #3000</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumAreaOfLongestDiagonalRectangle {

    /**
     * Computes the maximum Max area.
     *
     * @param height the height (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maxArea(int[] height) {
        int lo=0,hi=height.length-1,max=0;
        while(lo<hi){max=Math.max(max,Math.min(height[lo],height[hi])*(hi-lo));if(height[lo]<height[hi])lo++;else hi--;}
        return max;
    }

    public static void main(String[] args) {
        MaximumAreaOfLongestDiagonalRectangle sol = new MaximumAreaOfLongestDiagonalRectangle();
                System.out.println(sol.maxArea(new int[]{1,8,6,2,5,4,8,3,7})); // 49
                System.out.println(sol.maxArea(new int[]{1,1})); // 1
    }
}
