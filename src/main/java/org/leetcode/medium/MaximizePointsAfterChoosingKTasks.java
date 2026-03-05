package org.leetcode.medium;


/**
 * <b>#3767 - Maximize Points After Choosing K Tasks</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays, technique1 and technique2, each of length n, where n represents the number of tasks to complete.
 *
 *
 * If the ith task is completed using technique 1, you earn technique1[i] points.
 *
 * If it is completed using technique 2, you earn technique2[i] points.
 *
 * You are also given an integer k, representing the minimum number of tasks that must be completed using technique 1.
 *
 *
 * You must complete at least k tasks using technique 1 (they do not need to be the first k tasks).
 *
 *
 * The remaining tasks may be completed using either technique.
 *
 *
 * Return an integer denoting the maximum total points you can earn.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: technique1 = [5,2,10], technique2 = [10,3,8], k = 2
 *
 *
 * Output: 22
 *
 *
 * Explanation:
 *
 *
 * We must complete at least k = 2 tasks using technique1.
 *
 *
 * Choosing technique1[1] and technique1[2] (completed using technique 1), and technique2[0] (completed using technique 2), yields the maximum points: 2 + 10 + 10 = 22.
 *
 * Example 2:
 *
 * Input: technique1 = [10,20,30], technique2 = [5,15,25], k = 2
 *
 *
 * Output: 60
 *
 *
 * Explanation:
 *
 *
 * We must complete at least k = 2 tasks using technique1.
 *
 *
 * Choosing all tasks using technique 1 yields the maximum points: 10 + 20 + 30 = 60.
 *
 * Example 3:
 *
 * Input: technique1 = [1,2,3], technique2 = [4,5,6], k = 0
 *
 *
 * Output: 15
 *
 *
 * Explanation:
 *
 *
 * Since k = 0, we are not required to choose any task using technique1.
 *
 *
 * Choosing all tasks using technique 2 yields the maximum points: 4 + 5 + 6 = 15.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == technique1.length == technique2.length &lt;= 105
 *
 * 1 &lt;= technique1[i], technique2​​​​​​​[i] &lt;= 10​​​​​​​5
 *
 * 0 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Initially complete all tasks using way 1; let the initial total be <code>sum(reward1)</code>.
 * Hint 2: The delta when switching task <code>i</code> from way 1 to way 2 is <code>reward2[i] - reward1[i]</code>.
 * Hint 3: Sort deltas descending and apply the largest <code>n - k</code>; after each switch update the maximum.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/maximize-points-after-choosing-k-tasks/">LeetCode #3767</a>
 */
public class MaximizePointsAfterChoosingKTasks {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize Points After Choosing K Tasks");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizePointsAfterChoosingKTasks ===");
        MaximizePointsAfterChoosingKTasks sol = new MaximizePointsAfterChoosingKTasks();
        System.out.println(sol.solve(null));
    }
}
