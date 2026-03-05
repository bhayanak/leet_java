package org.leetcode.hard;


/**
 * <b>#2141 - Maximum Running Time of N Computers</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have n computers. You are given the integer n and a 0-indexed integer array batteries where the ith battery can run a computer for batteries[i] minutes. You are interested in running all n computers simultaneously using the given batteries.
 *
 *
 * Initially, you can insert at most one battery into each computer. After that and at any integer time moment, you can remove a battery from a computer and insert another battery any number of times. The inserted battery can be a totally new battery or a battery from another computer. You may assume that the removing and inserting processes take no time.
 *
 *
 * Note that the batteries cannot be recharged.
 *
 *
 * Return the maximum number of minutes you can run all the n computers simultaneously.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, batteries = [3,3,3]
 * Output: 4
 * Explanation: 
 * Initially, insert battery 0 into the first computer and battery 1 into the second computer.
 * After two minutes, remove battery 1 from the second computer and insert battery 2 instead. Note that battery 1 can still run for one minute.
 * At the end of the third minute, battery 0 is drained, and you need to remove it from the first computer and insert battery 1 instead.
 * By the end of the fourth minute, battery 1 is also drained, and the first computer is no longer running.
 * We can run the two computers simultaneously for at most 4 minutes, so we return 4.
 *
 * Example 2:
 *
 * Input: n = 2, batteries = [1,1,1,1]
 * Output: 2
 * Explanation: 
 * Initially, insert battery 0 into the first computer and battery 2 into the second computer. 
 * After one minute, battery 0 and battery 2 are drained so you need to remove them and insert battery 1 into the first computer and battery 3 into the second computer. 
 * After another minute, battery 1 and battery 3 are also drained so the first and second computers are no longer running.
 * We can run the two computers simultaneously for at most 2 minutes, so we return 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= batteries.length &lt;= 105
 *
 * 1 &lt;= batteries[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For a given running time, can you determine if it is possible to run all n computers simultaneously?
 * Hint 2: Try to use Binary Search to find the maximal running time
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximum-running-time-of-n-computers/">LeetCode #2141</a>
 */
public class MaximumRunningTimeOfNComputers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Running Time of N Computers");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumRunningTimeOfNComputers ===");
        MaximumRunningTimeOfNComputers sol = new MaximumRunningTimeOfNComputers();
        System.out.println(sol.solve(null));
    }
}
