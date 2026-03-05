package org.leetcode.medium;


/**
 * <b>#2865 - Beautiful Towers I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Stack, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array heights of n integers representing the number of bricks in n consecutive towers. Your task is to remove some bricks to form a mountain-shaped tower arrangement. In this arrangement, the tower heights are non-decreasing, reaching a maximum peak value with one or multiple consecutive towers and then non-increasing.
 *
 *
 * Return the maximum possible sum of heights of a mountain-shaped tower arrangement.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: heights = [5,3,4,1,1]
 *
 *
 * Output: 13
 *
 *
 * Explanation:
 *
 *
 * We remove some bricks to make heights = [5,3,3,1,1], the peak is at index 0.
 *
 * Example 2:
 *
 * Input: heights = [6,5,3,9,2,7]
 *
 *
 * Output: 22
 *
 *
 * Explanation:
 *
 *
 * We remove some bricks to make heights = [3,3,3,9,2,2], the peak is at index 3.
 *
 * Example 3:
 *
 * Input: heights = [3,2,5,5,2,3]
 *
 *
 * Output: 18
 *
 *
 * Explanation:
 *
 *
 * We remove some bricks to make heights = [2,2,5,5,2,2], the peak is at index 2 or 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == heights.length &lt;= 103
 *
 * 1 &lt;= heights[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try all the possible indices <code>i</code> as the peak.
 * Hint 2: If <code>i</code> is the peak, <code>i-1<sup>th</sup></code> element, and <code>heights[j] = min(heights[j], heights[j + 1])</code> for <code>0 &lt;= j &lt; i</code>
 * Hint 3: If <code>i</code> is the peak, start from <code>i+1<sup>th</sup></code> element, heights[j] = min(heights[j], heights[j - 1]) for <code>i &lt; j &lt; heights.size()</code>
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Stack, Monotonic Stack).
 *
 * @see <a href="https://leetcode.com/problems/beautiful-towers-i/">LeetCode #2865</a>
 */
public class BeautifulTowersI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Beautiful Towers I");
    }

    public static void main(String[] args) {
        System.out.println("=== BeautifulTowersI ===");
        BeautifulTowersI sol = new BeautifulTowersI();
        System.out.println(sol.solve(null));
    }
}
