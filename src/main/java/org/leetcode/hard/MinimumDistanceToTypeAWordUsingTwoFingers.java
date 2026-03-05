package org.leetcode.hard;


/**
 * <b>#1320 - Minimum Distance to Type a Word Using Two Fingers</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have a keyboard layout as shown above in the X-Y plane, where each English uppercase letter is located at some coordinate.
 *
 *
 * For example, the letter 'A' is located at coordinate (0, 0), the letter 'B' is located at coordinate (0, 1), the letter 'P' is located at coordinate (2, 3) and the letter 'Z' is located at coordinate (4, 1).
 *
 * Given the string word, return the minimum total distance to type such string using only two fingers.
 *
 *
 * The distance between coordinates (x1, y1) and (x2, y2) is |x1 - x2| + |y1 - y2|.
 *
 *
 * Note that the initial positions of your two fingers are considered free so do not count towards your total distance, also your two fingers do not have to start at the first letter or the first two letters.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "CAKE"
 * Output: 3
 * Explanation: Using two fingers, one optimal way to type "CAKE" is: 
 * Finger 1 on letter 'C' -&gt; cost = 0 
 * Finger 1 on letter 'A' -&gt; cost = Distance from letter 'C' to letter 'A' = 2 
 * Finger 2 on letter 'K' -&gt; cost = 0 
 * Finger 2 on letter 'E' -&gt; cost = Distance from letter 'K' to letter 'E' = 1 
 * Total distance = 3
 *
 * Example 2:
 *
 * Input: word = "HAPPY"
 * Output: 6
 * Explanation: Using two fingers, one optimal way to type "HAPPY" is:
 * Finger 1 on letter 'H' -&gt; cost = 0
 * Finger 1 on letter 'A' -&gt; cost = Distance from letter 'H' to letter 'A' = 2
 * Finger 2 on letter 'P' -&gt; cost = 0
 * Finger 2 on letter 'P' -&gt; cost = Distance from letter 'P' to letter 'P' = 0
 * Finger 1 on letter 'Y' -&gt; cost = Distance from letter 'A' to letter 'Y' = 4
 * Total distance = 6
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= word.length &lt;= 300
 *
 * word consists of uppercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: dp[i][j][k]: smallest movements when you have one finger on i-th char and the other one on j-th char already having written k first characters from word.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-distance-to-type-a-word-using-two-fingers/">LeetCode #1320</a>
 */
public class MinimumDistanceToTypeAWordUsingTwoFingers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Distance to Type a Word Using Two Fingers");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumDistanceToTypeAWordUsingTwoFingers ===");
        MinimumDistanceToTypeAWordUsingTwoFingers sol = new MinimumDistanceToTypeAWordUsingTwoFingers();
        System.out.println(sol.solve(null));
    }
}
