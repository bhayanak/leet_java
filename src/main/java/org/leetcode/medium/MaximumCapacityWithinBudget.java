package org.leetcode.medium;


/**
 * <b>#3814 - Maximum Capacity Within Budget</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays costs and capacity, both of length n, where costs[i] represents the purchase cost of the ith machine and capacity[i] represents its performance capacity.
 *
 *
 * You are also given an integer budget.
 *
 *
 * You may select at most two distinct machines such that the total cost of the selected machines is strictly less than budget.
 *
 *
 * Return the maximum achievable total capacity of the selected machines.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: costs = [4,8,5,3], capacity = [1,5,2,7], budget = 8
 *
 *
 * Output: 8
 *
 *
 * Explanation:
 *
 *
 * Choose two machines with costs[0] = 4 and costs[3] = 3.
 *
 * The total cost is 4 + 3 = 7, which is strictly less than budget = 8.
 *
 * The maximum total capacity is capacity[0] + capacity[3] = 1 + 7 = 8.
 *
 * Example 2:
 *
 * Input: costs = [3,5,7,4], capacity = [2,4,3,6], budget = 7
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * Choose one machine with costs[3] = 4.
 *
 * The total cost is 4, which is strictly less than budget = 7.
 *
 * The maximum total capacity is capacity[3] = 6.
 *
 * Example 3:
 *
 * Input: costs = [2,2,2], capacity = [3,5,4], budget = 5
 *
 *
 * Output: 9
 *
 *
 * Explanation:
 *
 *
 * Choose two machines with costs[1] = 2 and costs[2] = 2.
 *
 * The total cost is 2 + 2 = 4, which is strictly less than budget = 5.
 *
 * The maximum total capacity is capacity[1] + capacity[2] = 5 + 4 = 9.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == costs.length == capacity.length &lt;= 105
 *
 * 1 &lt;= costs[i], capacity[i] &lt;= 105
 *
 * 1 &lt;= budget &lt;= 2 * 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort machines by increasing <code>costs</code>, keeping <code>capacity</code> aligned.
 * Hint 2: Build a prefix array where <code>prefMax[i]</code> stores the maximum <code>capacity</code> among machines with index <code>&lt;= i</code>.
 * Hint 3: For selecting one machine, take the maximum <code>capacity</code> among all machines with <code>cost &lt; budget</code>.
 * Hint 4: For selecting two machines, fix machine <code>i</code> and binary search the largest index <code>j &lt; i</code> with <code>costs[j] &lt; budget - costs[i]</code>.
 * Hint 5: Update the answer with <code>capacity[i] + prefMax[j]</code> whenever such <code>j</code> exists.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximum-capacity-within-budget/">LeetCode #3814</a>
 */
public class MaximumCapacityWithinBudget {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Capacity Within Budget");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumCapacityWithinBudget ===");
        MaximumCapacityWithinBudget sol = new MaximumCapacityWithinBudget();
        System.out.println(sol.solve(null));
    }
}
