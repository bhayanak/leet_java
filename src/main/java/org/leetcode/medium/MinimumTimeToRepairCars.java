package org.leetcode.medium;


/**
 * <b>#2594 - Minimum Time to Repair Cars</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array ranks representing the ranks of some mechanics. ranksi is the rank of the ith mechanic. A mechanic with a rank r can repair n cars in r * n2 minutes.
 *
 *
 * You are also given an integer cars representing the total number of cars waiting in the garage to be repaired.
 *
 *
 * Return the minimum time taken to repair all the cars.
 *
 *
 * Note: All the mechanics can repair the cars simultaneously.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: ranks = [4,2,3,1], cars = 10
 * Output: 16
 * Explanation: 
 * - The first mechanic will repair two cars. The time required is 4 * 2 * 2 = 16 minutes.
 * - The second mechanic will repair two cars. The time required is 2 * 2 * 2 = 8 minutes.
 * - The third mechanic will repair two cars. The time required is 3 * 2 * 2 = 12 minutes.
 * - The fourth mechanic will repair four cars. The time required is 1 * 4 * 4 = 16 minutes.
 * It can be proved that the cars cannot be repaired in less than 16 minutes.​​​​​
 *
 * Example 2:
 *
 * Input: ranks = [5,1,8], cars = 6
 * Output: 16
 * Explanation: 
 * - The first mechanic will repair one car. The time required is 5 * 1 * 1 = 5 minutes.
 * - The second mechanic will repair four cars. The time required is 1 * 4 * 4 = 16 minutes.
 * - The third mechanic will repair one car. The time required is 8 * 1 * 1 = 8 minutes.
 * It can be proved that the cars cannot be repaired in less than 16 minutes.​​​​​
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= ranks.length &lt;= 105
 *
 * 1 &lt;= ranks[i] &lt;= 100
 *
 * 1 &lt;= cars &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For a predefined fixed time, can all the cars be repaired?
 * Hint 2: Try using binary search on the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search).
 *
 * @see <a href="https://leetcode.com/problems/minimum-time-to-repair-cars/">LeetCode #2594</a>
 */
public class MinimumTimeToRepairCars {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Time to Repair Cars");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumTimeToRepairCars ===");
        MinimumTimeToRepairCars sol = new MinimumTimeToRepairCars();
        System.out.println(sol.solve(null));
    }
}
