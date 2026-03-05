package org.leetcode.medium;


/**
 * <b>#1953 - Maximum Number of Weeks for Which You Can Work</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n projects numbered from 0 to n - 1. You are given an integer array milestones where each milestones[i] denotes the number of milestones the ith project has.
 *
 *
 * You can work on the projects following these two rules:
 *
 *
 * Every week, you will finish exactly one milestone of one project. You must work every week.
 *
 * You cannot work on two milestones from the same project for two consecutive weeks.
 *
 * Once all the milestones of all the projects are finished, or if the only milestones that you can work on will cause you to violate the above rules, you will stop working. Note that you may not be able to finish every project's milestones due to these constraints.
 *
 *
 * Return the maximum number of weeks you would be able to work on the projects without violating the rules mentioned above.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: milestones = [1,2,3]
 * Output: 6
 * Explanation: One possible scenario is:
 * ​​​​- During the 1st week, you will work on a milestone of project 0.
 * - During the 2nd week, you will work on a milestone of project 2.
 * - During the 3rd week, you will work on a milestone of project 1.
 * - During the 4th week, you will work on a milestone of project 2.
 * - During the 5th week, you will work on a milestone of project 1.
 * - During the 6th week, you will work on a milestone of project 2.
 * The total number of weeks is 6.
 *
 * Example 2:
 *
 * Input: milestones = [5,2,1]
 * Output: 7
 * Explanation: One possible scenario is:
 * - During the 1st week, you will work on a milestone of project 0.
 * - During the 2nd week, you will work on a milestone of project 1.
 * - During the 3rd week, you will work on a milestone of project 0.
 * - During the 4th week, you will work on a milestone of project 1.
 * - During the 5th week, you will work on a milestone of project 0.
 * - During the 6th week, you will work on a milestone of project 2.
 * - During the 7th week, you will work on a milestone of project 0.
 * The total number of weeks is 7.
 * Note that you cannot work on the last milestone of project 0 on 8th week because it would violate the rules.
 * Thus, one milestone in project 0 will remain unfinished.
 *
 *
 *
 * Constraints:
 *
 *
 * n == milestones.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= milestones[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Work on the project with the largest number of milestones as long as it is possible.
 * Hint 2: Does the project with the largest number of milestones affect the number of weeks?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-weeks-for-which-you-can-work/">LeetCode #1953</a>
 */
public class MaximumNumberOfWeeksForWhichYouCanWork {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Weeks for Which You Can Work");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfWeeksForWhichYouCanWork ===");
        MaximumNumberOfWeeksForWhichYouCanWork sol = new MaximumNumberOfWeeksForWhichYouCanWork();
        System.out.println(sol.solve(null));
    }
}
