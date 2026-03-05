package org.leetcode.medium;


/**
 * <b>#2929 - Distribute Candies Among Children II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Combinatorics, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two positive integers n and limit.
 *
 *
 * Return the total number of ways to distribute n candies among 3 children such that no child gets more than limit candies.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, limit = 2
 * Output: 3
 * Explanation: There are 3 ways to distribute 5 candies such that no child gets more than 2 candies: (1, 2, 2), (2, 1, 2) and (2, 2, 1).
 *
 * Example 2:
 *
 * Input: n = 3, limit = 3
 * Output: 10
 * Explanation: There are 10 ways to distribute 3 candies such that no child gets more than 3 candies: (0, 0, 3), (0, 1, 2), (0, 2, 1), (0, 3, 0), (1, 0, 2), (1, 1, 1), (1, 2, 0), (2, 0, 1), (2, 1, 0) and (3, 0, 0).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 106
 *
 * 1 &lt;= limit &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can enumerate the number of candies of one particular child, let it be <code>i</code> which means <code>0 &lt;= i &lt;= min(limit, n)</code>.
 * Hint 2: Suppose the 2nd child gets <code>j</code> candies. Then <code>0 &lt;= j &lt;= limit</code> and <code>i + j &lt;= n</code>.
 * Hint 3: The 3rd child will hence get <code>n - i - j</code> candies and we should have <code>0 &lt;= n - i - j &lt;= limit</code>.
 * Hint 4: After some transformations, for each <code>i</code>, we have <code>max(0, n - i - limit) &lt;= j &lt;= min(limit, n - i)</code>, each <code>j</code> corresponding to a solution.
So the number of solutions for some <code>i</code> is <code>max(min(limit, n - i) - max(0, n - i - limit) + 1, 0)</code>. Sum the expression for every <code>i</code> in <code>[0, min(n, limit)]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Combinatorics, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/distribute-candies-among-children-ii/">LeetCode #2929</a>
 */
public class DistributeCandiesAmongChildrenIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Distribute Candies Among Children II");
    }

    public static void main(String[] args) {
        System.out.println("=== DistributeCandiesAmongChildrenIi ===");
        DistributeCandiesAmongChildrenIi sol = new DistributeCandiesAmongChildrenIi();
        System.out.println(sol.solve(null));
    }
}
