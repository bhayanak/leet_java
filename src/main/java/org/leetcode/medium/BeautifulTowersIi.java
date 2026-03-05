package org.leetcode.medium;


/**
 * <b>#2866 - Beautiful Towers II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Stack, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array maxHeights of n integers.
 *
 *
 * You are tasked with building n towers in the coordinate line. The ith tower is built at coordinate i and has a height of heights[i].
 *
 *
 * A configuration of towers is beautiful if the following conditions hold:
 *
 *
 * 1 &lt;= heights[i] &lt;= maxHeights[i]
 *
 * heights is a mountain array.
 *
 * Array heights is a mountain if there exists an index i such that:
 *
 *
 * For all 0 &lt; j &lt;= i, heights[j - 1] &lt;= heights[j]
 *
 * For all i &lt;= k &lt; n - 1, heights[k + 1] &lt;= heights[k]
 *
 * Return the maximum possible sum of heights of a beautiful configuration of towers.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: maxHeights = [5,3,4,1,1]
 * Output: 13
 * Explanation: One beautiful configuration with a maximum sum is heights = [5,3,3,1,1]. This configuration is beautiful since:
 * - 1 &lt;= heights[i] &lt;= maxHeights[i]  
 * - heights is a mountain of peak i = 0.
 * It can be shown that there exists no other beautiful configuration with a sum of heights greater than 13.
 *
 * Example 2:
 *
 * Input: maxHeights = [6,5,3,9,2,7]
 * Output: 22
 * Explanation: One beautiful configuration with a maximum sum is heights = [3,3,3,9,2,2]. This configuration is beautiful since:
 * - 1 &lt;= heights[i] &lt;= maxHeights[i]
 * - heights is a mountain of peak i = 3.
 * It can be shown that there exists no other beautiful configuration with a sum of heights greater than 22.
 *
 * Example 3:
 *
 * Input: maxHeights = [3,2,5,5,2,3]
 * Output: 18
 * Explanation: One beautiful configuration with a maximum sum is heights = [2,2,5,5,2,2]. This configuration is beautiful since:
 * - 1 &lt;= heights[i] &lt;= maxHeights[i]
 * - heights is a mountain of peak i = 2. 
 * Note that, for this configuration, i = 3 can also be considered a peak.
 * It can be shown that there exists no other beautiful configuration with a sum of heights greater than 18.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == maxHeights.length &lt;= 105
 *
 * 1 &lt;= maxHeights[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try all the possible indices <code>i</code> as the peak.
 * Hint 2: Let <code>left[i]</code> be the maximum sum of heights for the prefix <code>0, …, i</code> when index <code>i</code> is the peak.
 * Hint 3: Let <code>right[i]</code> be the maximum sum of heights for suffix <code>i, …, (n - 1)</code> when <code>i</code> is the peak
 * Hint 4: Compute values of <code>left[i]</code> from left to right using DP.
For each <code>i</code> from <code>0</code> to <code>n - 1</code>, <code>left[i] = maxHeights * (i - j) + answer[j]</code>, where <code>j</code> is the rightmost index to the left of <code>i</code> such that <code>maxHeights[j] &lt; maxHeights[i]</code>.
 * Hint 5: For each <code>i</code> from <code>n - 1</code> to <code>0</code>, <code>right[i] = maxHeights * (j - i) + answer[j]</code>, where <code>j</code> is the leftmost index to the right of <code>i</code> such that <code>maxHeights[j] &lt; maxHeights[i]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Stack, Monotonic Stack).
 *
 * @see <a href="https://leetcode.com/problems/beautiful-towers-ii/">LeetCode #2866</a>
 */
public class BeautifulTowersIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Beautiful Towers II");
    }

    public static void main(String[] args) {
        System.out.println("=== BeautifulTowersIi ===");
        BeautifulTowersIi sol = new BeautifulTowersIi();
        System.out.println(sol.solve(null));
    }
}
