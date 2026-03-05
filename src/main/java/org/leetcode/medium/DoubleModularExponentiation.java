package org.leetcode.medium;


/**
 * <b>#2961 - Double Modular Exponentiation</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed 2D array variables where variables[i] = [ai, bi, ci, mi], and an integer target.
 *
 *
 * An index i is good if the following formula holds:
 *
 *
 * 0 &lt;= i &lt; variables.length
 *
 * ((aibi % 10)ci) % mi == target
 *
 * Return an array consisting of good indices in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: variables = [[2,3,3,10],[3,3,3,1],[6,1,1,4]], target = 2
 * Output: [0,2]
 * Explanation: For each index i in the variables array:
 * 1) For the index 0, variables[0] = [2,3,3,10], (23 % 10)3 % 10 = 2.
 * 2) For the index 1, variables[1] = [3,3,3,1], (33 % 10)3 % 1 = 0.
 * 3) For the index 2, variables[2] = [6,1,1,4], (61 % 10)1 % 4 = 2.
 * Therefore we return [0,2] as the answer.
 *
 * Example 2:
 *
 * Input: variables = [[39,3,1000,1000]], target = 17
 * Output: []
 * Explanation: For each index i in the variables array:
 * 1) For the index 0, variables[0] = [39,3,1000,1000], (393 % 10)1000 % 1000 = 1.
 * Therefore we return [] as the answer.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= variables.length &lt;= 100
 *
 * variables[i] == [ai, bi, ci, mi]
 *
 * 1 &lt;= ai, bi, ci, mi &lt;= 103
 *
 * 0 &lt;= target &lt;= 103
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/double-modular-exponentiation/">LeetCode #2961</a>
 */
public class DoubleModularExponentiation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Double Modular Exponentiation");
    }

    public static void main(String[] args) {
        System.out.println("=== DoubleModularExponentiation ===");
        DoubleModularExponentiation sol = new DoubleModularExponentiation();
        System.out.println(sol.solve(null));
    }
}
