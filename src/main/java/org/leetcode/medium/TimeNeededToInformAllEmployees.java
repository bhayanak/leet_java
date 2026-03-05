package org.leetcode.medium;


/**
 * <b>#1376 - Time Needed to Inform All Employees</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Breadth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A company has n employees with a unique ID for each employee from 0 to n - 1. The head of the company is the one with headID.
 *
 *
 * Each employee has one direct manager given in the manager array where manager[i] is the direct manager of the i-th employee, manager[headID] = -1. Also, it is guaranteed that the subordination relationships have a tree structure.
 *
 *
 * The head of the company wants to inform all the company employees of an urgent piece of news. He will inform his direct subordinates, and they will inform their subordinates, and so on until all employees know about the urgent news.
 *
 *
 * The i-th employee needs informTime[i] minutes to inform all of his direct subordinates (i.e., After informTime[i] minutes, all his direct subordinates can start spreading the news).
 *
 *
 * Return the number of minutes needed to inform all the employees about the urgent news.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1, headID = 0, manager = [-1], informTime = [0]
 * Output: 0
 * Explanation: The head of the company is the only employee in the company.
 *
 * Example 2:
 *
 * Input: n = 6, headID = 2, manager = [2,2,-1,2,2,2], informTime = [0,0,1,0,0,0]
 * Output: 1
 * Explanation: The head of the company with id = 2 is the direct manager of all the employees in the company and needs 1 minute to inform them all.
 * The tree structure of the employees in the company is shown.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 105
 *
 * 0 &lt;= headID &lt; n
 *
 * manager.length == n
 *
 * 0 &lt;= manager[i] &lt; n
 *
 * manager[headID] == -1
 *
 * informTime.length == n
 *
 * 0 &lt;= informTime[i] &lt;= 1000
 *
 * informTime[i] == 0 if employee i has no subordinates.
 *
 * It is guaranteed that all the employees can be informed.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The company can be represented as a tree, headID is always the root.
 * Hint 2: Store for each node the time needed to be informed of the news.
 * Hint 3: Answer is the max time a leaf node needs to be informed.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Breadth-First Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/time-needed-to-inform-all-employees/">LeetCode #1376</a>
 */
public class TimeNeededToInformAllEmployees {

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
        throw new UnsupportedOperationException("Not yet implemented: Time Needed to Inform All Employees");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== TimeNeededToInformAllEmployees ===");
        TimeNeededToInformAllEmployees sol = new TimeNeededToInformAllEmployees();
        System.out.println(sol.solve(null));
    }
}
