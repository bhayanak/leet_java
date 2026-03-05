package org.leetcode.medium;


/**
 * <b>#990 - Satisfiability of Equality Equations</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Union-Find, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of strings equations that represent relationships between variables where each string equations[i] is of length 4 and takes one of two different forms: "xi==yi" or "xi!=yi".Here, xi and yi are lowercase letters (not necessarily different) that represent one-letter variable names.
 *
 *
 * Return true if it is possible to assign integers to variable names so as to satisfy all the given equations, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: equations = ["a==b","b!=a"]
 * Output: false
 * Explanation: If we assign say, a = 1 and b = 1, then the first equation is satisfied, but not the second.
 * There is no way to assign the variables to satisfy both equations.
 *
 * Example 2:
 *
 * Input: equations = ["b==a","a==b"]
 * Output: true
 * Explanation: We could assign a = 1 and b = 1 to satisfy both equations.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= equations.length &lt;= 500
 *
 * equations[i].length == 4
 *
 * equations[i][0] is a lowercase letter.
 *
 * equations[i][1] is either '=' or '!'.
 *
 * equations[i][2] is '='.
 *
 * equations[i][3] is a lowercase letter.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Union-Find, Graph Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/satisfiability-of-equality-equations/">LeetCode #990</a>
 */
public class SatisfiabilityOfEqualityEquations {

    /**
     * TODO: Implement "Satisfiability of Equality Equations".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Satisfiability of Equality Equations");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SatisfiabilityOfEqualityEquations.java &amp;&amp; java org.leetcode.medium.SatisfiabilityOfEqualityEquations</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SatisfiabilityOfEqualityEquations ===");
        SatisfiabilityOfEqualityEquations sol = new SatisfiabilityOfEqualityEquations();
        System.out.println(sol.solve(null));
    }
}
