package org.leetcode.hard;


/**
 * <b>#1964 - Find the Longest Valid Obstacle Course at Each Position</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Binary Indexed Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You want to build some obstacle courses. You are given a 0-indexed integer array obstacles of length n, where obstacles[i] describes the height of the ith obstacle.
 *
 *
 * For every index i between 0 and n - 1 (inclusive), find the length of the longest obstacle course in obstacles such that:
 *
 *
 * You choose any number of obstacles between 0 and i inclusive.
 *
 * You must include the ith obstacle in the course.
 *
 * You must put the chosen obstacles in the same order as they appear in obstacles.
 *
 * Every obstacle (except the first) is taller than or the same height as the obstacle immediately before it.
 *
 * Return an array ans of length n, where ans[i] is the length of the longest obstacle course for index i as described above.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: obstacles = [1,2,3,2]
 * Output: [1,2,3,3]
 * Explanation: The longest valid obstacle course at each position is:
 * - i = 0: [1], [1] has length 1.
 * - i = 1: [1,2], [1,2] has length 2.
 * - i = 2: [1,2,3], [1,2,3] has length 3.
 * - i = 3: [1,2,3,2], [1,2,2] has length 3.
 *
 * Example 2:
 *
 * Input: obstacles = [2,2,1]
 * Output: [1,2,1]
 * Explanation: The longest valid obstacle course at each position is:
 * - i = 0: [2], [2] has length 1.
 * - i = 1: [2,2], [2,2] has length 2.
 * - i = 2: [2,2,1], [1] has length 1.
 *
 * Example 3:
 *
 * Input: obstacles = [3,1,5,6,4,2]
 * Output: [1,1,2,3,2,2]
 * Explanation: The longest valid obstacle course at each position is:
 * - i = 0: [3], [3] has length 1.
 * - i = 1: [3,1], [1] has length 1.
 * - i = 2: [3,1,5], [3,5] has length 2. [1,5] is also valid.
 * - i = 3: [3,1,5,6], [3,5,6] has length 3. [1,5,6] is also valid.
 * - i = 4: [3,1,5,6,4], [3,4] has length 2. [1,4] is also valid.
 * - i = 5: [3,1,5,6,4,2], [1,2] has length 2.
 *
 *
 *
 * Constraints:
 *
 *
 * n == obstacles.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= obstacles[i] &lt;= 107
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you keep track of the minimum height for each obstacle course length?
 * Hint 2: You can use binary search to find the longest previous obstacle course length that satisfies the conditions.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Binary Indexed Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-the-longest-valid-obstacle-course-at-each-position/">LeetCode #1964</a>
 */
public class FindTheLongestValidObstacleCourseAtEachPosition {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Longest Valid Obstacle Course at Each Position");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindTheLongestValidObstacleCourseAtEachPosition ===");
        FindTheLongestValidObstacleCourseAtEachPosition sol = new FindTheLongestValidObstacleCourseAtEachPosition();
        System.out.println(sol.solve(null));
    }
}
